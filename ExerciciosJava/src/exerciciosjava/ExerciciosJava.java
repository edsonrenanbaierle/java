/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

import Model.Biblioteca;
import Model.Livro;
import View.FrameHome;
import java.util.List;

/**
 *
 * @author User
 */
public class ExerciciosJava {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        FrameHome framePrincipal = new FrameHome();
        framePrincipal.setVisible(true);
        // Criando uma instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando alguns livros para adicionar à biblioteca
        Livro livro1 = new Livro(1, "Harry Potter", "J.K. Rowling", "Fantasia", "1997-06-26");
        Livro livro2 = new Livro(2, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "1954-07-29");

        // Adicionando os livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Exibindo os livros na biblioteca após a adição
        System.out.println("Livros na biblioteca após a adição:");
        listarLivros(biblioteca);


    }

    private static void listarLivros(Biblioteca biblioteca) throws ClassNotFoundException {
        List<Livro> livros = biblioteca.carregarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    
}
