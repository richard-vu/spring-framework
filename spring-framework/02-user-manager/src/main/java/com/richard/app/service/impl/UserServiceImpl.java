/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.app.exceptions.UserServiceException;
import com.richard.app.io.entity.UserEntity;
import com.richard.app.io.repository.UserRepositoty;
import com.richard.app.service.UserService;
import com.richard.app.ws.ui.controllers.models.request.UserRegisterRequest;
import com.richard.app.ws.ui.controllers.models.responses.UserRegisterResponse;
import com.richard.app.ws.ui.controllers.models.responses.UserResponse;

import lombok.extern.slf4j.Slf4j;
import java.lang.reflect.Type;

/**
 * @author richard
 *
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

 @Autowired
 UserRepositoty userRepositoty;

 @Override
 public List<UserResponse> getAllUsers() {
  List<UserEntity>   listUserEntity   = new ArrayList<>();

  userRepositoty.findAll().forEach(listUserEntity::add);

  if (listUserEntity.isEmpty()) {
   throw new UserServiceException("Database is null");
  }

  //  Create Conversion Type
  Type listType = new TypeToken<List<UserResponse>>() {
  }.getType();

  //  Convert List of Entity objects to a List of DTOs objects 
  List<UserResponse> listUserResponse = new ModelMapper().map(listUserEntity, listType);

  log.info("debug enabled: {}", log.isDebugEnabled());
  
  return listUserResponse;

 }

 @Override
 public UserRegisterResponse addUser(UserRegisterRequest userRegisterRequest) {
  String username = userRegisterRequest.getEmail().substring(0, userRegisterRequest.getEmail().indexOf("@"));

  if (userRepositoty.findByEmail(userRegisterRequest.getEmail()) != null
    || userRepositoty.findByUsername(username) != null) {
   throw new UserServiceException("Record already exists");
  }

  ModelMapper modelMapper = new ModelMapper();

  UserEntity userEntity = modelMapper.map(userRegisterRequest, UserEntity.class);

  userEntity.setUsername(username);
  userEntity.setCreateDate(new Date());

  userRepositoty.save(userEntity);

  log.info("debug enabled: {}", log.isDebugEnabled());
  
  return new UserRegisterResponse("User was Created");
 }

}
