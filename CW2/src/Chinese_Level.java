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
public class Chinese_Level extends JPanel{
    //boolean values to detect whether an item is being moved or not
    boolean dragValid = false;
    boolean dragValid2 = false;
    boolean dragValid3 = false;
    boolean dragValid4 = false;
    boolean dragValid5 = false;
    boolean dragValid6 = false;
    boolean dragValid7 = false;
    boolean dragValid8 = false;
    boolean dragValid9 = false;
    boolean dragValid10 = false;
    boolean dragValid11 = false;
    boolean dragValid12 = false;
    boolean dragValid13 = false;

    //using ImageIcon variables to create a new instance of an image file
    ImageIcon finishedBackgrounds = new ImageIcon("Stage_3/finishedBackgrounds.PNG");
    ImageIcon BrokenPotPiece1 = new ImageIcon("Stage_3/BrokenPotPiece1.PNG");
    ImageIcon BrokenPotPiece2 = new ImageIcon("Stage_3/BrokenPotPiece2.PNG");
    ImageIcon BrokenPotPiece3 = new ImageIcon("Stage_3/BrokenPotPiece3.PNG");
    ImageIcon BrokenPotPiece4 = new ImageIcon("Stage_3/BrokenPotPiece4.PNG");
    ImageIcon BrokenPotPiece5 = new ImageIcon("Stage_3/BrokenPotPiece5.PNG");
    ImageIcon BrokenPotPiece6 = new ImageIcon("Stage_3/BrokenPotPiece6.PNG");
    ImageIcon BrokenPotPiece7 = new ImageIcon("Stage_3/BrokenPotPiece7.PNG");
    ImageIcon BrokenPotPiece8 = new ImageIcon("Stage_3/BrokenPotPiece8.PNG");
    ImageIcon BrokenPotPiece9 = new ImageIcon("Stage_3/BrokenPotPiece9.PNG");
    ImageIcon BrokenPotPiece10 = new ImageIcon("Stage_3/BrokenPotPiece10.PNG");
    ImageIcon BrokenPotPiece11 = new ImageIcon("Stage_3/BrokenPotPiece11.PNG");
    ImageIcon BrokenPotPiece12 = new ImageIcon("Stage_3/BrokenPotPiece12.PNG");
    ImageIcon BrokenPotPiece13 = new ImageIcon("Stage_3/BrokenPotPiece13.PNG");

    //Integers used to grab the Width and Height of each Image
    final int WIDTH2 = BrokenPotPiece1.getIconWidth();
    final int HEIGHT2 = BrokenPotPiece1.getIconHeight();
    final int WIDTH3 = BrokenPotPiece2.getIconWidth();
    final int HEIGHT3 = BrokenPotPiece2.getIconHeight();
    final int WIDTH4 = BrokenPotPiece3.getIconWidth();
    final int HEIGHT4 = BrokenPotPiece3.getIconHeight();
    final int WIDTH5 = BrokenPotPiece4.getIconWidth();
    final int HEIGHT5 = BrokenPotPiece4.getIconHeight();
    final int WIDTH6 = BrokenPotPiece5.getIconWidth();
    final int HEIGHT6 = BrokenPotPiece5.getIconHeight();
    final int WIDTH7 = BrokenPotPiece6.getIconWidth();
    final int HEIGHT7 = BrokenPotPiece6.getIconHeight();
    final int WIDTH8 = BrokenPotPiece7.getIconWidth();
    final int HEIGHT8 = BrokenPotPiece7.getIconHeight();
    final int WIDTH9 = BrokenPotPiece8.getIconWidth();
    final int HEIGHT9 = BrokenPotPiece8.getIconHeight();
    final int WIDTH10 = BrokenPotPiece9.getIconWidth();
    final int HEIGHT10 = BrokenPotPiece9.getIconHeight();
    final int WIDTH11 = BrokenPotPiece10.getIconWidth();
    final int HEIGHT11 = BrokenPotPiece10.getIconHeight();
    final int WIDTH12 = BrokenPotPiece11.getIconWidth();
    final int HEIGHT12 = BrokenPotPiece11.getIconHeight();
    final int WIDTH13 = BrokenPotPiece12.getIconWidth();
    final int HEIGHT13 = BrokenPotPiece12.getIconHeight();
    final int WIDTH14 = BrokenPotPiece13.getIconWidth();
    final int HEIGHT14 = BrokenPotPiece13.getIconHeight();

    //point values to set the locations of ImageIcons
    Point Background;
    Point imageCorner;
    Point imageCorner2;
    Point imageCorner3;
    Point imageCorner4;
    Point imageCorner5;
    Point imageCorner6;
    Point imageCorner7;
    Point imageCorner8;
    Point imageCorner9;
    Point imageCorner10;
    Point imageCorner11;
    Point imageCorner12;
    Point imageCorner13;

