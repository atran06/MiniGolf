package game;
import javax.swing.JFrame;

public class Window {

	public Window(int width, int height, String title) {
		JFrame frame = new JFrame();
		Game game = new Game();
		
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(game);
	}
}
