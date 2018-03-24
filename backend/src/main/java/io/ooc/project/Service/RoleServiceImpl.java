package io.ooc.project.Service;


import io.ooc.project.Model.Role;
import io.ooc.project.Model.User;
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
        User user = userRepository.findById(userId);
        return roleRepository.findRoleByUser(user);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role get(Integer roleId) {
        return roleRepository.findById(roleId);
    }

    @Override
    public void add(Integer userId, Role role) {
        User user = userRepository.findById(userId);
        user.getRole().add(role);
    }

    @Override
    public void delete(Integer roleId) {
        Role role = roleRepository.findById(roleId);
        roleRepository.delete(role);
    }

    @Override
    public void edit(Role role) {
        roleRepository.save(role); //?? I never get edit
    }
}
