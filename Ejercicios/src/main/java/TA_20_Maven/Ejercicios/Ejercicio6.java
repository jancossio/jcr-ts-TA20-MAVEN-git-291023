package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ejercicio6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		setTitle("Índice de Masa Corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(124, 11, 86, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 12, 86, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(32, 11, 86, 23);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Peso (kg)");
		lblNewLabel_1.setBounds(220, 11, 69, 23);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Calcular IMC");
		btnNewButton.setBounds(89, 56, 108, 34);
		btnNewButton.addActionListener(calaculateIMC);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("IMC:");
		lblNewLabel_2.setBounds(207, 62, 46, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setBounds(253, 63, 133, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
	
	ActionListener calaculateIMC = new ActionListener() {
		public void actionPerformed(ActionEvent e) {			

			if(!textField.getText().equals("") && !textField_1.getText().equals("")) {
				try {			
					double tmpWeight = Double.parseDouble(textField_1.getText());
					double tmpHeight = Double.parseDouble(textField.getText());
					double result = tmpWeight/(tmpHeight*tmpHeight);
					textField_2.setText(String.valueOf(tmpWeight/(tmpHeight*tmpHeight)));
					
				} catch (NumberFormatException  nfe) {
					textField_2.setText("Error");
				}
			}
		}
	};
}
