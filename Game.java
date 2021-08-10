package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame implements ActionListener {
	
	private JButton pause, speedUp, slowDown;
	private JFrame frame;
	private static final int width = 400;
	private static final int height = 400;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout();
		
		
	}
	
	public void layout() {
		frame = new JFrame();
		frame.setSize(width, height);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
