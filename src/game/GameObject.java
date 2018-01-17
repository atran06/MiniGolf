package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class GameObject {

	protected int x, y, velX, velY;
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void paintComponent(Graphics2D g2);
	public abstract void tick();
	public abstract Rectangle getBounds();
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public int getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
}
