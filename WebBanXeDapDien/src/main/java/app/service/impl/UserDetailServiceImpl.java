package app.service.impl;

import app.model.AccountEntity;
import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServiceImpl extends BaseServiceImpl implements UserDetailsService {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(UserDetailServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AccountEntity accountEntity = accountDao.findByEmail(s);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(accountEntity.getRoleEntity().getName()));
        User user = new User(accountEntity.getEmail(), accountEntity.getPassWord(), grantedAuthorities);
        return user;
    }
}
