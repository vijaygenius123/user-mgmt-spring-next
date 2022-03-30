package com.vijaygenius123.usermgmtspringnext.repository;

import com.vijaygenius123.usermgmtspringnext.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
