package com.qcerris.webshop.repository;

import com.qcerris.webshop.entity.domain.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "select u from UserEntity u " +
            "where u.username=?1")
    UserEntity findByUsername(String username);
}
