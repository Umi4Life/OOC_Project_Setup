package io.ooc.project.Service;

import io.ooc.project.Model.User;
import io.ooc.project.Repository.UserRepository;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceTest {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(Integer userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User getuserByName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public boolean validate(String userName, String password) {
        Object result = userRepository.findByUsername(userName);
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
        User user = userRepository.findById(userId);
        userRepository.delete(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user); // ??
    }
}
