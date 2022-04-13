/**
 * @authors Cameron Davison
 */
//imports
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//creating a Jframe Class to create a JFrame when ran
public class Menus extends JFrame{
    //creating Swing variables
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    /* creating constructor to set the content pane in the Jframe to the jPanel panel1 variable.
    * the constructor also sets the size and default close operation of the frame, as well as its visibility
    * adds action listeners to each button to create a new instance of the Jframe called. a Form file is used to set
    * the properties of the panel, such as how the buttons fit onto the page and the properties of said buttons*/
    public Menus() {
        setContentPane(panel1);
        setSize(300,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new stage_3();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new stage_2();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new stage_1();
            }
        });
    }


}
