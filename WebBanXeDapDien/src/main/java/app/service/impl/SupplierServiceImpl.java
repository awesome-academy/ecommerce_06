package app.service.impl;

import app.Utils.ObjectMapperUtils;
import app.bean.Supplier;
import app.model.SupplierEntity;
import app.service.SupplierService;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import java.io.Serializable;
import java.util.List;

public class SupplierServiceImpl extends BaseServiceImpl implements SupplierService {
    private static final Logger logger = Logger.getLogger(SupplierServiceImpl.class);

    @Override
    public SupplierEntity findById(Serializable key) {
        try {
            return suppilerDao.findById(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public SupplierEntity saveOrUpdate(SupplierEntity entity) {
        try {
            return suppilerDao.saveOrUpdate(entity);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public boolean delete(SupplierEntity entity) {
        try {
            SupplierEntity supplierEntity = suppilerDao.findByIdUsingLock(entity.getId(), LockMode.PESSIMISTIC_WRITE);
            if (supplierEntity == null) {
                return false;
            } else {
                suppilerDao.delete(entity);
                return true;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Supplier> findAll() {
        try {
            List<SupplierEntity> supplierEntities = suppilerDao.findAll();
            List<Supplier> suppliers = ObjectMapperUtils.mapAll(supplierEntities, Supplier.class);
            return suppliers;
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }

    }
}
