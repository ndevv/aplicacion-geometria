package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Geometria extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;

	public static String nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geometria frame = new Geometria();
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
	public Geometria() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 388) ;
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhola = new JLabel("¡HOLA!");
		lblhola.setFont(new Font("Dialog", Font.BOLD, 14));
		lblhola.setForeground(Color.WHITE);
		lblhola.setHorizontalAlignment(SwingConstants.CENTER);
		lblhola.setBounds(276, 12, 70, 29);
		contentPane.add(lblhola);
		
		JLabel lblNombre = new JLabel("Ingresa tu nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(247, 247, 138, 15);
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBackground(Color.LIGHT_GRAY);
		textFieldNombre.setBounds(247, 283, 131, 19);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		
		this.dispose();
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nombre = textFieldNombre.getText();
				
				if(!nombre.isBlank()) {
					
					Geometria2 ventana2 = new Geometria2();
					//ventana2.textFieldNombre.getText();
					//new Geometria2(textFieldNombre.getText()).setVisible(true);
					ventana2.setVisible(true);
					dispose();
					
				}else {
					lblNombre.setForeground(Color.RED);
				}
			}
		});
		btnContinuar.setBackground(Color.DARK_GRAY);
		btnContinuar.setForeground(Color.ORANGE);
		btnContinuar.setBounds(254, 314, 117, 25);
		contentPane.add(btnContinuar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setBackground(Color.LIGHT_GRAY);
		lblFondo.setForeground(Color.WHITE);
		lblFondo.setIcon(new ImageIcon("src/img/Yashahime.gif"));
		lblFondo.setBounds(0, 0, 621, 356);
		contentPane.add(lblFondo);
	}
}
