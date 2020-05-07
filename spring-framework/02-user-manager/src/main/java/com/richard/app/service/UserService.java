/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.service;

import java.util.List;

import com.richard.app.ws.ui.controllers.models.request.UserRegisterRequest;
import com.richard.app.ws.ui.controllers.models.responses.UserRegisterResponse;
import com.richard.app.ws.ui.controllers.models.responses.UserResponse;

/**
 * @author richard
 *
 */
public interface UserService {
 List<UserResponse> getAllUsers();
 UserRegisterResponse addUser(UserRegisterRequest userRegisterRequest);
}
