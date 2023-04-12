package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Annotation;
import java.util.List;

@Service
public class UserService implements Services {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User findById(Long id) {
        return userRepository.getOne(id);
    }

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
