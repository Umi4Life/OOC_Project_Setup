package io.ooc.project.service;


import io.ooc.project.model.Role;
import io.ooc.project.model.User;
import io.ooc.project.repository.RoleRepository;
import io.ooc.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll(Integer userId) {
        User user = userRepository.findUserByUserId(userId);
        return roleRepository.findRoleByUser(user);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role get(Integer roleId) {
        return roleRepository.findRoleByRoleId(roleId);
    }

    @Override
    public void add(Integer userId, Role role) {
        User user = userRepository.findUserByUserId(userId);
        user.getRole().add(role);
    }

    @Override
    public void delete(Integer roleId) {
        Role role = roleRepository.findRoleByRoleId(roleId);
        roleRepository.delete(role);
    }

    @Override
    public void edit(Role role) {
        roleRepository.save(role); //?? I never get edit
    }
}
