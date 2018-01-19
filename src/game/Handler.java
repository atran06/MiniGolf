package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> object = new LinkedList<>();
	
	public void paintComponent(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObj = object.get(i);
			
			tempObj.paintComponent((Graphics2D) g);
		}
	}
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObj = object.get(i);
			
			tempObj.tick();
		}
	}
	public void removeObj(GameObject obj) {
		object.remove(obj);
	}
	public void addObj(GameObject obj) {
		object.add(obj);
	}
}
