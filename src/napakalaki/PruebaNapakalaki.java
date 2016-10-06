/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author jcpulido97
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BadConsequence bc;
        Prize premio;
        Monster prueba;
        
        premio = new Prize(2, 30);
        bc = new BadConsequence("Muerte", true);
        prueba = new Monster("Test", 100, bc, premio);
        
        System.out.print(prueba.toString() + '\n');
        System.out.println(prueba.toString());
    }
    
}
