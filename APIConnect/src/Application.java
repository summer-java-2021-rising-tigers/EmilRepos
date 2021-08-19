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
		JFrame frame = new JFrame("APIConect");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InfoPanel infoPanel = new InfoPanel();
		frame.getContentPane().add(infoPanel);
		frame.setLayout(null);
		
		JComboBox comboBox3 = new JComboBox(infoCategories);
		comboBox3.setBounds(32, 37, 172, 22);
		add(comboBox3);
	}

}
