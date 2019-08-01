package com.spring.base.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.base.dao.UserDao;
import com.spring.base.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author FUDIAN
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public PageInfo selectAll(int pageIndex,int pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<User> users = userDao.selectAll();
        PageInfo page = new PageInfo(users);
        return page;
    }

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
