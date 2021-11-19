package extra3_2;

import javax.swing.JOptionPane;


public class Extra3_2 {

    public static void main(String[] args) {
       
       String dia = JOptionPane.showInputDialog("Dame un dia");
       String mes = JOptionPane.showInputDialog("Dame un mes");
       String año = JOptionPane.showInputDialog("Dame un año");
       int dian = Integer.parseInt(dia);
       int mesn = Integer.parseInt(mes);
       int añon = Integer.parseInt(año);
        Fecha validez = new Fecha();
        boolean val = validez.esFechaValida(dian, mesn, añon);
        System.out.println("La fecha es: " + val);
    }
    
}
