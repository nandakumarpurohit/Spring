package com.demo.dao;

import java.util.List;

import com.demo.model.User;

/**
 * @author vincent
 *
 */
public interface UserDao {
   void save(User user);
   List<User> list();
}
