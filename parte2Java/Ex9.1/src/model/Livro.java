package model;
import java.io.Serializable;
import java.util.Date;


public class Livro implements Serializable {
    private int id;
    private String titulo;
    private String autor;
    private EnumLivro categoria;
    private Date dataPublicacao;

    public Livro() {
    }
    
    public Livro(int id, String titulo, EnumLivro categoria, String autor, Date dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EnumLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumLivro categoria) {
        this.categoria = categoria;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                "\nTitulo: " + titulo + 
                "\nAutor: " + autor + 
                "\nCategoria: " + categoria +
                "\nData de Publicacao: " + dataPublicacao +
                "\n===============================================================\n";
    }
    
    @Override
    public Livro clone(){
        Livro novo = new Livro(id, titulo, categoria, autor, dataPublicacao);
        
        return novo;
    }
    
}
