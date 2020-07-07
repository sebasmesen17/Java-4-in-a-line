/*
Sebastián Mesén Arias
B74769
Caso 01, Progra 1
*/

import java.awt.Graphics;
import java.awt.Color;
/*BIBLIOTECAS*/

public class ManejadorC4troRaya{
  Circulo mtrzCirculo[][];//La matriz que dibuja los circulos
  private int verificador[][];
  private int turno=1, contador1=1,contador2=1,contador3=1,contador4=1,contador5=1,contador6=1,contador7=1;
  
  ManejadorC4troRaya(){//CONSTRUCTOR
  mtrzCirculo = new Circulo[6][7];
  verificador = new int [6][7];
  
  }
  
  
       public void jugarDeNuevo(){//METODO QUE REINICIA LOS CONTADORES
  
  for(int f=0; f<6; f++){
  for(int c=0; c<7; c++){
  //g.setColor(Color.white);
  verificador[f][c]=0;
  }
 }
  
  contador1=1;
  contador2=1;
  contador3=1;
  contador4=1;
  contador5=1;
  contador6=1;
  contador7=1;
  turno=1;
  }
     

  
  /*-----------ESTE METODO PINTA LOS CIRCULOS DEL TABLERO-----------------------*/
   public void paintMtrz(Graphics g){
// super.paint(g);
 g.setColor(Color.white);
  int x=10, y=50;
  for(int f=0; f<6; f++){
   for(int c=0; c<7; c++){
    mtrzCirculo[f][c] = new Circulo(x,y,80,80);
    this.mtrzCirculo[f][c].dibujar(g);
    
    x+= 85;
   }
   y+=85;
   x=10;
  }
   }//if(turno%2==0)
 //*---------------metodo que dibuja la base de la matrz*/ 
   
   
   
