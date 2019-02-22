package app.dao.impl;

import app.dao.AccountDao;
import app.model.AccountEntity;

public class AccountDAOImpl extends GenericDAO<Integer, AccountEntity> implements AccountDao {
    @Override
    public AccountEntity findByEmail(String email) {
        return (AccountEntity) getSession().createQuery("from AccountEntity A Where A.email = :email").setParameter("email", email).uniqueResult();
    }

}
