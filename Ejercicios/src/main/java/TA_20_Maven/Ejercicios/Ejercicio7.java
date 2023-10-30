package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private Boolean typeChange = true;
	private double change = 166.386;

	/**
	 * Create the frame.
	 */
	public Ejercicio7() {
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(10, 11, 123, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(136, 11, 101, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(10, 55, 71, 23);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 55, 164, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Euros a Ptas");
		btnNewButton.setBounds(97, 105, 113, 30);
		btnNewButton.addActionListener(changeType);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.setBounds(250, 105, 89, 30);
		btnNewButton_1.addActionListener(calaculateChange);
		contentPane.add(btnNewButton_1);
	}
	
	ActionListener calaculateChange = new ActionListener() {
		public void actionPerformed(ActionEvent e) {			

			String simbolo = "";
			if(!textField.getText().equals("")) {
				try {			
					double tmpMoney = Double.parseDouble(textField.getText());
					if(typeChange) {
						tmpMoney = tmpMoney * change;
						simbolo = "€";
					}else {
						tmpMoney = tmpMoney / change;
						simbolo = "Ptas";
					}
					textField_1.setText(String.valueOf(tmpMoney)+" "+simbolo);
					
				} catch (NumberFormatException  nfe) {
					textField_1.setText("Error");
				}
			}
		}
	};
	
	ActionListener changeType = new ActionListener() {
		public void actionPerformed(ActionEvent e) {			

			typeChange = !typeChange;
			if(typeChange) {
				btnNewButton.setText("Euros a Ptas");
			}else {
				btnNewButton.setText("Ptas a Euros");
			}
		}
	};
}
