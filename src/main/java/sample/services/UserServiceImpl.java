/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.dao.UserDao;
import sample.models.User;

/**
 *
 * @author DJ
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    

    @Override
    public List<User> getListUser() {
        return userDao.getListUser();
    }

    @Override
    public void saveOrUpdate(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    
    
}
