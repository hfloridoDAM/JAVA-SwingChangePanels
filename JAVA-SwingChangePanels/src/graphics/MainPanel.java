package graphics;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSplitPane;

public class MainPanel extends JPanel {

	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JSplitPane splitPane;
	
	public MainPanel() {
		setLayout(null);
		setBounds(0,0,600,300);
		
		btnNewButton = new JButton("Hello World");
		
		btnNewButton.setBounds(22, 20, 128, 38);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tabla");
		btnNewButton_1.setBounds(223, 20, 128, 38);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(441, 20, 128, 38);
		add(btnNewButton_2);
		
		splitPane = new JSplitPane();
		splitPane.setBounds(22, 81, 551, 190);
		add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
	
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public JSplitPane getSplitPane() {
		return splitPane;
	}
	
	
}
