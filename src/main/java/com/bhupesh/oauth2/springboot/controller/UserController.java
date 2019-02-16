package com.bhupesh.oauth2.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhupesh.oauth2.springboot.model.User;
import com.bhupesh.oauth2.springboot.repository.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {

    //@Autowired
    //private UserService userService;
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(){
        //return userService.findAll();
    	return userRepository.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        //return userService.save(user);
    	return userRepository.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
    	userRepository.delete(id);
        return "success";
    }

}