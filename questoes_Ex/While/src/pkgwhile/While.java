/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer alcool = 0;
        Integer gasolina = 0;
        Integer disel = 0;
        
        Integer escolha = sc.nextInt();
        while(escolha != 4){
            if(escolha == 1){
                alcool += 1;
            }else if(escolha == 2){
                gasolina += 1;
            }else if(escolha == 3){
                disel += 1;
            }
            
            escolha = sc.nextInt();
        }
        
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);
    }
    
}
