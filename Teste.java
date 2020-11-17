
 package Sistem_Solar;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author isaura
 */
public class Teste
{
    public static void main(String[] args)
    {
        //Cria um objeto p
        Terra p = new Terra();
        
        
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.getContentPane().setBackground( Color.black );
        p.setSize(1024,2000); // Define o Tamanho do Frame como x = 1024 e y = 2000

        p.setVisible(true);

    }
}
