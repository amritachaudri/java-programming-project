package com.example.ostore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "book"
)
public class Book {
    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "author"
    )
    private String author;
    @Column(
            name = "price"
    )
    private String price;
    @Column(
            name = "picByte",
            length = 100000
    )
    private byte[] picByte;

    public Book() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getPicByte() {
        return this.picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }
}
