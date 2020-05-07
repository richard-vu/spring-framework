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

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author richard
 *
 */
@Getter
@AllArgsConstructor
public class UserRegisterResponse implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 private String message;
}
