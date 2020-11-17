
package Sistem_Solar;

import java.awt.Image;

/**
 *
 * @author isaura
 */
public class Astros 
{
    
   private Image sol;
   private Image lua1;
   private Image terra;
   
   private int posx,posy,largura,altura;
   
  
   private int raio =10;
   private int raio1 = 12;
   

    public Astros(int posx, int posy, int largura, int altura) 
    {
        this.posx = posx;
        this.posy = posy;
        this.largura = largura;
        this.altura = altura;
    }

   

    public int getPosx()
    {
        return posx;
    }

    public void setPosx(int posx)
    {
        this.posx = posx;
    }

    public int getPosy()
    {
        return posy;
    }

    public void setPosy(int posy)
    {
        this.posy = posy;
    }

    public int getLargura() 
    {
        return largura;
    }

    public void setLargura(int largura)
    {
        this.largura = largura;
    }

    public int getAltura() 
    {
        return altura;
    }

    public void setAltura(int altura) 
    {
        this.altura = altura;
    }

    public int getRaio() 
    {
        return raio;
    }

    public void setRaio(int raio)
    {
        this.raio = raio;
    }

    public Image getSol() 
    {
        return sol;
    }

    public void setSol(Image sol)
    {
        this.sol = sol;
    }

    public Image getLua1()
    {
        return lua1;
    }

    public void setLua1(Image lua1)
    {
        this.lua1 = lua1;
    }

    public Image getTerra()
    {
        return terra;
    }

    public void setTerra(Image terra)
    {
        this.terra = terra;
    }

    public int getRaio1() 
    {
        return raio1;
    }

    public void setRaio1(int raio1)
    {
        this.raio1 = raio1;
    }

   
    
    
    
    
    

  
    
   
   
   
   
   
    
}
