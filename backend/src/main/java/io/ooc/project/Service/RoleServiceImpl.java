package io.ooc.project.Service;


import io.ooc.project.Model.Role;
import io.ooc.project.Repository.RoleRepository;
import io.ooc.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleServiceTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll(Integer userId) {
        return roleRepository.findAll();
    }

    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role get(Integer roleId) {
        return null;
    }

    @Override
    public void add(Integer userId, Role role) {

    }

    @Override
    public void delete(Integer roleId) {

    }

    @Override
    public void edit(Role role) {

    }
}
