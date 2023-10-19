import java.awt.Point;
import java.io.*;
import java.lang.Integer;
public class Equation {
    Point p1;
    Point p2;
    double slope;


    public Equation(String point1, String point2) {
        int x = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        int y = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")")));
        p1 = new Point(x, y);
        int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        int y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 1, point2.indexOf(")")));
        p2 = new Point(x2, y2);
        slope = 0;

    }

    public String getP1() {
        return p1.toString();
    }

    public String getP2() {
        return p2.toString();
    }

    public double distance() {
        return p1.distance(p2.getX(), p2.getY());
    }

    public String slope() {
        slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        if (slope == 1) {
            return "";
        } else if (slope == -1) {
            return "-";
        } else if (slope % 1.0 == 0) {
            return String.valueOf(slope);
        } else if (p2.getY() - p1.getY() < 0 && p2.getX() - p1.getX() < 0) {
            return Math.abs((p2.getY() - p1.getY())) + "/" + Math.abs((p2.getX() - p1.getX()));
        } else if (p2.getY() - p1.getY() > 0 && p2.getX() - p1.getX() < 0) {
            return "-" + (p2.getY() - p1.getY()) + "/" + (p2.getX() - p1.getX());
        }
        return (p2.getY() - p1.getY()) + "/" + (p2.getX() - p1.getX());
    }

    public String yIntercept() {
        double intercept  = p2.getY() - slope * p1.getX();
        if (intercept < 0) {
            return " - " + Math.abs(intercept);
        } else if (intercept == 0) {
            return "";
        } else {    
            return " + " + intercept;
        }
    }

}
