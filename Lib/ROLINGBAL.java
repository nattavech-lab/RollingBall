package Lib;
import java.awt.*;
import java.swing.*;

import javax.swing.JPanel;

public class ROLINGBAL  extends JPanel{
  public void paintComponent(Graphics g){
    g.drawOval(100, 90, 80, 80);
    g.fillArc(100, 90, 80, 80, 0, 180);
  }
     
}