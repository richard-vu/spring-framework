/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entities;

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
@Entity(name = "books")
@Getter
@Setter
public class BookEntity implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

 @Column(nullable = false, name = "book_name", length = 50)
 private String bookName;

 @Column(nullable = false, length = 50)
 private String author;

 @Column(nullable = false, name = "purchase_date")
 private Date purchaseDate;

}
