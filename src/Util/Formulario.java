/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Formulario {
    
    public static void centralizar (JFrame f){
        Dimension d1 = f.getToolkit().getScreenSize();
        Dimension d2 = f.getSize();
        
   f.setLocation(
           (d1.width-d2.width)/2,
           (d1.height-d2.height)/2);
  
        
    }
    
    
}

