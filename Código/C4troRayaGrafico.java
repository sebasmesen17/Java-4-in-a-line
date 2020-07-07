/*
Sebastián Mesén Arias
B74769
Caso 01, Progra 1
*/

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*****************************/

public class C4troRayaGrafico extends JFrame implements MouseListener, ActionListener{

private int x=0, y=0, clicked=1, victoria1=0, victoria2=0;

 
   private JPanel pnlPrincipal, pnlBotones;
   private JButton salir, btnJugarOtraVez, btnEstadisticas;
   private JLabel jugador1, jugador2;

  
   ManejadorC4troRaya manejador = new ManejadorC4troRaya();
   
 
 public C4troRayaGrafico(){
   
   super("Sebastián Mesén, Cuatro Raya, caso 01");
   /****************/
  pnlPrincipal = new JPanel();
  pnlBotones = new JPanel();
  pnlBotones.setLayout(new FlowLayout());
  /****************/
  
  
  /****************/
  salir = new JButton("Salir");//CIERRA EL PROGRAMA
  btnJugarOtraVez = new JButton("Jugar de nuevo");//REINICIA EL TABLERO A 0
  btnEstadisticas = new JButton("Stats");//ESTE BOTÓN TIRA LOS MARCADORES
  salir.addActionListener(this);
  jugador1=new JLabel("Jugador morado es 1");//LABEL NORMAL
  jugador2=new JLabel("Jugador celeste es 2");//LABEL NORMAL
  btnJugarOtraVez.addActionListener(this);//HACER QUE ESCUCHE 
  btnEstadisticas.addActionListener(this);//HACER QUE ESCUCHE
  this.setLayout(new BorderLayout());//LAYOUT NORMAL, BORDER
  /****************/
  
  
  /****************///EN ESTA PARTE DEL CONSTRUCTOR SE ESTABLECE EL COLOR DE FONDO, ESCUCHAR, EL TAMAÑO DE LA VENTANA Y ACTIVARLA
  pnlPrincipal.setBackground(Color.lightGray);
  this.pack();
  addMouseListener(this);          
  this.setSize(615,600);
  this.setResizable(true);
  setVisible(true);
  /****************/
   
  /****************///EN ESTA PARTE SE AGREGAN LOS BOTONES Y LABELS
    pnlBotones.add(salir);
 pnlBotones.add(jugador1);
 pnlBotones.add(btnEstadisticas);
 pnlBotones.add(jugador2);
 pnlBotones.add(btnJugarOtraVez);
    getContentPane().add(pnlPrincipal, BorderLayout.CENTER);
    getContentPane().add(pnlBotones, BorderLayout.SOUTH);
    /****************/
    
 }//Constructor
 
 
               /*************************************************************/
  public void mouseReleased(MouseEvent e) {// METODOS OBLIGATORIOS [ABSTRACTOS] 
            }
            
            public void mousePressed(MouseEvent e) {
            }
            
            public void mouseExited(MouseEvent e) {
            }
           
            public void mouseEntered(MouseEvent e) {
            }
            
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                clicked=0;
              /*el mero mero*/ repaint();
              
    }
             public void actionPerformed(ActionEvent e){
     if(e.getSource()==salir){
   System.exit(0);
  }if(e.getSource()==btnJugarOtraVez){
  this.manejador.jugarDeNuevo();
  repaint(); 
 } if(e.getSource()==btnEstadisticas){
   VistaCaso01.output("El jugador 1 (Celeste) ha ganado: "+victoria1+" veces.\n"+
   "El jugador 2 (Morado) ha ganado: "+ victoria2+ " veces. ");
  }
 }
  /*******************************************************************************/          
            
           
           
 /****************************************************/
 public void paint(Graphics g){//METODO PRINCIPAL QUE 
   super.paint(g);
   this.manejador.paintMtrz(g);
   
   if(clicked==0){
   
   if(x>0&&x<1000){
  manejador.pintaColumnas(x,y,g); 
  manejador.imprimir();
     
      if(this.manejador.getGanador()==1){
   victoria1++;
   VistaCaso01.output("Ganó el color Celeste");
  }else if(this.manejador.getGanador()==2){
   victoria2++;
   VistaCaso01.output("Ganó el color Morado");
  }
}//rango del tablero
}//evitar borrar tablero
  clicked=1;
   }//metodo
    
 /****************************************************/
           
 
 
 
 public static void main(String arg[]){
  
 new C4troRayaGrafico();
}
 
 

}//class


