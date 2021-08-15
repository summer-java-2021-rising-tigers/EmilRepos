import java.awt.EventQueue;

import javax.swing.JFrame;

import panels.InfoPanel;

import java.awt.Color;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("APIConect");
		// InfoPanel infopanel = new InfoPanel();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(new );
		InfoPanel infoPanel = new InfoPanel();
		frame.getContentPane().add(infoPanel);
		frame.setLayout(null);
	}

}
