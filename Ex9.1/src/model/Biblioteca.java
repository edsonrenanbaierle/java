/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Helena Della Giustina
 */
public class Biblioteca {
    private String nome;
    private ArrayList<Livro> lstLivros;
    private int id=1;
    
    public Biblioteca(){
        lstLivros = new ArrayList<>(999);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public void addLivro(String titulo, String autor, EnumLivro categoria, Date dataPublic){
        Livro l = new Livro(id, titulo, categoria, autor, dataPublic);
        lstLivros.add(l);
        id++;
    }  
    
    public void addLivro(Livro l){
        lstLivros.add(l);
        id++;
    }        
    
    public void removeLivro(int idRemover){ 
        for (Livro l : lstLivros) {
            if(l.getId() == idRemover){
                lstLivros.remove(l);
                break;
            }
        }        
    }        
    
    public ArrayList<Livro> getLstLivros(){
        return lstLivros;
    }
    
    public void salvar() throws FileNotFoundException, IOException{
        //Serialização do arquivo
        FileOutputStream fos = new FileOutputStream("dados\\biblioteca.bin");
        ObjectOutputStream o = new ObjectOutputStream(fos);
        o.writeObject(lstLivros);        
    }
    
    public void carregar() throws FileNotFoundException, IOException, ClassNotFoundException{
        //desserialização do arquivo
        FileInputStream fis = new FileInputStream("dados\\biblioteca.bin");
        ObjectInputStream o = new ObjectInputStream(fis);
        lstLivros = (ArrayList<Livro>) o.readObject();        
    }
    
    @Override
    public String toString(){
        StringBuilder stringValue = new StringBuilder();
        Livro auxLivro;
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy"); 

        for(int i = 0; i < lstLivros.size(); i++){
            auxLivro = (Livro) lstLivros.get(i);
            stringValue.append("ID: ").append(String.valueOf(auxLivro.getId())).append(". ");
            stringValue.append("Título: ").append(auxLivro.getTitulo()).append(". ");
            stringValue.append("Categoria: ").append(auxLivro.getCategoria()).append(". ");
            stringValue.append("Autor: ").append(auxLivro.getAutor()).append(". ");
            stringValue.append("Data de lançamento: ").append(dateFormat.format(auxLivro.getDataPublicacao())).append(". \n");
        }

        return stringValue.toString();  
    }
}
