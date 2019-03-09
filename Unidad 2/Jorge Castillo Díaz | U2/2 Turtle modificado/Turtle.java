/******************************************************************************
 *  Compilation:  javac Turtle.java
 *  Execution:    java Turtle
 *
 *  Data type for turtle graphics using standard draw.
 *
 ******************************************************************************/

import java.awt.Color;

public class Turtle {
	private double x, y;     // turtle is at (x, y)
	private double angle;    // facing this many degrees counterclockwise from the x-axis

	// start at (x0, y0), facing a0 degrees counterclockwise from the x-axis
	public Turtle(double x0, double y0, double a0) {
		x = x0;
		y = y0;
		angle = a0;
	}

	// rotate orientation delta degrees counterclockwise
	public void turnLeft(double delta) {
		angle += delta;
	}

	// rotate orientation delta degrees clockwise
	public void turnRight(double degrees) {
		angle -= degrees;
	}

	public void turnAround() {
		angle += 180;
	}
	
	// move forward the given amount, with the pen down
	public void goForward(double step) {
		double oldx = x;
		double oldy = y;
		x += step * Math.cos(Math.toRadians(angle));
		y += step * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
	}

	public void goForwardWithColors(double steps, Color[] colors, double changeEvery) {
		double
			oldx = x,
			oldy = y,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x += changeEvery * Math.cos(Math.toRadians(angle));
		y += changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);		
		if (missingSteps > 0.001) goForwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goForwardWithColors(double steps, Color[] colors) {
		double
			oldx = x,
			oldy = y,
			changeEvery = Math.ceil(steps/colors.length),
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x += changeEvery * Math.cos(Math.toRadians(angle));
		y += changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);		
		if (missingSteps > 0.001) goForwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goForwardWithColors(double steps, double changeEvery) {
		Color[] colors = {
			StdDraw.BLACK,
			StdDraw.BLUE,
			StdDraw.CYAN,
			StdDraw.DARK_GRAY,
			StdDraw.GRAY,
			StdDraw.GREEN,
			StdDraw.LIGHT_GRAY,
			StdDraw.MAGENTA,
			StdDraw.ORANGE,
			StdDraw.PINK,
			StdDraw.RED,
			StdDraw.YELLOW,
			StdDraw.WHITE,
			StdDraw.BOOK_BLUE,
			StdDraw.BOOK_LIGHT_BLUE,
			StdDraw.BOOK_RED,
			StdDraw.PRINCETON_ORANGE
		};
		double
			oldx = x,
			oldy = y,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x += changeEvery * Math.cos(Math.toRadians(angle));
		y += changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
		if (missingSteps > 0.001) goForwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goForwardWithColors(double steps) {
		Color[] colors = {
			StdDraw.BLACK,
			StdDraw.BLUE,
			StdDraw.CYAN,
			StdDraw.DARK_GRAY,
			StdDraw.GRAY,
			StdDraw.GREEN,
			StdDraw.LIGHT_GRAY,
			StdDraw.MAGENTA,
			StdDraw.ORANGE,
			StdDraw.PINK,
			StdDraw.RED,
			StdDraw.YELLOW,
			StdDraw.WHITE,
			StdDraw.BOOK_BLUE,
			StdDraw.BOOK_LIGHT_BLUE,
			StdDraw.BOOK_RED,
			StdDraw.PRINCETON_ORANGE
		};
		double
			oldx = x,
			oldy = y,
			changeEvery = steps/colors.length,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x += changeEvery * Math.cos(Math.toRadians(angle));
		y += changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
		if (missingSteps > 0.001) goForwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goBackward(double steps) {
		double
			oldx = x,
			oldy = y;
		x -= steps * Math.cos(Math.toRadians(angle));
		y -= steps * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
	}

	public void goBackwardWithColors(double steps, Color[] colors, double changeEvery) {
		double
			oldx = x,
			oldy = y,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x -= changeEvery * Math.cos(Math.toRadians(angle));
		y -= changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);		
		if (missingSteps > 0.001) goBackwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goBackwardWithColors(double steps, Color[] colors) {
		double
			oldx = x,
			oldy = y,
			changeEvery = steps/colors.length,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x -= changeEvery * Math.cos(Math.toRadians(angle));
		y -= changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);		
		if (missingSteps > 0.001) goBackwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goBackwardWithColors(double steps, double changeEvery) {
		Color[] colors = {
			StdDraw.BLACK,
			StdDraw.BLUE,
			StdDraw.CYAN,
			StdDraw.DARK_GRAY,
			StdDraw.GRAY,
			StdDraw.GREEN,
			StdDraw.LIGHT_GRAY,
			StdDraw.MAGENTA,
			StdDraw.ORANGE,
			StdDraw.PINK,
			StdDraw.RED,
			StdDraw.YELLOW,
			StdDraw.WHITE,
			StdDraw.BOOK_BLUE,
			StdDraw.BOOK_LIGHT_BLUE,
			StdDraw.BOOK_RED,
			StdDraw.PRINCETON_ORANGE
		};
		double
			oldx = x,
			oldy = y,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x -= changeEvery * Math.cos(Math.toRadians(angle));
		y -= changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
		if (missingSteps > 0.001) goBackwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void goBackwardWithColors(double steps) {
		Color[] colors = {
			StdDraw.BLACK,
			StdDraw.BLUE,
			StdDraw.CYAN,
			StdDraw.DARK_GRAY,
			StdDraw.GRAY,
			StdDraw.GREEN,
			StdDraw.LIGHT_GRAY,
			StdDraw.MAGENTA,
			StdDraw.ORANGE,
			StdDraw.PINK,
			StdDraw.RED,
			StdDraw.YELLOW,
			StdDraw.WHITE,
			StdDraw.BOOK_BLUE,
			StdDraw.BOOK_LIGHT_BLUE,
			StdDraw.BOOK_RED,
			StdDraw.PRINCETON_ORANGE
		};
		double
			oldx = x,
			oldy = y,
			changeEvery = steps/colors.length,
			missingSteps = steps-changeEvery;
		byte randomColor = (byte) (Math.random() * colors.length);
		try {
			setPenColor(colors[randomColor]);
		} catch(ArrayIndexOutOfBoundsException err) {
			setPenColor(colors[randomColor-1]);
		}
		x -= changeEvery * Math.cos(Math.toRadians(angle));
		y -= changeEvery * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
		if (missingSteps > 0.001) goBackwardWithColors(missingSteps);
		else StdDraw.setPenColor();
	}

	public void eraseSteps(double steps) {
		Color backupColor = StdDraw.getPenColor();
		setPenColor(StdDraw.WHITE);
		goBackward(steps);
		setPenColor(backupColor);
	}

	public void jumpSteps(double steps) {
		Color backupColor = StdDraw.getPenColor();
		setPenColor(StdDraw.WHITE);
		goForward(steps);
		setPenColor(backupColor);
	}

	// copy to onscreen
	public void show() {
		StdDraw.show();
	}

	// pause t milliseconds
	public void pause(int t) {
		StdDraw.pause(t);
	}

	public void setPenColor(Color color) {
		StdDraw.setPenColor(color);
	}

	public void setPenRadius(double radius) {
		StdDraw.setPenRadius(radius);
	}

	public void setCanvasSize(int width, int height) {
		StdDraw.setCanvasSize(width, height);
	}

	public void setXscale(double min, double max) {
		StdDraw.setXscale(min, max);
	}

	public void setYscale(double min, double max) {
		StdDraw.setYscale(min, max);
	}

	public double getAngle() {
		return angle;
	}
	
	// sample client for testing
	public static void main(String[] args) {
		var turtle = new Turtle(0, 0, 0);
    turtle.setXscale(-100, 100);
		turtle.setYscale(-100, 100);
    turtle.goForwardWithColors(20);
    turtle.turnLeft(90);
    turtle.goForward(20);
    turtle.turnRight(90);
    turtle.goForwardWithColors(20);
    turtle.goBackwardWithColors(40);
	}
}
