package extra3_2;


public class Fecha {
    
    public boolean esFechaValida(int dia, int mes, int año){
        
        boolean Verd = false;
        
        if (mes >= 1 && mes <=12){
            
            if(año >= 1600 && año <= 3000){
                switch(mes){
                    case 1: case 3: case 5: case 7: case 8: case 10:
                        if(dia >= 1 && dia <=31){
                            System.out.println("Fecha valida");
                            Verd = true;
                            return Verd;
                        }
                        else{
                            System.out.println("Dia incorrecto");
                            
                        }
                    case 4: case 6: case 9: case 11:
                        if(dia >= 1 && dia <=30){
                            System.out.println("Fecha valida");
                            Verd = true;
                            return Verd;
                        }
                        else{
                            System.out.println("Dia incorrecto");
                            
                        }
                    case 2:
                        if (año%4 == 0){
                            if(dia <= 29 && dia >= 1){
                                System.out.println("Fecha correcta");
                                Verd = true;
                                
                            }
                            else{
                                System.out.println("Dia incorrecto");
                                
                            }
                        }
                        else{
                            if(dia <= 28 && dia >= 1){
                                System.out.println("Fecha correcta");
                                Verd = true;
                                
                            }
                        }
                }
            }
            else{
                System.out.println("Año incorrecto");
               
            }
        }
        else{
            System.out.println("Mes incorrecto");
            
        }
        return Verd;
    }
}
