
package constancia;

import  javax.swing.JOptionPane;

public class Constancia {

  
    public static void main(String[] args) {
     int  Evidencias,Practicas;
     
     Evidencias = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de evidencias que tienes: "));
     
     if(Evidencias >13)
     {
      Practicas =Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de  practicas"));
      if(Practicas>40)
      {
          JOptionPane.showMessageDialog(null, "FELISIDADES obtienes tu cosntancia del mes de Enero");
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Lamentablemente no obtendras tu constancia del mes de enero");
      }
     }
     else
     {
         JOptionPane.showMessageDialog(null,"Las evidencias entregadas no son sufucientes");
     }
     
    }
    
}
