package io.ooc.project.Repository;


import io.ooc.project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserName(String username);
    User findUserByUserId(int id);
}
