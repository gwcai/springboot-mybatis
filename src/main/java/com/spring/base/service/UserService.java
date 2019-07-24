package com.spring.base.service;

import com.spring.base.dao.UserDao;
import com.spring.base.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author FUDIAN
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**只读数据，提高效率
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User getUserById(String id){
        return userDao.getUserById(id);
    }

    /**
     * 插入数据
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {})
    public int insert(User user) {
        return userDao.insert(user);
    }
}
