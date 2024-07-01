/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */

public class Biblioteca implements Serializable {

    private String arquivo;

    public Biblioteca() {
        this("biblioteca.bin");
    }

    public Biblioteca(String arquivo) {
        this.arquivo = arquivo;
    }

    public void adicionarLivro(Livro livro) throws ClassNotFoundException {
        List<Livro> livros = carregarLivros();
        livros.add(livro);
        salvarLivros(livros);
    }
    
    
    public void removerLivro(int id) throws ClassNotFoundException {
        List<Livro> livros = carregarLivros();
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getId() == id) {
                iterator.remove();
            }
        }
        salvarLivros(livros);
    }

    public List<Livro> carregarLivros() throws ClassNotFoundException {
        List<Livro> livros = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            livros = (List<Livro>) ois.readObject();
        } catch (IOException e) {
            
        }
        return livros;
    }
    
    public static List<Livro> carregarLivros2() throws ClassNotFoundException, IOException {
        List<Livro> livros = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.bin"))) {
            livros = (List<Livro>) ois.readObject();
        }
        return livros;
    }

    private void salvarLivros(List<Livro> livros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(livros);
        } catch (IOException e) {
        }
    }
}
