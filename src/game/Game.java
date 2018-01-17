package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener {

	Timer timer = new Timer(5, this);
	
	public Game() {
		timer.start();
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
