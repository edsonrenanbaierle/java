package model;

/**
 *
 * Autor: Edson Baierle
 */
public class Cidade implements Comparable {
    
    private int id;
    private int uf;
    private String descricao;
    private double saude;
    private double educacao;
    private double renda;
    private double ifdm;
    private int rankingNacional;
    private int rankingEstadual;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUf() {
        return uf;
    }

    public void setUf(int uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    public double getEducacao() {
        return educacao;
    }

    public void setEducacao(double educacao) {
        this.educacao = educacao;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getIfdm() {
        return ifdm;
    }

    public void setIfdm(double ifdm) {
        this.ifdm = ifdm;
    }

    public int getRankingNacional() {
        return rankingNacional;
    }

    public void setRankingNacional(int rankingNacional) {
        this.rankingNacional = rankingNacional;
    }

    public int getRankingEstadual() {
        return rankingEstadual;
    }

    public void setRankingEstadual(int rankingEstadual) {
        this.rankingEstadual = rankingEstadual;
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
