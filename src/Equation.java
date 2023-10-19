import java.awt.Point;
public class Equation {
    Point p1;
    Point p2;

    public Equation(String point1, String point2) {
        p1 = new Point(Integer.parseInt(point1.substring(1,2)), Integer.parseInt(point1.substring(3,4)));
        p2 = new Point(Integer.parseInt(point2.substring(1,2)), Integer.parseInt(point2.substring(3,4)));
    }

    public double distance() {
        return p1.distance(p2.getX(), p2.getY());
    }

    public double slope() {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String yIntercept() {
        if (p1.getY() - slope() * p1.getX() < 0) {
            return "- " + Math.abs(p1.getY() - slope() * p1.getX());
        } else {
            return "+ " + (p1.getY() - slope() * p1.getX());
        }
    }

    public String getP1() {
        return p1.toString();
    }

    public String getP2() {
        return p2.toString();
    }
}
