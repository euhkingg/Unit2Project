import java.io.*;
import java.lang.Integer;
public class Equation {
    int x, y, x2, y2;
    double slope;


    public Equation(String point1, String point2) {
        x = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point2.indexOf(")")));
        slope = 0;

    }

    public String getP1() {
        return "(" + x + ", " + y + ")";
    }

    public String getP2() {
        return "(" + x2 + ", " + y2 + ")";
    }

    public double distance() {
        return Math.hypot(y - y2, x - x2);
    }

    public String slope() {
        int changeX = x2 - x;
        int changeY = y2 - y;
        if (changeX != 0) {
            slope = (double) (y2 - y) / (x2 - x);
        } else {
            return "undefined";
        }

        if (slope == 1.0) {
            return "";
        } else if (slope == -1.0) {
            return "-";
        } else if (slope % 1.0 == 0) {
            return String.valueOf(slope).substring(0, String.valueOf(slope).indexOf("."));
        } else if (changeY < 0 && changeX < 0) {
            return Math.abs(changeY) + "/" + Math.abs(changeX);
        } else if (changeY > 0 && changeX < 0) {
            return "-" + Math.abs(changeY) + "/" + Math.abs(changeX);
        }
        return (changeY) + "/" + (changeX);
    }

    public String yIntercept() {
        double intercept  = y - (x * slope);
        if (intercept < 0) {
            return "- " + Math.abs(intercept);
        } else if (intercept == 0) {
            return "";
        } else {    
            return "+ " + intercept;
        }
    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + (x * slope) + (y - (x * slope)) + ")";
    }

}