    //point values to get the locations of ImageIcons
    Point prevPT;
    Point prevPT2;
    Point prevPT3;
    Point prevPT4;
    Point prevPT5;
    Point prevPT6;
    Point prevPT7;
    Point prevPT8;
    Point prevPT9;
    Point prevPT10;
    Point prevPT11;
    Point prevPT12;
    Point prevPT13;

    /*creating a constructor for "Chinese_Level" class
    sets the locations of the ImageCorner Point variables as well as adds DragListener and ClickListener */
    Chinese_Level() {
        Background = new Point(0,0);
        imageCorner = new Point(240, 10);
        imageCorner2 = new Point(97,130);
        imageCorner3 = new Point(164,274);
        imageCorner4 = new Point(320,20);
        imageCorner5 = new Point(590,10);
        imageCorner6 = new Point(250,230);
        imageCorner7 = new Point(120,450);
        imageCorner8 = new Point(430,480);
        imageCorner9 = new Point(600,500);
        imageCorner10 = new Point(10,20);
        imageCorner11 = new Point(400,285);
        imageCorner12 = new Point(450,20);
        imageCorner13 = new Point(7,260);

        Chinese_Level.ClickListener clickListener = new Chinese_Level.ClickListener();
        Chinese_Level.DragListener dragListener = new Chinese_Level.DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    /*paint component method to fetch the x and y axis of all ImageIcons using Points defined under "imageCorner" names
      uses a parameter graphics to use a paintComponents function to allow for the adding of items to the Panel */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        finishedBackgrounds.paintIcon(this, g, (int) Background.getX(), (int) Background.getY());
        BrokenPotPiece1.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
        BrokenPotPiece2.paintIcon(this, g, (int) imageCorner2.getX(), (int) imageCorner2.getY());
        BrokenPotPiece3.paintIcon(this, g, (int) imageCorner3.getX(), (int) imageCorner3.getY());
        BrokenPotPiece4.paintIcon(this, g, (int) imageCorner4.getX(), (int) imageCorner4.getY());
        BrokenPotPiece5.paintIcon(this, g, (int) imageCorner5.getX(), (int) imageCorner5.getY());
        BrokenPotPiece6.paintIcon(this, g, (int) imageCorner6.getX(), (int) imageCorner6.getY());
        BrokenPotPiece7.paintIcon(this, g, (int) imageCorner7.getX(), (int) imageCorner7.getY());
        BrokenPotPiece8.paintIcon(this, g, (int) imageCorner8.getX(), (int) imageCorner8.getY());
        BrokenPotPiece9.paintIcon(this, g, (int) imageCorner9.getX(), (int) imageCorner9.getY());
        BrokenPotPiece10.paintIcon(this, g, (int) imageCorner10.getX(), (int) imageCorner10.getY());
        BrokenPotPiece11.paintIcon(this, g, (int) imageCorner11.getX(), (int) imageCorner11.getY());
        BrokenPotPiece12.paintIcon(this, g, (int) imageCorner12.getX(), (int) imageCorner12.getY());
        BrokenPotPiece13.paintIcon(this, g, (int) imageCorner13.getX(), (int) imageCorner13.getY());
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
            prevPT9 = e.getPoint();
            prevPT10 = e.getPoint();
            prevPT11 = e.getPoint();
            prevPT12 = e.getPoint();
            prevPT13 = e.getPoint();
            dragValid = (e.getPoint().getX() > imageCorner.getX()) &&
                    (e.getPoint().getX() < (imageCorner.getX() + WIDTH2)) &&
                    (e.getPoint().getY() > imageCorner.getY()) &&
                    (e.getPoint().getY() < (imageCorner.getY() + HEIGHT2));
            dragValid2 = (e.getPoint().getX() > imageCorner2.getX()) &&
                    (e.getPoint().getX() < (imageCorner2.getX() + WIDTH3)) &&
                    (e.getPoint().getY() > imageCorner2.getY()) &&
                    (e.getPoint().getY() < (imageCorner2.getY() + HEIGHT3));
            dragValid3 = (e.getPoint().getX() > imageCorner3.getX()) &&
                    (e.getPoint().getX() < (imageCorner3.getX() + WIDTH4)) &&
                    (e.getPoint().getY() > imageCorner3.getY()) &&
                    (e.getPoint().getY() < (imageCorner3.getY() + HEIGHT4));
            dragValid4 = (e.getPoint().getX() > imageCorner4.getX()) &&
                    (e.getPoint().getX() < (imageCorner4.getX() + WIDTH5)) &&
                    (e.getPoint().getY() > imageCorner4.getY()) &&
                    (e.getPoint().getY() < (imageCorner4.getY() + HEIGHT5));
            dragValid5 = (e.getPoint().getX() > imageCorner5.getX()) &&
                    (e.getPoint().getX() < (imageCorner5.getX() + WIDTH6)) &&
                    (e.getPoint().getY() > imageCorner5.getY()) &&
                    (e.getPoint().getY() < (imageCorner5.getY() + HEIGHT6));
            dragValid6 = (e.getPoint().getX() > imageCorner6.getX()) &&
                    (e.getPoint().getX() < (imageCorner6.getX() + WIDTH7)) &&
                    (e.getPoint().getY() > imageCorner6.getY()) &&
                    (e.getPoint().getY() < (imageCorner6.getY() + HEIGHT7));
            dragValid7 = (e.getPoint().getX() > imageCorner7.getX()) &&
                    (e.getPoint().getX() < (imageCorner7.getX() + WIDTH8)) &&
                    (e.getPoint().getY() > imageCorner7.getY()) &&
                    (e.getPoint().getY() < (imageCorner7.getY() + HEIGHT8));
            dragValid8 = (e.getPoint().getX() > imageCorner8.getX()) &&
                    (e.getPoint().getX() < (imageCorner8.getX() + WIDTH9)) &&
                    (e.getPoint().getY() > imageCorner8.getY()) &&
                    (e.getPoint().getY() < (imageCorner8.getY() + HEIGHT9));
            dragValid9 = (e.getPoint().getX() > imageCorner9.getX()) &&
                    (e.getPoint().getX() < (imageCorner9.getX() + WIDTH10)) &&
                    (e.getPoint().getY() > imageCorner9.getY()) &&
                    (e.getPoint().getY() < (imageCorner9.getY() + HEIGHT10));
            dragValid10 = (e.getPoint().getX() > imageCorner10.getX()) &&
                    (e.getPoint().getX() < (imageCorner10.getX() + WIDTH11)) &&
                    (e.getPoint().getY() > imageCorner10.getY()) &&
                    (e.getPoint().getY() < (imageCorner10.getY() + HEIGHT11));
            dragValid11 = (e.getPoint().getX() > imageCorner11.getX()) &&
                    (e.getPoint().getX() < (imageCorner11.getX() + WIDTH12)) &&
                    (e.getPoint().getY() > imageCorner11.getY()) &&
                    (e.getPoint().getY() < (imageCorner11.getY() + HEIGHT12));
            dragValid12 = (e.getPoint().getX() > imageCorner12.getX()) &&
                    (e.getPoint().getX() < (imageCorner12.getX() + WIDTH13)) &&
                    (e.getPoint().getY() > imageCorner12.getY()) &&
                    (e.getPoint().getY() < (imageCorner12.getY() + HEIGHT13));
            dragValid13 = (e.getPoint().getX() > imageCorner13.getX()) &&
                    (e.getPoint().getX() < (imageCorner13.getX() + WIDTH14)) &&
                    (e.getPoint().getY() > imageCorner13.getY()) &&
                    (e.getPoint().getY() < (imageCorner13.getY() + HEIGHT14));

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
            if (dragValid8) {
                Point currentPt = e.getPoint();
                imageCorner8.translate(
                        (int) (currentPt.getX() - prevPT8.getX()),
                        (int) (currentPt.getY() - prevPT8.getY())
                );
                prevPT8 = currentPt;
                repaint();
            }
            if (dragValid9) {
                Point currentPt = e.getPoint();
                imageCorner9.translate(
                        (int) (currentPt.getX() - prevPT9.getX()),
                        (int) (currentPt.getY() - prevPT9.getY())
                );
                prevPT9 = currentPt;
                repaint();
            }
            if (dragValid10) {
                Point currentPt = e.getPoint();
                imageCorner10.translate(
                        (int) (currentPt.getX() - prevPT10.getX()),
                        (int) (currentPt.getY() - prevPT10.getY())
                );
                prevPT10 = currentPt;
                repaint();
            }
            if (dragValid11) {
                Point currentPt = e.getPoint();
                imageCorner11.translate(
                        (int) (currentPt.getX() - prevPT11.getX()),
                        (int) (currentPt.getY() - prevPT11.getY())
                );
                prevPT11 = currentPt;
                repaint();
            }
            if (dragValid12) {
                Point currentPt = e.getPoint();
                imageCorner12.translate(
                        (int) (currentPt.getX() - prevPT12.getX()),
                        (int) (currentPt.getY() - prevPT12.getY())
                );
                prevPT12 = currentPt;
                repaint();
            }
            if (dragValid13) {
                Point currentPt = e.getPoint();
                imageCorner13.translate(
                        (int) (currentPt.getX() - prevPT13.getX()),
                        (int) (currentPt.getY() - prevPT13.getY())
                );
                prevPT13 = currentPt;
                repaint();
            }

        }

    }

}
