/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobiblioteca;

/**
 *
 * @author User
 */
public class Author {
    private String name;
    private int quantityOfBook;

    public Author(String name) {
        this.name = name;
        this.quantityOfBook = 0;
    }

    public Author(String name, int quantityOfBook) {
        this.name = name;
        this.quantityOfBook = quantityOfBook;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityOfBook() {
        return quantityOfBook;
    }

    public void setQuantityOfBook(int quantityOfBook) {
        this.quantityOfBook = quantityOfBook;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", quantityOfBook=" + quantityOfBook + '}';
    }
    
    
}
