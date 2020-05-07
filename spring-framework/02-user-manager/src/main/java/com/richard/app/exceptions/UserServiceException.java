/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.exceptions;

/**
 * @author richard
 *
 */
public class UserServiceException extends RuntimeException {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 public UserServiceException(String message) {
  super(message);
 }
}
