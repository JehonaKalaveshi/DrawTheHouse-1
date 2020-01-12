import java.awt.*;  
import javax.swing.*;

public class View extends JPanel
{ private int width;  // the frame's width
  private int height; // the frame's height
  private String a = ""; // holds the sentence to be displayed
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String h = "";
  private int x_position; 
  private int y_position; 
  

  
  public View(int w, int h)
  { width = w;
    height = h;
    x_position = (width -40 )/ 2;  
    y_position = (height -60)/ 2;
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Draw the house");
    my_frame.setSize(width, height);
    my_frame.setVisible(true);
  }

  
  public void paintComponent(Graphics g)
  { g.setColor(Color.black);
    g.drawString(a, x_position , y_position + 18);
    g.drawString(b, x_position , y_position + 29 );
    g.drawString(b, x_position , y_position + 39 );
    g.drawString(a, x_position , y_position + 40 );
    g.drawString(c, x_position , y_position );
    g.drawString(d, x_position , y_position + 8 );
    g.drawString(e, x_position , y_position + 16 ); 
    g.drawString(f, x_position + 10, y_position + 40 );
    g.drawString(h, x_position , y_position + 32);
    g.drawString(h, x_position + 16, y_position + 32 );
  
  }
  

  
  public void drawBase()
  { a = "____";
    b = "|        |";

    this.repaint();  // indirectly forces  paintComponent  to execute
  }

  
  public void drawRoof()
  { c = "    /\\   ";
    d = "   /  \\  ";
    e = "  /    \\ ";

    this.drawBase();  // force a rewrite of the existing sentence
  }
  
  public void drawDoor()
  { 
   f ="||" ;
   this.drawRoof(); 
  }
  
  public void drawWindows()
  {
   h = "|x|";
   this.drawDoor();
  }
  
   
  

}
 