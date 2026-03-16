package com.example;

import javax.persistence.*;

@Entity
@Table(name="books")

public class Book {

    @Id
    private int book_id;

    private String title;
    private String author;

    public Book(){}

    public Book(int book_id,String title,String author){
        this.book_id=book_id;
        this.title=title;
        this.author=author;
    }

    public int getBook_id(){
        return book_id;
    }

    public void setBook_id(int book_id){
        this.book_id=book_id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }
}