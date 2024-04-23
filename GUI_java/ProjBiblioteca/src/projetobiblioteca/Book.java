/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobiblioteca;

import java.util.Date;

/**
 *
 * @author User
 */
public class Book {
    private int id;
    private String title;
    private Author author;
    private EnumLivro category;
    private Date publicationDate;

    public Book(int id, String title, Author author, EnumLivro category, Date publicationDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationDate = publicationDate;
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public EnumLivro getCategory() {
        return category;
    }

    public void setCategory(EnumLivro category) {
        this.category = category;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + ", publicationDate=" + publicationDate + '}';
    }
    
    
    
}
