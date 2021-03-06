package graphics;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class HelloWorld extends JPanel {

	/**
	 * Create the panel.
	 */
	public HelloWorld() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HELLO WORLD");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(63, 105, 294, 33);
		add(lblNewLabel);

	}

}
