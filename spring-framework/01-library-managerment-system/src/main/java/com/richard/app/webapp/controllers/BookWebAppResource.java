/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.richard.app.service.BookService;

/**
 * @author richard
 *
 */
@Controller
public class BookWebAppResource {

 @Autowired
 private BookService bookService;

 @GetMapping("/")
 public String home(Model model) {
  model.addAttribute("books", bookService.findAllBooks());
  return "index";
 }

}
