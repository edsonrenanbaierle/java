package model;

import java.util.Comparator;

/**
 *
 * Autor: Edson Baierle
 * Classe para comparar 2 cidades pelo seu IFDM
 */
public class ComparadorCidade implements Comparator<Cidade>{

    @Override
    public int compare(Cidade o1, Cidade o2) {
        //maior IFDM deve vir primeiro
        return new Double(o2.getIfdm()).compareTo(o1.getIfdm());
    }
    
}
