/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtaillan
 */
package go2; 

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void affichePosition() {
        System.out.println("Pierre en position (" + this.getX() + ", " + this.getY() + ")");
}
    
    public boolean comparePoint(Point2D p1, Point2D p2) {
        if ((p1.getX() == p2.getX() ) && (p1.getY() == p2.getY())) {
            return true;
        }
        else {
           return false;
        }
    }
}
