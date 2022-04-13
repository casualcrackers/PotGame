/**
 * @authors Cameron Davison
 */
//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


//creating class and having it extend jPanel so that it creates a JPanel when ran
public class Greek_Level extends JPanel {

    //boolean values to detect whether an item is being moved or not
    boolean dragValid = false;
    boolean dragValid2 = false;
    boolean dragValid3 = false;
    boolean dragValid4 = false;
    boolean dragValid5 = false;
    boolean dragValid6 = false;

    //using ImageIcon variables to create a new instance of an image file
    ImageIcon Backgrounds = new ImageIcon("Stage_2/Background.PNG");
    ImageIcon bottom_Right = new ImageIcon("Stage_2/Right_Bottom.PNG");
    ImageIcon bottom_Left = new ImageIcon("Stage_2/Left_Bottom.PNG");
    ImageIcon middle_Right = new ImageIcon("Stage_2/Middle_Right.PNG");
    ImageIcon middle_Left = new ImageIcon("Stage_2/Middle_Left.PNG");
    ImageIcon top_Right = new ImageIcon("Stage_2/Top_Right.PNG");
    ImageIcon top_Left = new ImageIcon("Stage_2/Top_Left.PNG");

    //Integers used to grab the Width and Height of each Image
    final int WIDTH = bottom_Right.getIconWidth();
    final int HEIGHT = bottom_Right.getIconHeight();
    final int WIDTH2 = bottom_Left.getIconWidth();
    final int HEIGHT2 = bottom_Left.getIconHeight();
    final int WIDTH3 = middle_Right.getIconWidth();
    final int HEIGHT3 = middle_Right.getIconHeight();
    final int WIDTH4 = middle_Left.getIconWidth();
    final int HEIGHT4 = middle_Left.getIconHeight();
    final int WIDTH5 = top_Right.getIconWidth();
    final int HEIGHT5 = top_Right.getIconHeight();
    final int WIDTH6 = top_Left.getIconWidth();
    final int HEIGHT6 = top_Left.getIconHeight();

    //point values to set the locations of ImageIcons
    Point Background;
    Point imageCorner;
    Point imageCorner2;
    Point imageCorner3;
    Point imageCorner4;
    Point imageCorner5;
    Point imageCorner6;

    //point values to get the locations of ImageIcons
    Point prevPT;
    Point prevPT2;
    Point prevPT3;
    Point prevPT4;
    Point prevPT5;
    Point prevPT6;

    /*creating a constructor for "Greek_Level" class
    sets the locations of the ImageCorner Point variables as well as adds DragListener and ClickListener */
    Greek_Level() {
        this.setLayout(null);
        Background = new Point(0,0);
        imageCorner = new Point(160, 130);
        imageCorner2 = new Point(140,420);
        imageCorner3 = new Point(300,200);
        imageCorner4 = new Point(330,30);
        imageCorner5 = new Point(280,360);
        imageCorner6 = new Point(20,285);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    /*paint component method to fetch the x and y-axis of all ImageIcons using Points defined under "imageCorner" names
      uses a parameter graphics to use a paintComponents function to allow for the adding of items to the Panel */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Backgrounds.paintIcon(this, g, (int) Background.getX(), (int) Background.getY());
        bottom_Right.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
        bottom_Left.paintIcon(this, g, (int) imageCorner2.getX(), (int) imageCorner2.getY());
        middle_Right.paintIcon(this, g, (int) imageCorner3.getX(), (int) imageCorner3.getY());
        middle_Left.paintIcon(this, g, (int) imageCorner4.getX(), (int) imageCorner4.getY());
        top_Right.paintIcon(this, g, (int) imageCorner5.getX(), (int) imageCorner5.getY());
        top_Left.paintIcon(this, g, (int) imageCorner6.getX(), (int) imageCorner6.getY());
    }

    /* clickListener class to make use of mouseEvent and MouseAdapter functions to fetch the location of the
       spot where the mouse has been pressed, in conjuncture with the location of the image to detect if the mouse
       click is in range of the image. */
    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPT = e.getPoint();
            prevPT2 = e.getPoint();
            prevPT3 = e.getPoint();
            prevPT4 = e.getPoint();
            prevPT5 = e.getPoint();
            prevPT6 = e.getPoint();

