package firstproject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo extends JFrame{
  public GraphicsDemo(){
	  setTitle("Graphics DEmo");
	  setSize(800,480);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void paint(Graphics g){
	  g.setColor(Color.black);
	  g.fillRect(0, 0, 800, 480);
	  g.setColor(Color.blue);
	  g.drawRect(60, 200, 10, 290);
	  g.setColor(Color.white);
	  g.drawString("My Name is Ghayyas", 200,400);
	  
    }
	  
  public static void main(String[] args){
	  GraphicsDemo demo = new GraphicsDemo();
  }
  
}
