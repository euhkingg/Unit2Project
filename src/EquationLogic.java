import java.util.Scanner;
public class EquationLogic {
    Equation line;
    Scanner scan;

    public EquationLogic() {
        line = null;
        scan = new Scanner(System.in);
    }

    public void Start() {
        getPoints();
        System.out.println(pointInfo());
        findXVal();
    }

    public void getPoints() {
        System.out.print("Enter coordinate 1: ");
        String p1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String p2 = scan.nextLine();

        line = new Equation(p1, p2);
    }

    public String pointInfo() {
        return "\n----- Line info -----\n" +
                "The two points are: " + line.getP1() + " and " + line.getP2() + "\n" +
                "The equation of the line between these points is: " + line.slope() + line.yIntercept() + "\n" +
                "The slope of this line is: " + line.roundHundredth(line.getSlope()) + "\n" +
                "The y-intercept of the line is: " + line.getIntercept() + "\n" +
                "The distance between the two points is: " + line.roundHundredth(line.distance());
    }

    public void findXVal() {
        System.out.print("\nEnter a value for x: ");
        System.out.println(line.coordinateForX(scan.nextDouble()));
        System.out.print("\nWould you like to enter another pair of coordinates? ");
        String yn = scan.nextLine();
        if (scan.nextLine().equals("y")) {
            System.out.print("\n");
            Start();
        }
    }
}