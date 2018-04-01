package io.ooc.project.service;

import io.ooc.project.model.User;
import io.ooc.project.repository.UserRepository;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(Integer userId) {
        return userRepository.findUserByUserId(userId);
    }

    @Override
    public User getUserByName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    @Override
    public boolean validate(String userName, String password) {
        Object result = userRepository.findUserByUserName(userName);
        if(result!=null){
            User user = (User) result;
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer userId) {
        User user = userRepository.findUserByUserId(userId);
        userRepository.delete(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user); // ??
    }
}
