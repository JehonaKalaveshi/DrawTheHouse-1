import java.awt.*;
import javax.swing.*; 

public class Controller
{
  public static void main(String[] a){
  int input = JOptionPane.showConfirmDialog(null ,"Do you want to play? ");
  if(input == 0)
   {
      Loop game = new Loop();
      game.conditions();}
  else {
       System.exit(0);
       }
 }

}