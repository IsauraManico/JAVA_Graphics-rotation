
package  Sistem_Solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author isaura
 */
public class Terra extends JFrame implements Runnable
{
    
   
    
    //Astros astro = new Astros(150,299,50,50);
    
    Astros astro = new Astros(150,299,400,400);
    
   int velGrav = 0; //Responsavel por aumentar a velocidade da lua
    
    
    private Thread thread = new Thread(this);
            
            public Terra()
            {
                
                
                thread.start();
              
                
                
                astro.setTerra(new ImageIcon(getClass().getResource("terra.jpg")).getImage());
                astro.setSol(new ImageIcon(getClass().getResource("sol.jpg")).getImage());
                astro.setLua1(new ImageIcon(getClass().getResource("lua.jpg")).getImage());
                
                
                
            }
            
            
            public void paint( Graphics g)
            {
                super.paint(g);
                
                Graphics2D g2d = ( Graphics2D)g;
                
                 g.drawImage(astro.getSol(),300, astro.getPosy()+100,90,90,this); //Colocando a imagem sol no draw
                 
                 
                AffineTransform obj = g2d.getTransform(); //Inicio do Affine, cria um objeto e atribui o desenho a ser transformado
                
                        g2d.rotate(Math.toRadians(astro.getRaio()), astro.getPosx()+(astro.getAltura()/2),
                                astro.getPosy()+(astro.getLargura()/2)); //para a rotacao do planeta em torno do sol
                        

                        g.drawImage(astro.getTerra(),astro.getPosx(), astro.getPosy(),50,50,this);//planeta
                        
                        
                        g2d.rotate(Math.toRadians(astro.getRaio1()+this.velGrav),( astro.getPosx()+(50/2)), //para rotacao da lua em torno da terra
                                (astro.getPosy()+(50/2)));
                        

                        g.drawImage(astro.getLua1(),130, 190,60,60,this); //lua
                       

                g2d.setTransform(obj); // Pega na posicao final e substirtui  transformacao inicial 
                //desenha um retangulo com as mesmas caracteristicas
        
        
                obj = g2d.getTransform(); //posicaoo final Termino do affineTransform
                
                
            
            }
        
            
            public void dormir()
             {
                try
                {
                    Thread.sleep(45);
                }
                catch (InterruptedException ex)
                {
                   ex.printStackTrace();
                }
            }
            
            
            

                @Override
                public void run()
                {
                        while( true)
                        {
                            
                            astro.setRaio(astro.getRaio()+1); //raio da terra
                            astro.setRaio1(astro.getRaio1()+1); //reaio do sol
                            this.velGrav+=2;
                            repaint();
                            dormir();
                        }
                }
    
}
