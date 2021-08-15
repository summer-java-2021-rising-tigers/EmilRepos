package panels;

import java.awt.Color;

import javax.swing.JPanel;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import Servlets.apiServlet;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Insets;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.swing.JComboBox;

public class InfoPanel extends JPanel {
	
	String[] infoCategories = { "Ability scores",
			"Aligments",
			"Backgrounds",
			"Classes",
			"Conditions",
			"Damage types",
			"Equipment categories" };

	public InfoPanel() {
		
		setBounds(1000, 100, 248, 400);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Information Box");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(75, 11, 117, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(infoCategories);
		comboBox.setBounds(32, 37, 172, 22);
		add(comboBox);
		
		// JLabel lblNewLabel_1 = new JLabel(rsp.toString());
		// lblNewLabel_1.setBounds(10, 93, 228, 227);
		// add(lblNewLabel_1);
		setVisible(true);
	}
}
