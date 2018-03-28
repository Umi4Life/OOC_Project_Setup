package io.ooc.project.Repository;

import io.ooc.project.Model.Role;
import io.ooc.project.Model.User;
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
