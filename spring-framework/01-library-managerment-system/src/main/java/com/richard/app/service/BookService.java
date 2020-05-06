/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.service;

import java.util.Collection;

import com.richard.app.io.entities.BookEntity;

/**
 * @author richard
 *
 */
public interface BookService {
 Collection<BookEntity> findAllBooks();
}
