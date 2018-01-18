package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private boolean isRunning;
	private Thread thread;
	private double x = 0, y = 0, velX, velY;

	public Game() {
		Window win = new Window(1280, 720, "Mini Golf", this);
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		/////// Game Loop ////////
		long beforeTime = System.nanoTime();
		double ticks = 60.0;
		double optimal = 1000000000 / ticks;
		double lastFPSTime = 0;
		long fps = 0;
		double delta = 0;
		
		while(isRunning) {
			long currentTime = System.nanoTime();
			delta += (currentTime - beforeTime) / optimal;
			long updateLength = currentTime - beforeTime;
			beforeTime = currentTime;
			
			while(delta >= 1) {
				tick();
				delta--;
			}
			
			lastFPSTime += updateLength;
			fps++;
			
			/////Updates the FPS/////
			if(lastFPSTime >= 1000000000) {
				System.out.println("FPS: " + fps);
				fps = 0;
				lastFPSTime = 0;
			}
			
			render();
		}
	}
	public void render() {
		BufferStrategy strat = this.getBufferStrategy();
		if (strat == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = strat.getDrawGraphics();
		Graphics2D g2 = (Graphics2D) g;
		///////// Draw///////////
		g.setColor(Color.gray);
		g.fillRect(0, 0, 1280, 720);
		
		g.setColor(Color.white);
		g2.fill(new Rectangle2D.Double(x, y, 20, 20));
		///////////////////////
		
		g.dispose();
		strat.show();
	}

	public void tick() {
		velX = 2;
		velY = 2;
		
		x += velX;
		y += velY;
	}
}
