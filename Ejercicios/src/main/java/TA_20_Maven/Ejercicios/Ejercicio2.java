package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setTitle("Ventana con interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Botón 2");
		btnNewButton.setBounds(312, 11, 89, 23);
		btnNewButton.addActionListener(showLastButton);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Botón 1");
		btnNewButton_1.setBounds(213, 11, 89, 23);
		btnNewButton_1.addActionListener(showLastButton);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setBounds(84, 11, 129, 23);
		contentPane.add(lblNewLabel);
	}
	
	ActionListener showLastButton = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			lblNewLabel.setText("Has pulsado: "+e.getActionCommand());

		}
	};
}
