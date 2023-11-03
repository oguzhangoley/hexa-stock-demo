package com.oguz.stock.adapters.user.jpa;

import com.oguz.stock.adapters.user.jpa.entity.UserEntity;
import com.oguz.stock.adapters.user.jpa.repository.UserJpaRepository;
import com.oguz.stock.common.model.Status;
import com.oguz.stock.user.model.User;
import com.oguz.stock.user.port.UserPort;
import com.oguz.stock.user.usecase.CreateUser;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDataAdapter implements UserPort {
    private final UserJpaRepository userJpaRepository;
    private final ModelMapper mapper;

    @Override
    public User getUserById(long id) {
        return userJpaRepository.findById(id).map(userEntity -> mapper.map(userEntity, User.class)).orElseThrow();
    }

    @Override
    public List<User> getAll() {
        return userJpaRepository.findAll().stream().map(userEntity -> mapper.map(userEntity,User.class)).toList();
    }

    @Override
    public User createUser(CreateUser createUser) {
        UserEntity userEntity = mapper.map(createUser,UserEntity.class);
        userEntity.setStatus(Status.ACTIVE);
        UserEntity savedUser = userJpaRepository.save(userEntity);
        return mapper.map(savedUser, User.class);
    }
}
