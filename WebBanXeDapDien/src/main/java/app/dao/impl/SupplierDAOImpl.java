package app.dao.impl;

import app.dao.SuppilerDao;
import app.model.SupplierEntity;
import java.util.List;

public class SupplierDAOImpl extends GenericDAO<Integer, SupplierEntity> implements SuppilerDao {
    @Override
    public List<SupplierEntity> findAll() {
        return getSession().createQuery("From SupplierEntity").getResultList();
    }
}
