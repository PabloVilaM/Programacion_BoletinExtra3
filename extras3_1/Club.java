package extras3_1;

import javax.swing.JOptionPane;


public class Club {
    private final int cota = 800;

    
    public void Abono(){
        int años = pedirEdade();
        
        
        if (años > 65){
            System.out.println("El precio a pagar es: " + (cota-(cota*40)/100));
        }
        else if(años < 21){
            if(preguntarPadre() == true){
                System.out.println("El precio a pagar es: " + (cota-(cota*45)/100));
            }
            else{
                System.out.println("El precio a pagar es: " + (cota-(cota*25)/100));
            }
        }
        else{
            System.out.println("El precio a pegar es el básico, 800€");
        }
        
    }
    
    public int pedirEdade(){
       String edads = JOptionPane.showInputDialog("Dame tu edad");
        int edad = Integer.parseInt(edads);
        return edad;       
    }
    
    public boolean preguntarPadre(){
        
        int i = 0;
        boolean Verd = false;
        while (i==0){
            String respuesta = JOptionPane.showInputDialog("Tu padre es socio del club?");
            String low = respuesta.toLowerCase();
            if (low.equals("si")){
               i++;
            Verd = true;
           }
            else if (low.equals("no")){
            i++;
           }
            else{
            System.out.println("No me vale");
            
           }
        }       
        return Verd;
    }
}
