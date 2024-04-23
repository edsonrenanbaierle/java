/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PersonComands {
    static ArrayList<Person> arrayPerson = new ArrayList<>();
    
    public static void addPeron(Person pessoa){
        arrayPerson.add(pessoa);
        
    }
    
    public static void removePerson(String cpf){
        Person pessoa = arrayPerson.stream().filter(p -> p.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);

        if (pessoa != null) {
            arrayPerson.remove(pessoa);
        }
    }
    
    public static ArrayList<Person> getArrayPeron(){
        return arrayPerson;
    }
    
    public static void editPersonName(String cpf, String newName){
        Person pessoa = arrayPerson.stream().filter(p -> p.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);

        if (pessoa != null) {
            pessoa.setNome(newName);
        }
    }
    
    public static void editPersonCep(String cpf, String newCep){
        Person pessoa = arrayPerson.stream().filter(p -> p.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);

        if (pessoa != null) {
            pessoa.setCep(newCep);
        }
    }
    
    public static void editPersonEndereco(String cpf, String newEndereco){
        Person pessoa = arrayPerson.stream().filter(p -> p.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);

        if (pessoa != null) {
            pessoa.setEnderco(newEndereco);
        }
    }
    
        public static void editPersonTelephone(String cpf, String newTelefone){
        Person pessoa = arrayPerson.stream().filter(p -> p.getCpf().equals(cpf))
            .findFirst()
            .orElse(null);

        if (pessoa != null) {
            pessoa.setTelefone(newTelefone);
        }
    }
}
