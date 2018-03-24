package io.ooc.project.Repository;

import io.ooc.project.Model.Item;
import io.ooc.project.Model.Role;
import io.ooc.project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Override
    List<Role> findAll();
    List<Role> findRoleByUser(User user);

}
