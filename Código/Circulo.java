/*
Sebastián Mesén Arias
B74769
Caso 01, Progra 1
*/

import java.awt.Graphics;
import java.awt.Color;
public class Circulo extends Figura4troRaya{
	/*
	 * Esta clase hereda de Figura4troRaya
	 * */

 
 public Circulo(int x, int y, int ancho, int alto){
  super(x, y, ancho, alto); //constructor del padre
 }
 
 public void dibujar(Graphics g){
	 g.setColor(Color.white);
  g.fillOval(this.getX(),this.getY(),this.getAlto(),this.getAncho());
  
 }
 
 public void pintarCyan(Graphics g){
   g.setColor(Color.cyan);
  g.fillOval(this.getX(),this.getY(),this.getAlto(),this.getAncho());
  
 }
 
 public void pintarOrange(Graphics g){
    g.setColor(Color.magenta);
  g.fillOval(this.getX(),this.getY(),this.getAlto(),this.getAncho());
 }
 
 


}//class
