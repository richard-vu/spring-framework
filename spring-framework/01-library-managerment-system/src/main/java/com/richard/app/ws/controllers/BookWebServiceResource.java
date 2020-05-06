/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.app.io.entities.BookEntity;
import com.richard.app.service.BookService;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws")
public class BookWebServiceResource {
 @Autowired
 private BookService bookService;
 
 @GetMapping("/get-all-books")
 public Collection<BookEntity> findAllBooks() {
  return bookService.findAllBooks();
 }
}
