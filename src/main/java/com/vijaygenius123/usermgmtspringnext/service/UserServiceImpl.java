package com.vijaygenius123.usermgmtspringnext.service;

import com.vijaygenius123.usermgmtspringnext.entity.UserEntity;
import com.vijaygenius123.usermgmtspringnext.model.User;
import com.vijaygenius123.usermgmtspringnext.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
        return user;
    }
}
