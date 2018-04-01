package io.ooc.project.service;

import io.ooc.project.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User get(Integer userId);

    User getUserByName(String userName);

    boolean validate(String userName,String password);

    void add(User user);

    void delete(Integer userId);

    void edit(User user);
}
