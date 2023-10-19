import java.util.Scanner;
public class EquationLogic {
    Equation line;
    Scanner scan;

    public EquationLogic() {
        line = null;
        scan = new Scanner(System.in);
    }

    public void Start() {
        int x;
    }

    public void getPoints() {
        System.out.println("Enter coordinate 1: ");
        String p1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String p2 = scan.nextLine();

        line = new Equation(p1, p2);
    }

    public String pointinfo() {
        return "The two poitns are: " + line.getP1() + " and " + line.getP2() + "\n" +
                "The equation of the line between these points is: y = " + line.slope() + "x " + line.yIntercept() + "\n" +
                "The slope of this line is: " + line.slope() + "\n" +
                "The y-intercept of the line is: " + line.yIntercept() + "\n" +
                "The distance between the two points is: " + line.distance();

    }




}