   /*
    * El siguiente metodo pintaColumnas lo que hace es entrar segun la cordenada a cada case a pintar, cada case representa un circulo del juego
    * */
   public void pintaColumnas(int x, int y, Graphics g){
    this.getGanador();
     
     if(x>0&&x<85){
       switch(contador1){
         
       
      
         case 1:

       if(turno%2==0){
       turno++;
       contador1++;
       verificador[5][0]=1;
       }else{  
       turno++;
       contador1++;
       verificador[5][0]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/    
       
         case 2:
           
       System.out.print(x+" "+y );
       
       if(turno%2==0){
       turno++;
       contador1++;
       verificador[4][0]=1;
       }else{ 
       turno++;
       contador1++;
       verificador[4][0]=2;
       }
       //////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       /*----------------*/
       
       
         case 3:          
       
       if(turno%2==0){
       turno++;
       contador1++;
       verificador[3][0]=1;
       }else{ 
       turno++;
       contador1++;
       verificador[3][0]=2;
       }
       ///////////////////
       this.repaint(g);
       this.getGanador();
       break;
       /*------------------------------------*/
       
       
       case 4:
       
  if(turno%2==0){
       turno++;
       contador1++;
       verificador[2][0]=1;
       }else{ 
       turno++;
       contador1++;
       verificador[2][0]=2;
       }
       
       /////////////////////////////
       this.repaint(g);
       this.getGanador();
 break;
 /*------------------------------*/
 
  case 5:
  
  if(turno%2==0){; 
       turno++;
       contador1++;
       verificador[1][0]=1;
       }else{ 
       turno++;
       contador1++;
       verificador[1][0]=2;
       }
       //////////////////////
       this.repaint(g);
       this.getGanador();
  break;
  /*------------------------------*/
  
  case 6:
  
  if(turno%2==0){ 
       turno++;
       contador1++;
       verificador[0][0]=1;
       }else{  
       turno++;
       contador1++;
       verificador[0][0]=2;
       }
       
       ////////////////////
       this.repaint(g);
       this.getGanador();
  break;
       /*--------------------------------*/
       
       }//switch
    }//if del rango
    
    if(x>90&&x<180){
  
  switch(contador2){
   
   case 1:  
       if(turno%2==0){
       turno++;
       contador2++;
       verificador[5][1]=1;
       }else{ 
       turno++;
       contador2++;
       verificador[5][1]=2;
       }
       this.repaint(g);
       this.getGanador();
   break;

   /*---------------------------------*/
   
   case 2:
   if(turno%2==0){
       turno++;
       contador2++;
       verificador[4][1]=1;
       }else{ 
       turno++;
       contador2++;
       verificador[4][1]=2;
       }
       this.repaint(g);
       this.getGanador();
   break;
   /*--------------------------*/
    
   case 3:
   if(turno%2==0){
       turno++;
       contador2++;
       verificador[3][1]=1;
       }else{ 
       turno++;
       contador2++;
       verificador[3][1]=2;
       }
       ///////////////////////////
       this.repaint(g);
       this.getGanador();
   break;
   
   
 /*--------------------------*/
   
   case 4:
   if(turno%2==0){
       turno++;
       contador2++;
       verificador[2][1]=1;
       }else{ 
       turno++;
       contador2++;
       verificador[2][1]=2;
       }
       //////////////////////////////
       this.repaint(g);
       this.getGanador();
   break;
  /*--------------------------*/
   
   case 5:
   
   if(turno%2==0){
       turno++;
       contador2++;
       verificador[1][1]=1;
       }else{ 
       turno++;
       contador2++;
       verificador[1][1]=2;
       }
       
       ///////////////////////////////
       
   this.repaint(g);
   this.getGanador();
   break;
   /*--------------------------*/
   
   case 6:
   
   if(turno%2==0){
       turno++;
       contador2++;
       verificador[0][1]=1;
       //System.out.print("turno: " + turno + " contador: "+ contador1);
       }else{ 
       turno++;
       contador2++;
       verificador[0][1]=2;
       }
       /////////////////////////////////
  this.repaint(g);
  this.getGanador();
   break;
   /*--------------------------*/
  
 }//switch
}//rango

if(x>180&&x<265){
 switch(contador3){
  
  case 1:

       if(turno%2==0){
       turno++;
       contador3++;
       verificador[5][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[5][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/ 
   
   case 2:

       if(turno%2==0){
       turno++;
       contador3++;
       verificador[4][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[4][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/ 
   
   case 3:
       if(turno%2==0){
       turno++;
       contador3++;
       verificador[3][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[3][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
   case 4:
       if(turno%2==0){
       turno++;
       contador3++;
       verificador[2][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[2][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
    case 5:
       if(turno%2==0){ 
       turno++;
       contador3++;
       verificador[1][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[1][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
   case 6:
       if(turno%2==0){
       turno++;
       contador3++;
       verificador[0][2]=1;
       }else{ 
       turno++;
       contador3++;
       verificador[0][2]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  
  
 }//switch
  
}//rango


if(x>265&&x<350){
 switch(contador4){
  
  case 1:

       if(turno%2==0){ 
       turno++;
       contador4++;
       verificador[5][3]=1;
       }else{  
       turno++;
       contador4++;
       verificador[5][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
   case 2:

       if(turno%2==0){
       turno++;
       contador4++;
       verificador[4][3]=1;
       }else{ 
       turno++;
       contador4++;
       verificador[4][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/ 
   
   case 3:

       if(turno%2==0){
       turno++;
       contador4++;
       verificador[3][3]=1;
       }else{ 
       turno++;
       contador4++;
       verificador[3][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/ 
   
   
   case 4:

       if(turno%2==0){
       turno++;
       contador4++;
       verificador[2][3]=1;
       }else{ 
       turno++;
       contador4++;
       verificador[2][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
    case 5:

       if(turno%2==0){
       turno++;
       contador4++;
       verificador[1][3]=1;
       }else{ 
       turno++;
       contador4++;
       verificador[1][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
   case 6:

       if(turno%2==0){
       turno++;
       contador4++;
       verificador[0][3]=1;
       }else{ 
       turno++;
       contador4++;
       verificador[0][3]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
 }//switch
}//rango

if(x>350&&x<435){
 switch(contador5){
  
  case 1:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[5][4]=1;
       }else{ 
       turno++;
       contador5++;
       verificador[5][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
   
   case 2:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[4][4]=1;
       }else{  
       turno++;
       contador5++;
       verificador[4][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
       /*-------------------------------*/
       
       case 3:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[3][4]=1;
       }else{ 
       turno++;
       contador5++;
       verificador[3][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
       /*-------------------------------*/
       
       case 4:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[2][4]=1;
       }else{ 
       turno++;
       contador5++;
       verificador[2][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
       /*-------------------------------*/
       
       case 5:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[1][4]=1;
       }else{ 
       turno++;
       contador5++;
       verificador[1][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
       /*-------------------------------*/
       
       case 6:

       if(turno%2==0){
       turno++;
       contador5++;
       verificador[0][4]=1;
       }else{ 
       turno++;
       contador5++;
       verificador[0][4]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
       /*-------------------------------*/
  
 }//switch
 
}//rango


if(x>435&&x<520){
 switch(contador6){
  
  case 1:
  
  
       if(turno%2==0){
       turno++;
       contador6++;
       verificador[5][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[5][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  

  
  case 2: 
  
  if(turno%2==0){ 
       turno++;
       contador6++;
       verificador[4][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[4][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 3:
  if(turno%2==0){
       turno++;
       contador6++;
       verificador[3][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[3][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 4:
  if(turno%2==0){
       turno++;
       contador6++;
       verificador[2][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[2][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 5:
  
  if(turno%2==0){
       turno++;
       contador6++;
       verificador[1][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[1][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 6:
  
  if(turno%2==0){
       turno++;
       contador6++;
       verificador[0][5]=1;
       }else{ 
       turno++;
       contador6++;
       verificador[0][5]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  
 
  
 }//switch
 
}//rango
    
    
    
    if(x>520&&x<605){
 switch(contador7){
  
  case 1:
  
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[5][6]=1;
       }else{  
       turno++;
       contador7++;
       verificador[5][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 2:
  
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[4][6]=1;
       }else{ 
       turno++;
       contador7++;
       verificador[4][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/

  
  case 3:
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[3][6]=1;
       }else{ 
       turno++;
       contador7++;
       verificador[3][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 4:
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[2][6]=1;
       }else{ 
       turno++;
       contador7++;
       verificador[2][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 5:
  
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[1][6]=1;
       }else{ 
       turno++;
       contador7++;
       verificador[1][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
  case 6:
  
  if(turno%2==0){
       turno++;
       contador7++;
       verificador[0][6]=1;
       }else{ 
       turno++;
       contador7++;
       verificador[0][6]=2;
       }
       ////////////////////////////
       this.repaint(g);
       this.getGanador();
       break;
       
   /*-------------------------------*/
  
 
  
 }//switch
 
}//rango
    
    
     }//metodo fin
     
     
     
//////////*Metodo repaint lo que hace es verificar la matriz ---VERIFICADOR[][]--- que numero tiene y pintar seguún la coordenada*/
     
     public void repaint(Graphics g){
   
   //poner espacios en blanco
   if(verificador[5][0]==0){
        Circulo blanco1 = new Circulo(10,475,80,80);
       blanco1.dibujar(g); 
       }else if(verificador[4][0]==0){
        Circulo blanco2 = new Circulo(10,390,80,80);
       blanco2.dibujar(g); 
       }else if(verificador[3][0]==0){
        Circulo blanco3 = new Circulo(10,305,80,80);
       blanco3.dibujar(g); 
       }else if(verificador[2][0]==0){
        Circulo blanco4 = new Circulo(10,220,80,80);
       blanco4.dibujar(g); 
       }else if(verificador[1][0]==0){
        Circulo blanco5 = new Circulo(10,135,80,80);
       blanco5.dibujar(g); 
       }else if(verificador[0][0]==0){
    Circulo blanco6 = new Circulo(10,50,80,80);
       blanco6.dibujar(g); 
   }
   
       
       if(verificador[5][0]==1){
        Circulo repaint1 = new Circulo(10,475,80,80);
       repaint1.pintarCyan(g); 
       }else if(verificador[5][0]==2){
        Circulo repaint2 = new Circulo(10,475,80,80);
       repaint2.pintarOrange(g); 
       }
       
       
        if(verificador[4][0]==1){
        Circulo repaint3 = new Circulo(10,390,80,80);
       repaint3.pintarCyan(g); 
       }else if(verificador[4][0]==2){
        Circulo repaint4 = new Circulo(10,390,80,80);
       repaint4.pintarOrange(g); 
       }
       
       
        if(verificador[3][0]==1){
        Circulo repaint5 = new Circulo(10,305,80,80);
       repaint5.pintarCyan(g); 
       }else if(verificador[3][0]==2){
        Circulo repaint6 = new Circulo(10,305,80,80);
       repaint6.pintarOrange(g); 
   }
       
       
       if(verificador[2][0]==1){
        Circulo repaint7 = new Circulo(10,220,80,80);
       repaint7.pintarCyan(g); 
       }else if(verificador[2][0]==2){
        Circulo repaint8 = new Circulo(10,220,80,80);
       repaint8.pintarOrange(g); 
   }
   
   
   if(verificador[1][0]==1){
        Circulo repaint9 = new Circulo(10,135,80,80);
       repaint9.pintarCyan(g); 
       }else if(verificador[1][0]==2){
        Circulo repaint10 = new Circulo(10,135,80,80);
       repaint10.pintarOrange(g); 
   }
   
   if(verificador[0][0]==1){
    Circulo repaint11 = new Circulo(10,50,80,80);
       repaint11.pintarCyan(g); 
   }else if(verificador[0][0]==2){
        Circulo repaint12 = new Circulo(10,50,80,80);
       repaint12.pintarOrange(g); 
   } 







/////////////////////////////////////////////////


  if(verificador[5][1]==0){
        Circulo blanco7 = new Circulo(95,475,80,80);
       blanco7.dibujar(g); 
       }else if(verificador[4][1]==0){
        Circulo blanco8 = new Circulo(95,390,80,80);
       blanco8.dibujar(g); 
       }else if(verificador[3][1]==0){
        Circulo blanco9 = new Circulo(95,305,80,80);
       blanco9.dibujar(g); 
       }else if(verificador[2][1]==0){
        Circulo blanco10 = new Circulo(95,220,80,80);
       blanco10.dibujar(g); 
       }else if(verificador[1][1]==0){
        Circulo blanco11 = new Circulo(95,135,80,80);
       blanco11.dibujar(g); 
       }else if(verificador[0][1]==0){
    Circulo blanco12 = new Circulo(95,50,80,80);
       blanco12.dibujar(g); 
   }

   
   if(verificador[5][1]==1){
    Circulo repaint13 = new Circulo(95,475,80,80);
    repaint13.pintarCyan(g);    
   }else if(verificador[5][1]==2){
 Circulo repaint14 = new Circulo(95,475,80,80); 
 repaint14.pintarOrange(g);
   }
   
   if(verificador[4][1]==1){
  Circulo repaint15 = new Circulo(95,390,80,80);
    repaint15.pintarCyan(g);   
   }else  if(verificador[4][1]==2){
    Circulo repaint16 = new Circulo(95,390,80,80);
    repaint16.pintarOrange(g);
   }
   
   if(verificador[3][1]==1){
  Circulo repaint17 = new Circulo(95,305,80,80);
    repaint17.pintarCyan(g);   
   }else  if(verificador[3][1]==2){
    Circulo repaint18 = new Circulo(95,305,80,80);
    repaint18.pintarOrange(g);
   }
   
   if(verificador[2][1]==1){
  Circulo repaint19 = new Circulo(95,220,80,80);
    repaint19.pintarCyan(g);   
   }else  if(verificador[2][1]==2){
    Circulo repaint20 = new Circulo(95,220,80,80);
    repaint20.pintarOrange(g);
   }
   
   if(verificador[1][1]==1){
  Circulo repaint21 = new Circulo(95,135,80,80);
    repaint21.pintarCyan(g);   
   }else  if(verificador[1][1]==2){
    Circulo repaint22 = new Circulo(95,135,80,80);
    repaint22.pintarOrange(g);
   }
   
      if(verificador[0][1]==1){
  Circulo repaint23 = new Circulo(95,50,80,80);
    repaint23.pintarCyan(g);   
   }else  if(verificador[0][1]==2){
    Circulo repaint24 = new Circulo(95,50,80,80);
    repaint24.pintarOrange(g);
   }



//////////////////////////////////////////////////////

if(verificador[5][2]==0){
        Circulo blanco13 = new Circulo(180,475,80,80);
       blanco13.dibujar(g); 
       }else if(verificador[4][2]==0){
        Circulo blanco14= new Circulo(180,390,80,80);
       blanco14.dibujar(g); 
       }else if(verificador[3][2]==0){
        Circulo blanco15= new Circulo(180,305,80,80);
       blanco15.dibujar(g); 
       }else if(verificador[2][2]==0){
        Circulo blanco16 = new Circulo(180,220,80,80);
       blanco16.dibujar(g); 
       }else if(verificador[1][2]==0){
        Circulo blanco17 = new Circulo(180,135,80,80);
       blanco17.dibujar(g); 
       }else if(verificador[0][2]==0){
    Circulo blanco18 = new Circulo(180,50,80,80);
       blanco18.dibujar(g); 
   }



   if(verificador[5][2]==1){
    Circulo repaint25 = new Circulo(180,475,80,80);
    repaint25.pintarCyan(g);    
   }else if(verificador[5][2]==2){
 Circulo repaint26 = new Circulo(180,475,80,80); 
 repaint26.pintarOrange(g);
   }
   
   if(verificador[4][2]==1){
  Circulo repaint27 = new Circulo(180,390,80,80);
    repaint27.pintarCyan(g);   
   }else  if(verificador[4][2]==2){
    Circulo repaint28 = new Circulo(180,390,80,80);
    repaint28.pintarOrange(g);
   }
   
   if(verificador[3][2]==1){
  Circulo repaint29 = new Circulo(180,305,80,80);
    repaint29.pintarCyan(g);   
   }else  if(verificador[3][2]==2){
    Circulo repaint30 = new Circulo(180,305,80,80);
    repaint30.pintarOrange(g);
   }
   
   if(verificador[2][2]==1){
  Circulo repaint31 = new Circulo(180,220,80,80);
    repaint31.pintarCyan(g);   
   }else  if(verificador[2][2]==2){
    Circulo repaint32 = new Circulo(180,220,80,80);
    repaint32.pintarOrange(g);
   }
   
   if(verificador[1][2]==1){
  Circulo repaint33 = new Circulo(180,135,80,80);
    repaint33.pintarCyan(g);   
   }else  if(verificador[1][2]==2){
    Circulo repaint34 = new Circulo(180,135,80,80);
    repaint34.pintarOrange(g);
   }
   
      if(verificador[0][2]==1){
  Circulo repaint35 = new Circulo(180,50,80,80);
    repaint35.pintarCyan(g);   
   }else  if(verificador[0][2]==2){
    Circulo repaint36 = new Circulo(180,50,80,80);
    repaint36.pintarOrange(g);
   }







////////////////////////////////////////////////////////

  if(verificador[5][3]==0){
        Circulo blanco19 = new Circulo(265,475,80,80);
       blanco19.dibujar(g); 
       }else if(verificador[4][3]==0){
        Circulo blanco20= new Circulo(265,390,80,80);
       blanco20.dibujar(g); 
       }else if(verificador[3][3]==0){
        Circulo blanco21= new Circulo(265,305,80,80);
       blanco21.dibujar(g); 
       }else if(verificador[2][3]==0){
        Circulo blanco22 = new Circulo(265,220,80,80);
       blanco22.dibujar(g); 
       }else if(verificador[1][3]==0){
        Circulo blanco23 = new Circulo(265,135,80,80);
       blanco23.dibujar(g); 
       }else if(verificador[0][3]==0){
    Circulo blanco24 = new Circulo(265,50,80,80);
       blanco24.dibujar(g); 
   }







   if(verificador[5][3]==1){
    Circulo repaint37 = new Circulo(265,475,80,80);
    repaint37.pintarCyan(g);    
   }else if(verificador[5][3]==2){
 Circulo repaint38 = new Circulo(265,475,80,80); 
 repaint38.pintarOrange(g);
   }
   
   if(verificador[4][3]==1){
  Circulo repaint39 = new Circulo(265,390,80,80);
    repaint39.pintarCyan(g);   
   }else  if(verificador[4][3]==2){
    Circulo repaint40 = new Circulo(265,390,80,80);
    repaint40.pintarOrange(g);
   }
   
   if(verificador[3][3]==1){
  Circulo repaint41 = new Circulo(265,305,80,80);
    repaint41.pintarCyan(g);   
   }else  if(verificador[3][3]==2){
    Circulo repaint42 = new Circulo(265,305,80,80);
    repaint42.pintarOrange(g);
   }
   
   if(verificador[2][3]==1){
  Circulo repaint43 = new Circulo(265,220,80,80);
    repaint43.pintarCyan(g);   
   }else  if(verificador[2][3]==2){
    Circulo repaint44 = new Circulo(265,220,80,80);
    repaint44.pintarOrange(g);
   }
   
   if(verificador[1][3]==1){
  Circulo repaint45 = new Circulo(265,135,80,80);
    repaint45.pintarCyan(g);   
   }else  if(verificador[1][3]==2){
    Circulo repaint46 = new Circulo(265,135,80,80);
    repaint46.pintarOrange(g);
   }
   
      if(verificador[0][3]==1){
  Circulo repaint47 = new Circulo(265,50,80,80);
    repaint47.pintarCyan(g);   
   }else  if(verificador[0][3]==2){
    Circulo repaint48 = new Circulo(265,50,80,80);
    repaint48.pintarOrange(g);
   }









////////////////////////////////////////////////////




  if(verificador[5][4]==0){
        Circulo blanco25 = new Circulo(350,475,80,80);
       blanco25.dibujar(g); 
       }else if(verificador[4][4]==0){
        Circulo blanco26= new Circulo(350,390,80,80);
       blanco26.dibujar(g); 
       }else if(verificador[3][4]==0){
        Circulo blanco27= new Circulo(350,305,80,80);
       blanco27.dibujar(g); 
       }else if(verificador[2][4]==0){
        Circulo blanco28 = new Circulo(350,220,80,80);
       blanco28.dibujar(g); 
       }else if(verificador[1][4]==0){
        Circulo blanco29 = new Circulo(350,135,80,80);
       blanco29.dibujar(g); 
       }else if(verificador[0][4]==0){
    Circulo blanco30 = new Circulo(350,50,80,80);
       blanco30.dibujar(g); 
  }




 if(verificador[5][4]==1){
    Circulo repaint49 = new Circulo(350,475,80,80);
    repaint49.pintarCyan(g);    
   }else if(verificador[5][4]==2){
 Circulo repaint50 = new Circulo(350,475,80,80); 
 repaint50.pintarOrange(g);
   }
   
   if(verificador[4][4]==1){
  Circulo repaint51 = new Circulo(350,390,80,80);
    repaint51.pintarCyan(g);   
   }else  if(verificador[4][4]==2){
    Circulo repaint52 = new Circulo(350,390,80,80);
    repaint52.pintarOrange(g);
   }
   
   if(verificador[3][4]==1){
  Circulo repaint53 = new Circulo(350,305,80,80);
    repaint53.pintarCyan(g);   
   }else  if(verificador[3][4]==2){
    Circulo repaint54 = new Circulo(350,305,80,80);
    repaint54.pintarOrange(g);
   }
   
   if(verificador[2][4]==1){
  Circulo repaint55 = new Circulo(350,220,80,80);
    repaint55.pintarCyan(g);   
   }else  if(verificador[2][4]==2){
    Circulo repaint56= new Circulo(350,220,80,80);
    repaint56.pintarOrange(g);
   }
   
   if(verificador[1][4]==1){
  Circulo repaint57 = new Circulo(350,135,80,80);
    repaint57.pintarCyan(g);   
   }else  if(verificador[1][4]==2){
    Circulo repaint58 = new Circulo(350,135,80,80);
    repaint58.pintarOrange(g);
   }
   
      if(verificador[0][4]==1){
  Circulo repaint59 = new Circulo(350,50,80,80);
    repaint59.pintarCyan(g);   
   }else  if(verificador[0][4]==2){
    Circulo repaint60 = new Circulo(350,50,80,80);
    repaint60.pintarOrange(g);
   }







/////////////////////////////////////////////////




if(verificador[5][5]==0){
        Circulo blanco31 = new Circulo(435,475,80,80);
       blanco31.dibujar(g); 
       }else if(verificador[4][5]==0){
        Circulo blanco32= new Circulo(435,390,80,80);
       blanco32.dibujar(g); 
       }else if(verificador[3][5]==0){
        Circulo blanco33= new Circulo(435,305,80,80);
       blanco33.dibujar(g); 
       }else if(verificador[2][5]==0){
        Circulo blanco34 = new Circulo(435,220,80,80);
       blanco34.dibujar(g); 
       }else if(verificador[1][5]==0){
        Circulo blanco35 = new Circulo(435,135,80,80);
       blanco35.dibujar(g); 
       }else if(verificador[0][5]==0){
    Circulo blanco36 = new Circulo(435,50,80,80);
       blanco36.dibujar(g); 
  }





 if(verificador[5][5]==1){
    Circulo repaint61 = new Circulo(435,475,80,80);
    repaint61.pintarCyan(g);    
   }else if(verificador[5][5]==2){
 Circulo repaint62 = new Circulo(435,475,80,80); 
 repaint62.pintarOrange(g);
   }
   
   if(verificador[4][5]==1){
  Circulo repaint63 = new Circulo(435,390,80,80);
    repaint63.pintarCyan(g);   
   }else  if(verificador[4][5]==2){
    Circulo repaint64 = new Circulo(435,390,80,80);
    repaint64.pintarOrange(g);
   }
   
   if(verificador[3][5]==1){
  Circulo repaint65 = new Circulo(435,305,80,80);
    repaint65.pintarCyan(g);   
   }else  if(verificador[3][5]==2){
    Circulo repaint66 = new Circulo(435,305,80,80);
    repaint66.pintarOrange(g);
   }
   
   if(verificador[2][5]==1){
  Circulo repaint67 = new Circulo(435,220,80,80);
    repaint67.pintarCyan(g);   
   }else  if(verificador[2][5]==2){
    Circulo repaint68= new Circulo(435,220,80,80);
    repaint68.pintarOrange(g);
   }
   
   if(verificador[1][5]==1){
  Circulo repaint69 = new Circulo(435,135,80,80);
    repaint69.pintarCyan(g);   
   }else  if(verificador[1][5]==2){
    Circulo repaint70 = new Circulo(435,135,80,80);
    repaint70.pintarOrange(g);
   }
   
      if(verificador[0][5]==1){
  Circulo repaint71 = new Circulo(435,50,80,80);
    repaint71.pintarCyan(g);   
   }else  if(verificador[0][5]==2){
    Circulo repaint72 = new Circulo(435,50,80,80);
    repaint72.pintarOrange(g);
   }



//////////////////////////////////////////////////////////
  if(verificador[5][6]==0){
        Circulo blanco37 = new Circulo(520,475,80,80);
       blanco37.dibujar(g); 
       }else if(verificador[4][6]==0){
        Circulo blanco38= new Circulo(520,390,80,80);
       blanco38.dibujar(g); 
       }else if(verificador[3][6]==0){
        Circulo blanco39= new Circulo(520,305,80,80);
       blanco39.dibujar(g); 
       }else if(verificador[2][6]==0){
        Circulo blanco40 = new Circulo(520,220,80,80);
       blanco40.dibujar(g); 
       }else if(verificador[1][6]==0){
        Circulo blanco41 = new Circulo(520,135,80,80);
       blanco41.dibujar(g); 
       }else if(verificador[0][6]==0){
    Circulo blanco42 = new Circulo(520,50,80,80);
       blanco42.dibujar(g); 
  }





 if(verificador[5][6]==1){
    Circulo repaint73 = new Circulo(520,475,80,80);
    repaint73.pintarCyan(g);    
   }else if(verificador[5][6]==2){
 Circulo repaint74 = new Circulo(520,475,80,80); 
 repaint74.pintarOrange(g);
   }
   
   if(verificador[4][6]==1){
  Circulo repaint75 = new Circulo(520,390,80,80);
    repaint75.pintarCyan(g);   
   }else  if(verificador[4][6]==2){
    Circulo repaint76 = new Circulo(520,390,80,80);
    repaint76.pintarOrange(g);
   }
   
   if(verificador[3][6]==1){
  Circulo repaint77 = new Circulo(520,305,80,80);
    repaint77.pintarCyan(g);   
   }else  if(verificador[3][6]==2){
    Circulo repaint78 = new Circulo(520,305,80,80);
    repaint78.pintarOrange(g);
   }
   
   if(verificador[2][6]==1){
  Circulo repaint79 = new Circulo(520,220,80,80);
    repaint79.pintarCyan(g);   
   }else  if(verificador[2][6]==2){
    Circulo repaint80= new Circulo(520,220,80,80);
    repaint80.pintarOrange(g);
   }
   
   if(verificador[1][6]==1){
  Circulo repaint81 = new Circulo(520,135,80,80);
    repaint81.pintarCyan(g);   
   }else  if(verificador[1][6]==2){
    Circulo repaint82 = new Circulo(520,135,80,80);
    repaint82.pintarOrange(g);
   }
   
      if(verificador[0][6]==1){
  Circulo repaint83 = new Circulo(520,50,80,80);
    repaint83.pintarCyan(g);   
   }else  if(verificador[0][6]==2){
    Circulo repaint84 = new Circulo(520,50,80,80);
    repaint84.pintarOrange(g);
   }
  this.getGanador();
  }//metodo
     
     
     /*fin del metodo repaint*/
     
     public void imprimir(){//metodo para ir viendo el estado de la matriz verificador en la terminal
       for (int x=0; x < verificador.length; x++) {
      System.out.print("|");
      for (int y=0; y < verificador[x].length; y++) {
        System.out.print (verificador[x][y]);
        if (y!=verificador[x].length-1) System.out.print("\t");
      }
      System.out.println("|");
    }
    System.out.print("\n\n");
}
      
      
      /*---------------------------------METODOS QUE VERIFICAN EL GANADOR------------------------------*/
     
      public int getGanador(){//METODO GENERAL, ESTE VERIFICA TODOS LOS METODOS DE ABAJO Y RETORNA 1 O 2, SEGÚN EL QUE GANE
   if(this.horizontal(verificador.length-1, 0)==1 || this.vertical(verificador.length-1, verificador[0].length-1)==1||this.diagonal1(verificador.length-1, 0)==1 || this.diagonal2(verificador.length-1, verificador[0].length-1)==1){
    return 1;
   }else if(this.horizontal(verificador.length-1, 0)==2 || this.vertical(verificador.length-1, verificador[0].length-1)==2||this.diagonal1(verificador.length-1, 0)==2|| this.diagonal2(verificador.length-1, verificador[0].length-1)==2){
    return 2;
   }
   return 0;
}
 int num=0;

     
     public int horizontal (int fila, int columna){//VERIFICA LAS LINEAS HORIZONTALES
   
   if(fila==0 && columna>3){
    this.imprimir();
    num=0;
   }else if(columna>3){
    horizontal(fila-1,0);
   }else if(verificador[fila][columna]==1 && verificador[fila][columna+1]==1 && verificador[fila][columna+2]==1 && verificador[fila][columna+3]==1){
    num=1;
   }else if(verificador[fila][columna]==2 && verificador[fila][columna+1]==2 && verificador[fila][columna+2]==2 && verificador[fila][columna+3]==2){  
    num=2;
   }else{
    horizontal(fila, columna+1);
   }
   return num; 
   
  }//metodo
  
  
  public int vertical (int fila, int columna){//VERIFICA LAS LINEAS VERTICALES
  
  if(fila<=3 && columna==0){
    num=0;
   }else if(columna==0){
    vertical(fila-1,verificador.length);
   }else if(verificador[fila][columna]==1 && verificador[fila-1][columna]==1 && verificador[fila-2][columna]==1 && verificador[fila-3][columna]==1){
    num=1;
   }else if(verificador[fila][columna]==2 && verificador[fila-1][columna]==2 && verificador[fila-2][columna]==2 && verificador[fila-3][columna]==2){    
    num=2;
   }else{
    vertical(fila, columna-1);
   }
   return num; 
  
 }
  
  
   public int diagonal1 (int fila, int columna){//VERIFICA LAS DIAGONALES DE IZQUIERDA A DERECHA
    
  if(fila<3 && columna>3){
    num=0;
   }else if(columna>3){
    diagonal1(fila-1,0);
   }else if(verificador[fila][columna]==1 && verificador[fila-1][columna+1]==1 && verificador[fila-2][columna+2]==1 && verificador[fila-3][columna+3]==1){
    num=1;
   }else if(verificador[fila][columna]==2 && verificador[fila-1][columna+1]==2 && verificador[fila-2][columna+2]==2 && verificador[fila-3][columna+3]==2){
    num=2;
   }else{
    diagonal1(fila, columna+1);
   }
   return num; 
 }
 
 
 
  public int diagonal2 (int fila, int columna){//VERIFICA LAS DIAGONALES DE DERECHA A IZQUIERDA
  
  if(fila<=3 && columna<=3){
    num=0;
   }else if(columna<=3){
    diagonal2(fila-1,verificador[0].length-1);
   }else if(verificador[fila][columna]==1 && verificador[fila-1][columna-1]==1 && verificador[fila-2][columna-2]==1 && verificador[fila-3][columna-3]==1){
    num=1;
   }else if(verificador[fila][columna]==2 && verificador[fila-1][columna-1]==2 && verificador[fila-2][columna-2]==2 && verificador[fila-3][columna-03]==2){    
    num=2;
   }else{
    diagonal2(fila, columna-1);
   }
   return num; 
  
 }

    /*---------------FIN DEL METODO QUE VERIFICA EL GANADOR------------------------*/ 
     

  
}//class
