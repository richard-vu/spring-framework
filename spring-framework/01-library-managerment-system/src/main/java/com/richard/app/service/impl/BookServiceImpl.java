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
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.app.io.entities.BookEntity;
import com.richard.app.io.repository.BookRepository;
import com.richard.app.service.BookService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author richard
 *
 */
@Service
@Slf4j
public class BookServiceImpl implements BookService {
 @Autowired
 private BookRepository bookRepository;

 @Override
 public Collection<BookEntity> findAllBooks() {
  List<BookEntity> books = new ArrayList<>();

  for (BookEntity book : bookRepository.findAll()) {
   books.add(book);
   log.info("debug enabled: {}", log.isDebugEnabled());
  }
  return books;
 }
 
}
