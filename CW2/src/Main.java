import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main  {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable(){
                    public void run(){
                        new Menus();
                    }
                });
    }
    }

