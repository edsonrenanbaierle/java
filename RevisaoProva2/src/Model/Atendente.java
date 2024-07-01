/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Atendente {
    private Integer id;
    private String nome;

    public Atendente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Atendente(String name) {
        this.nome = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }
    
    
}
