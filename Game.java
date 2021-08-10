package snakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame implements ActionListener {
	
	private JButton pause, speedUp, slowDown;
	private JFrame frame;
	private static final int width = 400, height = 400, margin = 20;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout();
		
		
	}
	
	public void layout() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(width, height));
		frame.getContentPane().setBackground(new Color(0).black);
		JPanel buttons = buttons();
		frame.add(buttons);
		buttons.setLocation(width / 2, height - 10);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public JPanel buttons() {
		JPanel buttonBar = new JPanel();
		
		pause = new JButton();
		speedUp = new JButton();
		slowDown = new JButton();
		
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
