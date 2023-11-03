package com.oguz.stock.adapters.user.jpa.repository;

import com.oguz.stock.adapters.user.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
