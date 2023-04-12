package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface Services {
    public User findById(Long id);
    public List<User> findAll();
    public void deleteById(Long id);
    void saveUser(User user);
}
