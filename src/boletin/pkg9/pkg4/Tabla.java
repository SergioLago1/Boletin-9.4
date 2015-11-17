/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg4;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class Tabla {
   public static void getNumero(){  
     
    int numero =Integer.parseInt(JOptionPane.showInputDialog("Introducir número: "));
      
    if(numero!=0) {
        for( int i=0;i<=10;i++)
        JOptionPane.showMessageDialog(null,numero+"*"+i+"="+numero*i);}
    
    else{ 
        JOptionPane.showMessageDialog(null,"Calculo cancelado");
}
}
}