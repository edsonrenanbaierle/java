/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. Dado um vetor A de 8 números reais, encontrar a maior diferença entre dois elementos consecutivos deste
vetor. Ao final, mostrar o valor da diferença.
*/      
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numerosReais = new ArrayList<>();
        Double maiorDiferencaEntreElementos = 0.0;
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i+1) + " numero: ");
            Double num = sc.nextDouble();
            numerosReais.add(num);
        }
        
        if(numerosReais.get(0) > numerosReais.get(1)){
            maiorDiferencaEntreElementos = numerosReais.get(0) - numerosReais.get(1);
        }else {
            maiorDiferencaEntreElementos = numerosReais.get(0) - numerosReais.get(1);
        }
        
        for (int i = 0; i < numerosReais.size() -1; i++) {
            if(numerosReais.get(i+1) > numerosReais.get(i) && maiorDiferencaEntreElementos < numerosReais.get(i+1) - numerosReais.get(i)){
                 maiorDiferencaEntreElementos = numerosReais.get(i+1) - numerosReais.get(i);
            }
        }
        
        System.out.println("Maior diferença foi de: " + maiorDiferencaEntreElementos);
        
    }
    
}
