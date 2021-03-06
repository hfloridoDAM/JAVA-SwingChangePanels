package graphics;

import javax.swing.JPanel;
import javax.swing.JTable;

public class Table extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Table() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(59, 46, 312, 191);
		add(table);

	}
}
