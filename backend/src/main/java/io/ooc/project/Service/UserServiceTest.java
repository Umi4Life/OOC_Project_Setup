package io.ooc.project.Service;

import io.ooc.project.Model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public interface UserServiceTest {
    public List<User> getAll();

    public User get(Integer userId);

    public User getuserByName(String userName);

    public boolean validate(String userName,String password);

    public void add(User user);

    public void delete(Integer userId);

    public void edit(User user);
}
