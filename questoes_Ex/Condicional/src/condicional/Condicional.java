/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer horaInicial;
        Integer horaFinal;
        Integer horasGastas;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o horario de inicio: ");
        horaInicial = sc.nextInt();
        
        System.out.println("Digite o horario de fim: ");
        horaFinal = sc.nextInt();
        
        if(horaInicial > horaFinal){
            horasGastas = (24 - horaInicial) + horaFinal;
        }else if(horaInicial < horaFinal){
            horasGastas = horaFinal - horaInicial;
        }else{
            horasGastas = 24;
        }
        
        System.out.println("As horas gastas foram: " + horasGastas);
    }
    
}
