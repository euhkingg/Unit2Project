import java.util.Scanner;
import java.awt.Point;
import java.lang.Integer;
public class EquationLogic {
    private Equation line;
    private Scanner s;

    public EquationLogic() {
        line = null;
        s = new Scanner(System.in);
    }

    public String start() {
        return "";
    }

    public void getPoints() {
        System.out.println("Enter First Point: ");
        String p1 = s.nextLine();
        System.out.println("Enter Second Point: ");
        String p2 = s.nextLine();

        line = new Equation(p1, p2);
    }

    public String pointInfo() {
        return "The two points are: " + line.getP1() + " and " + line.getP2() + "\n" +
                "The equation of the line between these points is: y = " + line.slope() + "x " + line.yIntercept() + "\n" +
                "The slope of this line is: " + line.slope() +
                "The y-intercept of this line is: " + line.yIntercept() +
                "the distance between the tow points is: " + line.distance();

    }


}
