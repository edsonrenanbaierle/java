/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Library {
    ArrayList<Book> book = new ArrayList();

    public Library() {
    }
   
   
    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library{" + "book=" + book + '}';
    }
   
   public void addBook(Book book){
       this.book.add(book);
       book.getAuthor().setQuantityOfBook( book.getAuthor().getQuantityOfBook() + 1);
   }
   
   public void removeBook(Book book){
       this.book.remove(book);
       book.getAuthor().setQuantityOfBook( book.getAuthor().getQuantityOfBook() - 1);
   }
   
   
   public ArrayList<Author> authorsWithMostPublication(){
       ArrayList<Author> authors = new ArrayList();
       
       for(Book book : this.book){
            Author author = book.getAuthor();
            if(!authors.contains(author)){
                authors.add(author);
            }
       }
       
       Collections.sort(authors, Comparator.comparingInt(Author::getQuantityOfBook).reversed());
       return authors;
   }
}
