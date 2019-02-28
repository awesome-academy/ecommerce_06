package app.Utils;

import app.bean.*;
import app.bean.Color;
import app.model.*;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectMapperUtils {
    private static ModelMapper modelMapper = new ModelMapper();
    private static final Logger logger = Logger.getLogger(ObjectMapperUtils.class);

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    private ObjectMapperUtils() {
    }

    public static <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }

    public static <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {

        return entityList.stream()
                .map(entity -> map(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D map(final S source, D destination) {
        modelMapper.map(source, destination);
        return destination;
    }

    public static Product productMap(ProductEntity ProductEntity) {
        Product productMap = map(ProductEntity, Product.class);
        Supplier supplierMap = map(ProductEntity.getSupplierEntity(), Supplier.class);
        Stream<ProductColor> productColorStream = ProductEntity.getProductColorEntities().stream().map(new Function<ProductColorEntity, ProductColor>() {
            @Override
            public ProductColor apply(ProductColorEntity productColorEntity) {
                ProductColor productColor = new ProductColor();
                productColor.setProductId(productColorEntity.getProductEntity().getId());
                productColor.setAmount(productColorEntity.getAmount());
                productColor.setColor(Color.values()[productColorEntity.getColor()]);
                return productColor;
            }
        });
        List<Image> images = mapAll(ProductEntity.getImageEntities(), Image.class);
        productMap.setProductColors(productColorStream.collect(Collectors.toList()));
        productMap.setSupplier(supplierMap);
        productMap.setImages(images);
        return productMap;
    }

    public static OrderDetail OrderDetailMap(Cart cart) {
        logger.info("orderdetailmap: ");
        OrderDetail orderDetail = new OrderDetail();
        Product product = new Product();
        product.setId(cart.getProductId());
        orderDetail.setProduct(product);
        orderDetail.setProductColor(Color.getColor(cart.getProductColor()));
        orderDetail.setAmount(cart.getQuantity());
        orderDetail.setPrice(cart.getProductPrice());
        logger.info("OrderDetailMap" + orderDetail);
        return orderDetail;
    }

    public static List<OrderDetail> orderDetailsMap(List<Cart> carts) {
        Stream<OrderDetail> orderDetailStream = carts.stream().map(new Function<Cart, OrderDetail>() {
            @Override
            public OrderDetail apply(Cart cart) {
                return OrderDetailMap(cart);
            }
        });
        return orderDetailStream.collect(Collectors.toList());
    }

    public static OrderDetailEntity orderDetailEntityMap(OrderDetail orderDetail) {
        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
        OrderDetailEntityPK orderDetailEntityPK = new OrderDetailEntityPK();

        orderDetailEntityPK.setColor((short) orderDetail.getProductColor().ordinal());
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(orderDetail.getProduct().getId());
        orderDetailEntityPK.setProductEntity(productEntity);
        orderDetailEntity.setOrderDetailEntityPK(orderDetailEntityPK);
        orderDetailEntity.setAmount(orderDetail.getAmount());
        orderDetailEntity.setPrice(orderDetail.getPrice());
        return orderDetailEntity;
    }

    public static OrderEntity orderEntityMap(Order order) {
        OrderEntity orderEntity = map(order, OrderEntity.class);
        logger.info(orderEntity);
        return orderEntity;
    }

    public static List<OrderDetailEntity> orderDetailsEntityMap(List<OrderDetail> orderDetails) {
        Stream<OrderDetailEntity> orderDetailEntityStream = orderDetails.stream().map(new Function<OrderDetail, OrderDetailEntity>() {
            @Override
            public OrderDetailEntity apply(OrderDetail orderDetail) {
                OrderDetailEntity orderDetailEntity = orderDetailEntityMap(orderDetail);
                logger.info(orderDetailEntity);
                return orderDetailEntity;
            }
        });
        return orderDetailEntityStream.collect(Collectors.toList());

    }

    public static OrderDetail orderDetailMap(OrderDetailEntity orderDetailEntity) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setPrice(orderDetailEntity.getPrice());
        orderDetail.setAmount(orderDetailEntity.getAmount());
        orderDetail.setProduct(productMap(orderDetailEntity.getOrderDetailEntityPK().getProductEntity()));
        orderDetail.setProductColor(Color.values()[orderDetailEntity.getOrderDetailEntityPK().getColor()]);
        orderDetail.setOrder(map(orderDetailEntity.getOrderDetailEntityPK().getOrderEntity(), Order.class));
        return orderDetail;
    }

    public static Order orderMap(OrderEntity orderEntity) {
        Order order = map(orderEntity, Order.class);
        List<OrderDetail> orderDetails = orderEntity.getOrderDetailEntities().stream().map(new Function<OrderDetailEntity, OrderDetail>() {

            @Override
            public OrderDetail apply(OrderDetailEntity orderDetailEntity) {
                OrderDetail orderDetail = orderDetailMap(orderDetailEntity);
                return orderDetail;
            }
        }).collect(Collectors.toList());
        order.setOrderDetails(orderDetails);
        return order;
    }
}