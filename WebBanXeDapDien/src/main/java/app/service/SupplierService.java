package app.service;

import app.bean.Supplier;
import app.model.SupplierEntity;
import java.util.List;

public interface SupplierService extends BaseService<Integer, SupplierEntity> {
    List<Supplier> findAll();
}
