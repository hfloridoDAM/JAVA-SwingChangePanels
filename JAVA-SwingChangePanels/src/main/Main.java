package main;

import java.awt.EventQueue;

import manager.Manager;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager manager = new Manager();
					manager.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
