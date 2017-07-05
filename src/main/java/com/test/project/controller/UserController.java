package com.test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.project.model.User;
import com.test.project.model.UserDao;
import java.util.List;

@Controller
public class UserController {

  /**
   * GET /create  --> Create a new user and save it in the database.
   */
  @RequestMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String create(String email, String name) {
    String userId = "";
    try {
      User user = new User(email, name);
      userDao.save(user);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "User succesfully created with id = " + userId;
  }
  
  /**
   * GET /delete  --> Delete the user having the passed id.
   */
  @RequestMapping(value="/delete", produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String delete(long id) {
    try {
      User user = new User(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }
    return "User succesfully deleted!";
  }
  
  /**
   * GET /get-by-email  --> Return the id for the user having the passed
   * email.
   */
  @RequestMapping(value="/get-by-email", produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public List<User> getByEmail(String email) {
	  List<User> users;
    try {
      users = userDao.findByEmail(email);
      //userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return null;
    }
    return users;
  }
  
  /**
   * GET /update  --> Update the email and the name for the user in the 
   * database having the passed id.
   */
  @RequestMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String updateUser(long id, String email, String name) {
    try {
      User user = userDao.findOne(id);
      user.setEmail(email);
      user.setName(name);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }
    return "User succesfully updated!";
  }

  // Private fields

  @Autowired
  private UserDao userDao;
  
}