package model;

/**
 *
 * Autor: Edson Baierle
 */
public class UnidadeFederacao implements Comparable {
    private int id;
    private String uf;    
    private String descricao;
    private double mediaSaude;
    private double mediaEducacao;
    private double mediaRenda;
    private double mediaIfdm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMediaSaude() {
        return mediaSaude;
    }

    public void setMediaSaude(double mediaSaude) {
        this.mediaSaude = mediaSaude;
    }

    public double getMediaEducacao() {
        return mediaEducacao;
    }

    public void setMediaEducacao(double mediaEducacao) {
        this.mediaEducacao = mediaEducacao;
    }

    public double getMediaRenda() {
        return mediaRenda;
    }

    public void setMediaRenda(double mediaRenda) {
        this.mediaRenda = mediaRenda;
    }

    public double getMediaIfdm() {
        return mediaIfdm;
    }

    public void setMediaIfdm(double mediaIfdm) {
        this.mediaIfdm = mediaIfdm;
    }

    @Override
    public String toString(){
        return this.descricao;
    }

    @Override
    public int compareTo(Object o) {        
        return this.toString().compareTo(o.toString());
    }

}
