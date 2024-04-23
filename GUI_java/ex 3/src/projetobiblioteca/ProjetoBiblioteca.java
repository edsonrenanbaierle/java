/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projetobiblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.CadDeLivros;

/**
 *
 * @author User
 */
public class ProjetoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            CadDeLivros cadLivros = new CadDeLivros();
            cadLivros.setVisible(true);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Library library = new Library();
            
            // Livro author John Ronald Reuel Tolkien
            Author author1 = new Author("John Ronald Reuel Tolkien");
            Book book1 = new Book(0, "O Hobbit", author1, EnumLivro.FICCAO, sdf.parse("21/09/1937"));
            Book book2 = new Book(1, "O Hobbit: A batalha dos cinco exercítos", author1, EnumLivro.FICCAO, sdf.parse("01/01/2014"));
            library.addBook(book1);
            library.addBook(book2);
            
            // Livro author Kevlin Henney
            Author author2 = new Author("Kevlin Henney");
            Book bookKevlin = new Book(3, "Arquitetura limpa: o guia do artesão para estrutura e design de software", author2, EnumLivro.DIDATICO, sdf.parse("23/04/2019"));
            library.addBook(bookKevlin);
            
            
            // Livro author Jeff Kinney.
            Author author3 = new Author("Jeff Kinney");
            Book bookJeff1 = new Book(4, "Diário de um Banana: Rodrick é o Cara", author3, EnumLivro.FICCAO, sdf.parse("01/05/2009"));
            Book bookJeff2 = new Book(5, "Diário de um Banana: Dias de Cão", author3, EnumLivro.FICCAO, sdf.parse("12/10/2009"));
            Book bookJeff3 = new Book(6, "Diário de um Banana: A Verdade Nua e Crua", author3, EnumLivro.FICCAO, sdf.parse("21/10/2010"));
            library.addBook(bookJeff1);
            library.addBook(bookJeff2);
            library.addBook(bookJeff3);
            
            Author autor7 = new Author("Platão");
            Book dialogo1 = new Book(7, "A República", autor7, EnumLivro.FILOSOFIA, sdf.parse("01/01/380 a.C."));
            Book dialogo2 = new Book(8, "Fédon", autor7, EnumLivro.FILOSOFIA, sdf.parse("01/01/360 a.C."));
            Book dialogo3 = new Book(9, "O Banquete", autor7, EnumLivro.FILOSOFIA, sdf.parse("01/01/385 a.C."));
            Book dialogo4 = new Book(10, "Fedro", autor7, EnumLivro.FILOSOFIA, sdf.parse("01/01/370 a.C."));
            library.addBook(dialogo1);
            library.addBook(dialogo2);
            library.addBook(dialogo3);
            library.addBook(dialogo4);       
            
            //library.removeBook(dialogo1);
            //System.out.println(library.authorsWithMostPublication());
            //System.out.println(library.getBook());
            System.out.println(library.toString()); 
            System.out.println(library.toString(true));
            
        } catch (ParseException ex) {
            Logger.getLogger(ProjetoBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
