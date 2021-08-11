package snakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Food {

	public int x, y;
	private final int width = 20, height = 20;

	/**
	 * constructor for food object that is located at the given x and y coordinates
	 * 
	 * @param x location of food
	 * @param y location of food
	 */
	public Food(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * graphic class that designs the food to be a red sphere
	 * 
	 * @param graphics object to create the sphere from
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);

		g2d.setColor(Color.red);
		g2d.fill(circle);
	}

}
