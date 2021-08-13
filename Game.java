package snakeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.SplittableRandom;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Noahyoda
 * 
 *         TODO: add buttons back to frame later setup grid coordinate system
 *         make snake class add food to frame make food appear at random x/y
 *
 */

public class Game extends JFrame implements ActionListener {

	private JButton pause, speedUp, slowDown;
	private JFrame frame;
	private static final int width = 400, height = 400;
	// cells are in steps of 40
	private int fx, fy;
	private static ArrayList<ArrayList<Point>> grid;

	public static void main(String[] args) {
		//fill grid array list with every playable point
		grid = new ArrayList<ArrayList<Point>>();
		for(int i = 0; i < 10; i++) {
			//fill new column list with points
			ArrayList<Point> temp = new ArrayList<>();
			for(int ii = 0; ii < 10; ii++) {
				temp.add(new Point(i * 40, ii * 40));
			}
			//add column to grid
			grid.add(temp);
		}
		//start the game
		new Game();
	}

	/**
	 * this is the main driving method for the game
	 */
	public Game() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		Container content = frame.getContentPane();
		content.setLayout(new BorderLayout());
		frame.setPreferredSize(new Dimension(width, height));

		SplittableRandom rng = new SplittableRandom();
		// fx = rng.nextInt(10);
		// fy = rng.nextInt(10);
		//temp coordinates while testing getting food into the game
		fx = 160;
		fy = 160;
		Food food = new Food(fx, fy);

		// button elements are commented out for the time being to focus on the games
		// main aspects first
		// JPanel buttons = buttons();
		JPanel gamePanel = new JPanel();

		content.add(gamePanel);
		// content.add(buttons);
		content.getComponent(0).setBackground(new Color(10).black);

		frame.pack();
		frame.setVisible(true);
	}

//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//	}

	/**
	 * container method to create and style all the buttons that will be added as a
	 * JPanel later
	 * 
	 * @return JPanel with all the buttons
	 */
	public JPanel buttons() {
		JPanel buttonBar = new JPanel();
		Color btnColor = new Color(10).cyan;

		pause = new JButton();
		pause.setBackground(btnColor);
		speedUp = new JButton();
		speedUp.setBackground(btnColor);
		slowDown = new JButton();
		slowDown.setBackground(btnColor);

		buttonBar.add(pause);
		buttonBar.add(speedUp);
		buttonBar.add(slowDown);

		return buttonBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
