/******************************************************************************
 *  Compilation:  javac SpiralText.java
 *  Execution:    java Spiral
 *  Dependencies: Turtle.java
 *
 *  Plots a logarithmic spiral.
 * 
 *  % java Spiral 3 1.0         // equilateral triangle
 *
 *  % java Spiral 3 1.2
 *
 *  % java Spiral 1440 1.00004
 *
 *  % java Spiral 1440 1.0004  // logarithmic spiral
 *
 ******************************************************************************/

public class SpiralText {

    public static void main(String[] args) { 
        int n         = Integer.parseInt(args[0]);     // # sides if decay = 1.0
        double decay  = Double.parseDouble(args[1]);   // decay factor
        System.out.println("n     -> " + n);
        System.out.println("decay -> " + decay);

        double angle  = 360.0 / n;
        System.out.println("angle -> " + angle + "  -> 360.0/" + n);
        double step   = Math.sin(Math.toRadians(angle/2.0));
        System.out.println("step  -> " + step);

        Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
        System.out.println("angle -> " + turtle.getAngle() + "  -> angle = turtle.getAngle - angle");

        for (int i = 0; i < 10 * n; i++) {
            step /= decay;
            System.out.println("step  -> " + step + "  -> step = step / decay"); 
            turtle.goForward(step);
            turtle.turnLeft(angle);
            System.out.println("angle -> " + turtle.getAngle() + "  -> angle = turtle.getAngle - angle");
        }

    }
}
