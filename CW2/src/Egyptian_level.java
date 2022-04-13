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
public class Egyptian_level extends JPanel {
    //boolean values to detect whether an item is being moved or not
    boolean dragValid = false;
    boolean dragValid2 = false;
    boolean dragValid3 = false;
    boolean dragValid4 = false;
    boolean dragValid5 = false;
    boolean dragValid6 = false;
    boolean dragValid7 = false;


    //using ImageIcon variables to create a new instance of an image file
    ImageIcon topMiddle = new ImageIcon("Stage_1/top center.PNG");
    ImageIcon middleLeft = new ImageIcon("Stage_1/middle left.PNG");
    ImageIcon middleCenter = new ImageIcon("Stage_1/middle center.PNG");
    ImageIcon middleRight = new ImageIcon("Stage_1/middle right.PNG");
    ImageIcon bottomLeft = new ImageIcon("Stage_1/bottom left.PNG");
    ImageIcon bottomCenter = new ImageIcon("Stage_1/bottom center.PNG");
    ImageIcon bottomRight = new ImageIcon("Stage_1/bottom right.PNG");
    ImageIcon TextBox1 = new ImageIcon("Stage_1/text done.PNG");
    ImageIcon EmptyBackground = new ImageIcon("Stage_1/background 1.PNG");



    //Integers used to grab the Width and Height of each Image
    final int WIDTH = topMiddle.getIconWidth();
    final int HEIGHT = topMiddle.getIconHeight();
    final int WIDTH2 = middleLeft.getIconWidth();
    final int HEIGHT2 = middleLeft.getIconHeight();
    final int WIDTH3 = middleCenter.getIconWidth();
    final int HEIGHT3 = middleCenter.getIconHeight();
    final int WIDTH4 = middleRight.getIconWidth();
    final int HEIGHT4 = middleRight.getIconHeight();
    final int WIDTH5 = bottomLeft.getIconWidth();
    final int HEIGHT5 = bottomLeft.getIconHeight();
    final int WIDTH6 = bottomCenter.getIconWidth();
    final int HEIGHT6 = bottomCenter.getIconHeight();
    final int WIDTH7 = bottomRight.getIconWidth();
    final int HEIGHT7 = bottomRight.getIconHeight();

    //point values to set the locations of ImageIcons
    Point solve;
    Point nextPot;
    Point Background;
    Point imageCorner;
    Point imageCorner2;
    Point imageCorner3;
    Point imageCorner4;
    Point imageCorner5;
    Point imageCorner6;
    Point imageCorner7;
    Point imageCorner8;


    //point values to get the locations of ImageIcons
    Point prevPT;
    Point prevPT2;
    Point prevPT3;
    Point prevPT4;
    Point prevPT5;
    Point prevPT6;
    Point prevPT7;
    Point prevPT8;


    /*creating a constructor for "Egyptian_level" class
      sets the locations of the ImageCorner Point variables as well as adds DragListener and ClickListener */
    Egyptian_level() {
        this.setLayout(null);
        Background = new Point(0,0);
        nextPot = new Point(550,150);
        solve = new Point(750,150);
        imageCorner = new Point(300, 300);
        imageCorner2 = new Point(15,15);
        imageCorner3 = new Point(600,59);
        imageCorner4 = new Point(200,80);
        imageCorner5 = new Point(60 ,630);
        imageCorner6 = new Point(260,420);
        imageCorner7 = new Point(390,20);
        imageCorner8 = new Point(50,300);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    /*paint component method to fetch the x and y axis of all ImageIcons using Points defined under "imageCorner" names
      uses a parameter graphics to use a paintComponents function to allow for the adding of items to the Panel */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        EmptyBackground.paintIcon(this, g, (int) Background.getX(), (int) Background.getY());
        topMiddle.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
        middleLeft.paintIcon(this, g, (int) imageCorner2.getX(), (int) imageCorner2.getY());
        middleCenter.paintIcon(this, g, (int) imageCorner3.getX(), (int) imageCorner3.getY());
        middleRight.paintIcon(this, g, (int) imageCorner4.getX(), (int) imageCorner4.getY());
        bottomLeft.paintIcon(this, g, (int) imageCorner5.getX(), (int) imageCorner5.getY());
        bottomCenter.paintIcon(this, g, (int) imageCorner6.getX(), (int) imageCorner6.getY());
        bottomRight.paintIcon(this, g, (int) imageCorner7.getX(), (int) imageCorner7.getY());
        TextBox1.paintIcon(this, g, (int) imageCorner8.getX(), (int) imageCorner8.getY());
    }
    /* clickListener class to make use of mouseEvent and MouseAdapter functions to fetch the location of the
       spot where the mouse has been pressed, in conjucture with the location of the image to detect if the mouse
       click is in range of the image. */
    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPT = e.getPoint();
            prevPT2 = e.getPoint();
            prevPT3 = e.getPoint();
            prevPT4 = e.getPoint();
            prevPT5 = e.getPoint();
            prevPT6 = e.getPoint();
            prevPT7 = e.getPoint();
            prevPT8 = e.getPoint();

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
            dragValid7 = (e.getPoint().getX() > imageCorner7.getX()) &&
                    (e.getPoint().getX() < (imageCorner7.getX() + WIDTH7)) &&
                    (e.getPoint().getY() > imageCorner7.getY()) &&
                    (e.getPoint().getY() < (imageCorner7.getY() + HEIGHT7));

        }
    }

    /*  the DragListener class makes use of the MouseMotionAdapter and the MouseEvent functions
        it detects whether an item is being "grabbed" by having the click be in the same
        location as the image. while mouse is held down, and has clicked over the image,
        the image will move the location the mouse moves to as long as the mouse button
        is held down. the repaint function is used to set the image to its new location */
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            if (dragValid) {
                Point currentPt = e.getPoint();
                imageCorner.translate(
                        (int) (currentPt.getX() - prevPT.getX()),
                        (int) (currentPt.getY() - prevPT.getY())
                );
                prevPT = currentPt;
                repaint();
            }
            if (dragValid2) {
                Point currentPt = e.getPoint();
                imageCorner2.translate(
                        (int) (currentPt.getX() - prevPT2.getX()),
                        (int) (currentPt.getY() - prevPT2.getY())
                );
                prevPT2 = currentPt;
                repaint();
            }
            if (dragValid3) {
                Point currentPt = e.getPoint();
                imageCorner3.translate(
                        (int) (currentPt.getX() - prevPT3.getX()),
                        (int) (currentPt.getY() - prevPT3.getY())
                );
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
                repaint();
            }
            if (dragValid5) {
                Point currentPt = e.getPoint();
                imageCorner5.translate(
                        (int) (currentPt.getX() - prevPT5.getX()),
                        (int) (currentPt.getY() - prevPT5.getY())
                );
                prevPT5 = currentPt;
                repaint();
            }
            if (dragValid6) {
                Point currentPt = e.getPoint();
                imageCorner6.translate(
                        (int) (currentPt.getX() - prevPT6.getX()),
                        (int) (currentPt.getY() - prevPT6.getY())
                );
                prevPT6 = currentPt;
                repaint();
            }
            if (dragValid7) {
                Point currentPt = e.getPoint();
                imageCorner7.translate(
                        (int) (currentPt.getX() - prevPT7.getX()),
                        (int) (currentPt.getY() - prevPT7.getY())
                );
                prevPT7 = currentPt;
                repaint();
            }
            }
        }
    }


