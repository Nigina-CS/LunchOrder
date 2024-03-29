package com.example.lunch.repository;

import com.example.lunch.entity.user.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<AuthUser, Long>, AbstractRepository {
    @Query(value = "update AuthUser set active = true where id = :userId")
    void activate(@Param("userId") Long id);

    @Query(value = "update AuthUser set blocked = true where id = :userId")
    void block(@Param("userId")Long id);

    @Query(value = "update AuthUser set blocked = false where id = :userId")
    void unblock(@Param("userId")Long id);

    @Query(value = "update AuthUser set deleted = true where id =:userId")
    void delete(@Param("userId") Long id);

    AuthUser findByUsername(String username);
}
