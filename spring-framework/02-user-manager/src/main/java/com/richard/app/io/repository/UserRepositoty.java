/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.richard.app.io.entity.UserEntity;

/**
 * @author richard
 *
 */
@Repository
public interface UserRepositoty extends CrudRepository<UserEntity, Long> {
 UserEntity findByEmail(String email);
 UserEntity findByUsername(String username);
}
