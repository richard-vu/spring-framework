/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.service.UserService;
import com.richard.app.ws.ui.controllers.models.request.UserRegisterRequest;
import com.richard.app.ws.ui.controllers.models.responses.UserRegisterResponse;
import com.richard.app.ws.ui.controllers.models.responses.UserResponse;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws")
public class UserResource {

 @Autowired
 UserService userService;

 @GetMapping(path = "/get-all-users", produces = { MediaType.APPLICATION_JSON_VALUE })
 public List<UserResponse> getAllUsers() {
  return userService.getAllUsers();
 }

 @GetMapping(path = "/get-user", produces = { MediaType.APPLICATION_JSON_VALUE })
 public UserResponse getUserById() {
  return null;
 }

 @PostMapping(path = "/add-user", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
   MediaType.APPLICATION_JSON_VALUE })
 public UserRegisterResponse addUser(@RequestBody UserRegisterRequest userRegisterRequest) {
  return userService.addUser(userRegisterRequest);
 }
}
