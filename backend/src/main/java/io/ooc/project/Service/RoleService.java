package io.ooc.project.Service;

import io.ooc.project.Model.Role;
import io.ooc.project.Model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public interface RoleServiceTest {

    public List<Role> getAll(Integer userId);

    public List<Role>getAll();

    public Role get(Integer roleId);

    public void add(Integer userId,Role role);

    public void delete(Integer roleId);

    public void edit(Role role);

}