            dragValid = (e.getPoint().getX() > imageCorner.getX()) &&
                    (e.getPoint().getX() < (imageCorner.getX() + WIDTH)) &&
                    (e.getPoint().getY() > imageCorner.getY()) &&
                    (e.getPoint().getY() < (imageCorner.getY() + HEIGHT));
            dragValid2 = (e.getPoint().getX() > imageCorner2.getX()) &&
                    (e.getPoint().getX() < (imageCorner2.getX() + WIDTH2)) &&
                    (e.getPoint().getY() > imageCorner2.getY()) &&
                    (e.getPoint().getY() < (imageCorner2.getY() + HEIGHT2));
            dragValid3 = (e.getPoint().getX() > imageCorner3.getX()) &&
                    (e.getPoint().getX() < (imageCorner3.getX() + WIDTH3)) &&
                    (e.getPoint().getY() > imageCorner3.getY()) &&
                    (e.getPoint().getY() < (imageCorner3.getY() + HEIGHT3));
            dragValid4 = (e.getPoint().getX() > imageCorner4.getX()) &&
                    (e.getPoint().getX() < (imageCorner4.getX() + WIDTH4)) &&
                    (e.getPoint().getY() > imageCorner4.getY()) &&
                    (e.getPoint().getY() < (imageCorner4.getY() + HEIGHT4));
            dragValid5 = (e.getPoint().getX() > imageCorner5.getX()) &&
                    (e.getPoint().getX() < (imageCorner5.getX() + WIDTH5)) &&
                    (e.getPoint().getY() > imageCorner5.getY()) &&
                    (e.getPoint().getY() < (imageCorner5.getY() + HEIGHT5));
            dragValid6 = (e.getPoint().getX() > imageCorner6.getX()) &&
                    (e.getPoint().getX() < (imageCorner6.getX() + WIDTH6)) &&
                    (e.getPoint().getY() > imageCorner6.getY()) &&
                    (e.getPoint().getY() < (imageCorner6.getY() + HEIGHT6));

        }
    }

    /*the DragListener class makes use of the MouseMotionAdapter and the MouseEvent functions
    it detects whether an item is being "grabbed" by having the click be in the same
    location as the image. while mouse is held down, and has clicked over the image,
    the image will move the location the mouse moves to as long as the mouse button
    is held down. the repaint function is used to set the image to its new location*/
    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            if (dragValid) {
                Point currentPt = e.getPoint();
                imageCorner.translate(
                        (int) (currentPt.getX() - prevPT.getX()),
                        (int) (currentPt.getY() - prevPT.getY())
                );
                System.out.println(currentPt);
                prevPT = currentPt;
                repaint();

            }
            if (dragValid2) {
                Point currentPt = e.getPoint();
                imageCorner2.translate(
                        (int) (currentPt.getX() - prevPT2.getX()),
                        (int) (currentPt.getY() - prevPT2.getY())
                );
                System.out.println(currentPt);
                prevPT2 = currentPt;
                repaint();

            }
            if (dragValid3) {
                Point currentPt = e.getPoint();
                imageCorner3.translate(
                        (int) (currentPt.getX() - prevPT3.getX()),
                        (int) (currentPt.getY() - prevPT3.getY())
                );
                System.out.println(currentPt);
                prevPT3 = currentPt;
                repaint();

            }
            if (dragValid4) {
                Point currentPt = e.getPoint();
                imageCorner4.translate(
                        (int) (currentPt.getX() - prevPT4.getX()),
                        (int) (currentPt.getY() - prevPT4.getY())
                );
                prevPT4 = currentPt;
                System.out.println(currentPt);
                repaint();

            }
            if (dragValid5) {
                Point currentPt = e.getPoint();
                imageCorner5.translate(
                        (int) (currentPt.getX() - prevPT5.getX()),
                        (int) (currentPt.getY() - prevPT5.getY())
                );
                prevPT5 = currentPt;
                System.out.println(currentPt);
                repaint();

            }
            if (dragValid6) {
                Point currentPt = e.getPoint();
                imageCorner6.translate(
                        (int) (currentPt.getX() - prevPT6.getX()),
                        (int) (currentPt.getY() - prevPT6.getY())
                );
                prevPT6 = currentPt;
                System.out.println(currentPt);
                repaint();

            }


        }

    }

}
