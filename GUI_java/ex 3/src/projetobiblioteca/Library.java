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
    private ArrayList<Book> book = new ArrayList();
    private ArrayList<Author> authors = new ArrayList();

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Library() {
    }
   
   
    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }


   
   public void addBook(Book book){
       this.book.add(book);
       if(!this.authors.contains(book.getAuthor())){
           this.authors.add(book.getAuthor());
           book.getAuthor().setQuantityOfBook(book.getAuthor().getQuantityOfBook() + 1);
       }else {
           book.getAuthor().setQuantityOfBook(book.getAuthor().getQuantityOfBook() + 1);
       }
   }
   
   public void removeBook(Book book){
       this.book.remove(book);
       book.getAuthor().setQuantityOfBook( book.getAuthor().getQuantityOfBook() - 1);
   }
   
   public ArrayList<Author> authorsWithMostPublication(){
       Collections.sort(this.authors);
       
       return this.authors;
   }
   
    @Override
    public String toString() {
        String connect = "";
        for(Book book : this.book){
            connect += "Livro: " + book.getTitle() + "Autor: " + book.getAuthor().getName() + "Categoria: " + book.getCategory() + " Publicado em: " + book.getPublicationDate() + "\n";
        }
        return connect;
    }
    
    public String toString(boolean turbo) {
        StringBuilder connect = new StringBuilder();
        for(Book book : this.book){
            String b = "Livro: " + book.getTitle() + "Autor: " + book.getAuthor().getName() + "Categoria: " + book.getCategory() + " Publicado em: " + book.getPublicationDate() + "\n";
            connect.append(b);
        }
        return connect.toString();
    }
   
   
}
