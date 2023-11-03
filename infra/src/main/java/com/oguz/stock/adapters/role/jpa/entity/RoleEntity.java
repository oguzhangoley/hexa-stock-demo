package com.oguz.stock.adapters.role.jpa.entity;

import com.oguz.stock.adapters.user.jpa.entity.UserEntity;
import com.oguz.stock.common.entity.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "roles")
public class RoleEntity extends AbstractEntity {
    private String name;

    @ManyToMany
    private Set<UserEntity> users;
}
