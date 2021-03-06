/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Entity(name = "users")
@Getter
@Setter
public class UserEntity implements Serializable{

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @Column(nullable = false, length = 50)
 private String username;

 @Column(nullable = false, name = "first_name", length = 50)
 private String firstName;

 @Column(nullable = false, name = "last_name", length = 50)
 private String lastName;
 
 @Column(nullable = false, name = "create_date")
 private Date createDate;

 @Column(name = "email")
 private String email;
 
 @Column(name = "password")
 private String password;
 
}
