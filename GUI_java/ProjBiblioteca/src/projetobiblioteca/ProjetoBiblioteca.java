/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetobiblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class ProjetoBiblioteca {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Library library2 = new Library();
        Author author1 = new Author("John Ronald Reuel Tolkien");
        Book book = new Book(0, "O Hobbit", author1, EnumLivro.FICCAO, sdf.parse("21/09/1937"));
        for(int i = 0; i < 5000; i++){
            book.setId(i);
            library2.addBook(book);
        }
        
        long tempoAnterior1 = System.currentTimeMillis();
        String s1 = library2.toString();
        long tempoPosterior1 = System.currentTimeMillis();
        System.out.println("Tempo Concatenação normal: " +(tempoPosterior1 - tempoAnterior1) + " milisegundos");
        
        long tempoAnterior2 = System.currentTimeMillis();
        String s2 = library2.toString(true);
        long tempoPosterior2 = System.currentTimeMillis();
        System.out.println("Tempo String Builder: " +(tempoPosterior2 - tempoAnterior2) + " milisegundos");
    }
    
}
