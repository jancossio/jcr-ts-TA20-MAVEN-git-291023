package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private int btn1  = 0;
	private int btn2  = 0;

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setTitle("Ventana con más interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Botón 1: 0 veces");
		lblNewLabel.setBounds(86, 11, 123, 23);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Botón 2: 0 veces");
		lblNewLabel_1.setBounds(252, 11, 123, 23);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Botón 1");
		btnNewButton.setBounds(86, 45, 92, 23);
		btnNewButton.addActionListener(button1Counter);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.setBounds(252, 45, 92, 23);
		btnNewButton_1.addActionListener(button2Counter);
		contentPane.add(btnNewButton_1);
	}
	
	ActionListener button1Counter = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			btn1++;
			lblNewLabel.setText(e.getActionCommand()+": "+btn1+" veces");

		}
	};
	
	ActionListener button2Counter = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			btn2++;
			lblNewLabel_1.setText(e.getActionCommand()+": "+btn2+" veces");

		}
	};
}
