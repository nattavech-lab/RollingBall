package Lib;
import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;

public class RolingBall  extends JPanel implements  ActionListener{

  int x = 100;
  int staart_angle=0;

  public   RolingBall(){
   Timer t=new  Timer(100,this);
   t.start();

  
    
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(x, 90, 80, 80);
    g.fillArc(x, 90, 80, 80, staart_angle, 180);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
      x-=2;
      staart_angle+=2;
      if(x<-80) x=getWidth();
      if (staart_angle>=360)staart_angle=0;
      repaint();
        
    }
     
}