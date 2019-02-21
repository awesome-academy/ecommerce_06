package app.dao;

import app.model.SupplierEntity;
import java.util.*;

public interface SuppilerDao extends BaseDAO<Integer, SupplierEntity> {
    List<SupplierEntity>  findAll();
    SupplierEntity getSupplierByName(String name);
}
