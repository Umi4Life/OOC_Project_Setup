package io.ooc.project.Service;

import io.ooc.project.Model.User;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
public class UserServiceImpl implements UserServiceTest {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User get(Integer userId) {
        return null;
    }

    @Override
    public User getuserByName(String userName) {
        return null;
    }

    @Override
    public boolean validate(String userName, String password) {
        return false;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(Integer userId) {

    }

    @Override
    public void edit(User user) {

    }
}
