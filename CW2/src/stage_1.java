//imports
import javax.swing.*;
import java.awt.*;

//creating a Jframe Class to create a JFrame when ran
public class stage_1 extends JFrame{
    //calling instance of "Egyptian_level" Class
    Egyptian_level egy = new Egyptian_level();

    /*sets properties of JFrame using constructor. adds "Egyptian_level" JPanel to the Jframe, sets background,Title,
      Size,DefaultCloseOperation,Visible properties of the Jframe, as well as adds a JOptionPane to let the user know
      how to quit out of the current puzzle */
    stage_1(){
        this.add(egy);
        this.setTitle("drag and drop demo");
        this.setSize(1000,800);
        this.setVisible(true);
        this.setBackground(new Color(176,224,230));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(null,"please press the x button to exit out of the puzzle");
    }
}
