package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_1 {

   
    public static void main(String[] args) {
        int pos =0, cero = 0, neg = 0;
        for (int i=1; i<=10; i++){
            String res = JOptionPane.showInputDialog("Numero:");
            int numero = Integer.parseInt(res);
            if (numero>0){
              pos++;
            }
            else if (numero == 0){
                cero++;
            }
            else {
                neg++;
            }
        }
        JOptionPane.showMessageDialog(null,"positivos: "+pos+"\nceros: "+cero+"\nnegativos: "+neg);
    }
}
    
    

