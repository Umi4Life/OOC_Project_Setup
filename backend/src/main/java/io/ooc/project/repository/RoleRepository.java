package io.ooc.project.repository;

import io.ooc.project.model.Role;
import io.ooc.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Override
    List<Role> findAll();
    List<Role> findRoleByUser(User user);
    Role findRoleByRoleId(int id);

}
