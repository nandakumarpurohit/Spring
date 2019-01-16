package com.demo.service;

import java.util.List;

import com.demo.model.User;

/**
 * @author vincent
 *
 */
public interface UserService {
   void save(User user);

   List<User> list();
}
