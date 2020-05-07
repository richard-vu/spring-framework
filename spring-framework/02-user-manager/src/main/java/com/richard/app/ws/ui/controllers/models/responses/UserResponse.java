/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.controllers.models.responses;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author richard
 *
 */
@Data
public class UserResponse implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 private Long id;
 
 private String firstName;
 
 private String lastName;

 private Date createDate;

 private String email;
}
