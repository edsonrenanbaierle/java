/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Atendimento {
    private Integer id;
    private Integer cliente_id;
    private Integer atendente_id;
    private String descricao;
    
    private String atendenteNome;

    public Atendimento(Integer id, Integer cliente_id, Integer atendente_id, String descricao, String atendenteNome) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.atendente_id = atendente_id;
        this.descricao = descricao;
        this.atendenteNome = atendenteNome;
    }

    public Atendimento(Integer cliente_id, Integer atendente_id, String descricao) {
        this.cliente_id = cliente_id;
        this.atendente_id = atendente_id;
        this.descricao = descricao;
    }

    public String getAtendenteNome() {
        return atendenteNome;
    }

    public void setAtendenteNome(String atendenteNome) {
        this.atendenteNome = atendenteNome;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getAtendente_id() {
        return atendente_id;
    }

    public void setAtendente_id(Integer atendente_id) {
        this.atendente_id = atendente_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
