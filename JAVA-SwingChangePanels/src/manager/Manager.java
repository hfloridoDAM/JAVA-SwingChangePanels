package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import graphics.HelloWorld;
import graphics.Table;
import graphics.MainFrame;
import graphics.MainPanel;

public class Manager {
	private MainFrame frame;
	private MainPanel mainPanel;
	private JPanel panel;
	private HelloWorld heloWold;
	private Table table;
	
	public Manager () {
		frame = new MainFrame();
	}
	
	public void start () {
		frame.setVisible(true);
		mainPanel = new MainPanel();
		frame.add(mainPanel);
		
		mainPanel.getBtnNewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changePanelR(new HelloWorld());
			}
		});
		
		mainPanel.getBtnNewButton_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changePanelL(new Table());
			}
		});
		
		mainPanel.getBtnNewButton_2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetPanel();
			}
		});
		
	}

	private void changePanelR(JPanel p) {
		mainPanel.getSplitPane().setRightComponent(p);
		mainPanel.getSplitPane().setDividerLocation(200);
		mainPanel.getSplitPane().validate();
	}
	
	private void changePanelL(JPanel p) {
		mainPanel.getSplitPane().setLeftComponent(p);
		mainPanel.getSplitPane().setDividerLocation(200);
		mainPanel.getSplitPane().validate();
	}
	
	private void resetPanel() {
		mainPanel.getSplitPane().setRightComponent(new JPanel());
		mainPanel.getSplitPane().setLeftComponent(new JPanel());
		mainPanel.getSplitPane().setDividerLocation(200);
		mainPanel.getSplitPane().validate();
	}
}
