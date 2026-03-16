package com.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="issues")

public class Issue {

    @Id
    private int issue_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    private Date issue_date;
    private Date return_date;

    public Issue(){}

    public Issue(int issue_id,User user,Book book,Date issue_date,Date return_date){
        this.issue_id=issue_id;
        this.user=user;
        this.book=book;
        this.issue_date=issue_date;
        this.return_date=return_date;
    }

    public int getIssue_id(){
        return issue_id;
    }

    public void setIssue_id(int issue_id){
        this.issue_id=issue_id;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user=user;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book=book;
    }

    public Date getIssue_date(){
        return issue_date;
    }

    public void setIssue_date(Date issue_date){
        this.issue_date=issue_date;
    }

    public Date getReturn_date(){
        return return_date;
    }

    public void setReturn_date(Date return_date){
        this.return_date=return_date;
    }
}