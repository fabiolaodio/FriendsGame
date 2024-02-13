
package desafiofriends.logica;

import java.util.Random;

/**
 *
 * @author fabio
 */
public class Controladora {
    
    public int determinarCantidad(String emoji, int cantidad, String matriz[][]){
        
       int cantidadEncontrada=0;
       
        for (int i = 0; i <4 ; i++) {
            
            for (int j = 0; j < 4; j++) {
                if(matriz[i][j].equals(emoji)){    
                    cantidadEncontrada++;
                }
            }
            
        }
        return cantidadEncontrada;
    }
    
    public String[][] generarMatriz(){
       Random random = new Random ();
       String [] emojis={"🦕","🃏","🐈‍","🫧","🥪","👰"};
       String [][]matriz= new String[4][4];
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=emojis[random.nextInt(emojis.length)];
            }
        }
        return matriz;
    }
    
    
    
}
