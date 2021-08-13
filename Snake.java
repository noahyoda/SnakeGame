package snakeGame;

import java.awt.Point;
import java.util.ArrayList;

public class Snake {

	public ArrayList<Point> body;
	public Point head;
	private int length;
	
	public Snake(Point start){
		head = start;
		length = 3;
		body = new ArrayList<Point>();
		int tempY = start.y;
		for(int i = 0; i < length; i++) {
			body.add(new Point(start.x, tempY));
			tempY -= 40;
		}
	}
	
	public int getLenght() {
		return length;
	}
	
}
