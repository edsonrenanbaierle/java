/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class Aluno {
    private String name;
    private Double noteOne;
    private Double noteTwo;

    public Aluno(String name, Double noteOne, Double noteTwo) {
        this.name = name;
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNoteOne() {
        return noteOne;
    }

    public void setNoteOne(Double noteOne) {
        this.noteOne = noteOne;
    }

    public Double getNoteTwo() {
        return noteTwo;
    }

    public void setNoteTwo(Double noteTwo) {
        this.noteTwo = noteTwo;
    }
    
    public Double average(){
        return (this.noteOne + this.noteTwo) /2;
    }
}
