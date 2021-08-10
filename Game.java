package snakeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.SplittableRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Noahyoda
 * 
 * TODO:
 * add buttons back to frame later
 * setup grid coordinate system
 * make snake class
 * add food to frame
 * make food appear at random x/y
 *
 */

public class Game extends JFrame implements ActionListener {
	
	private JButton pause, speedUp, slowDown;
	private JFrame frame;
	private static final int width = 400, height = 400;
	private int fx, fy;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout();
	}
	
	public void layout() {
		frame = new JFrame();
		Container content = frame.getContentPane();
		content.setLayout(new BorderLayout());
		frame.setPreferredSize(new Dimension(width, height));
		
		SplittableRandom rng = new SplittableRandom();
		
		Food food = new Food(fx, fy);
		
		JPanel buttons = buttons();
		JPanel gamePanel = gamePanel();
		
		content.add(gamePanel);
		
		//content.add(buttons);
		content.getComponent(1).setBackground(new Color(10).black);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public JPanel gamePanel() {
		JPanel pain = new JPanel();
		return pain;
	}
	
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
