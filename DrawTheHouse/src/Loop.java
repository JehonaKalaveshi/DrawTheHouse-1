import java.awt.*;
import javax.swing.*;

public class Loop {
  private int die;
  Die l = new Die();
  Model model = new Model();
  View draw = new View(200,200);
 
 public void conditions() { 
   while(!model.house) {

       int roll = JOptionPane.showConfirmDialog(null ,"Do you want to roll the dice? ");
       if(roll == 0)
       {
           die = l.throw1();
           System.out.println("Die = " + die);
       }
       else {
    	   System.exit(0);
       }
   
      

      if(die==6 && !model.body)
      {
       draw.drawBase();
       model.body = true;
      
      }
      if(die == 5 && model.body && !model.roof)
      {
        draw.drawRoof();
        model.roof = true;
      
      }
      if(die==4 && model.body && model.roof && !model.door)       
      {
        draw.drawDoor();
        model.door = true;
      
      }
      if(die==3 && model.body && model.roof && model.door && !model.windows)
      {
        draw.drawWindows();
        model.windows = true;
      
      }
      if(model.body && model.roof && model.door && model.windows)
      {
        model.house = true;
        JOptionPane.showMessageDialog(null, "The house is finished!");
        break;
      }
    }     
  }    
} 
