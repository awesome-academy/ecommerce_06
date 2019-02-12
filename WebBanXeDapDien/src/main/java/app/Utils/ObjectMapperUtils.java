package app.Utils;
import app.bean.*;
import app.model.ProductColorEntity;
import app.model.ProductEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ObjectMapperUtils {
    private static ModelMapper modelMapper = new ModelMapper();
    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    private ObjectMapperUtils() {
    }

    /**
     * <p>Note: outClass object must have default constructor with no arguments</p>
     *
     * @param <D>      type of result object.
     * @param <T>      type of source object to map from.
     * @param entity   entity that needs to be mapped.
     * @param outClass class of result object.
     * @return new object of <code>outClass</code> type.
     */
    public static <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }

    /**
     * <p>Note: outClass object must have default constructor with no arguments</p>
     *
     * @param entityList list of entities that needs to be mapped
     * @param outCLass   class of result list element
     * @param <D>        type of objects in result list
     * @param <T>        type of entity in <code>entityList</code>
     * @return list of mapped object with <code><D></code> type.
     */
    public static <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> map(entity, outCLass))
                .collect(Collectors.toList());
    }

    /**
     * Maps {@code source} to {@code destination}.
     *
     * @param source      object to map from
     * @param destination object to map to
     */
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

}