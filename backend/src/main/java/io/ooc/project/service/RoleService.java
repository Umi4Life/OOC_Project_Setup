package io.ooc.project.service;

import io.ooc.project.model.Role;
import io.ooc.project.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public interface RoleService {

    List<Role> getAll(Integer userId);

    List<Role>getAll();

    Role get(Integer roleId);

    void add(Integer userId,Role role);

    void delete(Integer roleId);

    void edit(Role role);

}
