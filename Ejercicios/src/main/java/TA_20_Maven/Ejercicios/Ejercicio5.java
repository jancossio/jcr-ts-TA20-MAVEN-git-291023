package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public Ejercicio5() {
		setTitle("Todos los eventos del ratón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 45, 548, 216);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(229, 11, 89, 23);
		btnNewButton.addActionListener(cleanText);
		contentPane.add(btnNewButton);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addAction("El raton ha entrado en la ventana.");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				addAction("El raton ha salido de la ventana.");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				addAction("El raton ha hecho click en: "+e.getX()+"X y "+e.getY()+"Y.");
			}
		});
	}
	
	ActionListener cleanText = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			textArea.setText("");
		}
	};
	
	public void addAction(String action) {
		String tmp = textArea.getText();
		tmp += ("\n"+action);
		textArea.setText(tmp);
	}
}
