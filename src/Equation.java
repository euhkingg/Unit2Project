import java.awt.Point;
import java.awt.geom.Point2D;
import java.lang.Integer;
public class Equation {
    Point p1;
    Point p2;

    public Equation(String point1, String point2) {
        int x = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        int y = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")")));
        p1 = new Point(x, y);
        int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        int y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 1, point2.indexOf(")")));
        p2 = new Point(x2, y2);

    }

    public String getP1() {
        return p1.toString();
    }

    public String getP2() {
        return p2.toString();
    }

}
