import java.lang.Integer;
public class Equation {
    private final int x, y, x2, y2;
    private double slope, intercept;

    public Equation(String point1, String point2) {
        x = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point2.indexOf(")")));
        slope = 0;
        intercept = 0;
    }

    public double roundHundredth(double num) { return Math.round(num * 100) / 100.0;}

    public String getP1() {return "(" + x + ", " + y + ")";}

    public String getP2() {return "(" + x2 + ", " + y2 + ")";}

    public double getIntercept() {return intercept;}

    public double getSlope() {return slope;}

    public double distance() {return Math.hypot(y - y2, x - x2);}

    public String slope() {
        int changeX = x2 - x;
        int changeY = y2 - y;
        if (changeY == 0) {
            return "y = ";
        } else if(changeX == 0) {
            return "x = ";
        }
        slope = (double) changeY / changeX;

        if (slope == 1.0) {
            return "y = x ";
        } else if (slope == -1.0) {
            return "y = -x ";
        } else if (slope % 1.0 == 0) {
            return "y = " + String.valueOf(slope).substring(0, String.valueOf(slope).indexOf(".")) + "x ";
        } else if (changeY < 0 && changeX < 0) {
            return "y = " + Math.abs(changeY) + "/" + Math.abs(changeX) + "x ";
        } else if (changeY > 0 && changeX < 0) {
            return "y = -" + Math.abs(changeY) + "/" + Math.abs(changeX) + "x ";
        }
        return "y = " + (changeY) + "/" + (changeX) + "x ";
    }

    public String yIntercept() {
        intercept = roundHundredth(y - (x * slope));
        if (x2 - x == 0) {
            intercept = x;
            return "" + x;
        }else if (intercept < 0) {
            if (slope == 0) {
                return "" + intercept;
            }
            return "- " + Math.abs(intercept);
        } else if (intercept == 0) {
            return "";
        } else if (slope == 0) {
            return "" + intercept;
        }
        return "+ " + intercept;
    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + roundHundredth((x * slope) + intercept) + ")";
    }
}