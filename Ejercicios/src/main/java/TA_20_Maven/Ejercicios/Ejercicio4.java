package TA_20_Maven.Ejercicios;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Ejercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		//addAction("Se ha creado el Text Area.");

		setTitle("Ventana eventos");
		//addAction("Se ha creado el titulo de la ventana.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
        contentPane.setLayout(null);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(75, 0, 519, 212);
        contentPane.add(scrollPane);
        
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
		addAction("Se ha creado el JPane.");
		addAction("Se ha creado el Titulo.");
		addAction("Se ha creado el JScrollPane.");
		addAction("Se ha creado el Text Area.");
        
        lblNewLabel = new JLabel("Eventos");
        lblNewLabel.setBounds(10, 96, 59, 23);
        contentPane.add(lblNewLabel);
		addAction("Se ha creado el Label Eventos.");
        
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				windowFrameChanged(arg0);
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent eve) {
				addAction("Se ha modificado el tamaño");
			}
			@Override
			public void componentMoved(ComponentEvent eve) {
				addAction("Se ha movido de sitio");
			}
		});
}

	public void windowFrameChanged(WindowEvent e) {
	
	if((e.getNewState() & JFrame.ICONIFIED) == JFrame.ICONIFIED) {
		
		addAction("Se ha minimizado la ventana");

	}else if ((e.getNewState() & JFrame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH) {
		
			addAction("Se ha recuperado el tamaño original");

			}	
	}
	
	public void addAction(String action) {
		String tmp = textArea.getText();
		tmp += ("\n"+action);
		textArea.setText(tmp);
	}
}