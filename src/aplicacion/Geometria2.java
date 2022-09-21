package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import java.awt.Font;
//FONDO
import java.awt.Graphics; //Para agregar fondo
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Geometria2 extends JFrame {
	
	private JPanel contentPane;
	
	boolean ready = false;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geometria2 frame = new Geometria2();
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

	public Geometria2() {
		//Geometria.nombre = nombre;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("/home/ddev/Documentos/eclipse-workspace/Geometria/img/sacred-geometry-two.png"));
		setTitle(Geometria.nombre+" - Definiciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDefinicion = new JTextArea();
		txtrDefinicion.setText("");
		txtrDefinicion.setForeground(Color.ORANGE);
		txtrDefinicion.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrDefinicion.setEditable(false);
		txtrDefinicion.setBackground(new Color(0, 0, 0, 64)); //
		txtrDefinicion.setBounds(40, 245, 539, 78);
		contentPane.add(txtrDefinicion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(229, 68, 156, 24);
		//comboBox.setBackground(new Color(0, 0, 0, 64)); //
		comboBox.setToolTipText("");
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Buscar definición", "Isometría", "Simetría Axial",
				"Simetría Central", "Rotación", "Traslación", "Antitraslación", "Isometría Directa",
				"Isometría Indirecta", "Isometría Involutiva", "Punto Unido", "Figura Unida", "Figura Doble" }));
		contentPane.add(comboBox);

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				// Item
				String opcion = (String) comboBox.getSelectedItem();
				// guarda el item seleccionado en opcion para usarlo luego

				if (opcion.equals("Buscar definición")) {

					txtrDefinicion.setText("");
					
				}
				if (opcion.equals("Isometría")) {

					txtrDefinicion.setText("Función biyectiva del plano en el plano, que conserva las distancias.");
					ready = true;
				}
				if (opcion.equals("Simetría Axial")) {

				txtrDefinicion.setText(
					"Simetría que existe en torno a un eje cuando la totalidad de los\nsemiplanos que se toman desde una determinada mediatriz\nexhiben las mismas características.");
					ready = true;
				}
				if (opcion.equals("Simetría Central")) {
					txtrDefinicion.setText(
							"Una simetría central, de centro el punto O, es un movimiento del\nplano con el que a cada punto P del plano le hace corresponder\notro punto P', siendo O el punto medio del segmento de extremos\nP y P'.");
					ready = true;
				}
				if (opcion.equals("Rotación")) {
					txtrDefinicion.setText(
							"Es una isometría directa, con uno y solo un punto fijo, (llamado\ncentro de giro) generalmente nombrado como O. Que cumple: para\ntodo punto P del plano, le hace corresponder un punto P’ de modo\nque PÔP′ = α̂  constante, (llamado ángulo de giro).");
					ready = true;
				}
				if (opcion.equals("Traslación")) {
					txtrDefinicion.setText(
							"Es una isometría directa, sin puntos fijos, respecto a un vector\ngeneralmente nombrado como u⃗ . Que cumple: para todo punto P\ndel plano le hace corresponder un punto P’, de modo que P⃗⃗⃗⃗P⃗⃗⃗ ′ = u⃗.");
					ready = true;
				}
				if (opcion.equals("Antitraslación")) {
					txtrDefinicion.setText(
							"Es una isometría indirecta, sin puntos fijos, respecto a un vector \ny a una recta, generalmente nombrado como u⃗ y r. Que cumple:\nser la composición de una traslación de u⃗ , con una simetría axial\nde eje r paralelo al vector de traslación.");
					ready = true;
				}
				if (opcion.equals("Isometría Directa")) {
					txtrDefinicion.setText("Se define isometría directa a la que conserva el sentido en el plano.");
					ready = true;
				}
				if (opcion.equals("Isometría Indirecta")) {
					txtrDefinicion.setText("Se define isometría indirecta a la que cambia el sentido en el plano.");
					ready = true;
				}
				if (opcion.equals("Isometría Involutiva")) {
					txtrDefinicion.setText(
							"Toda isometría que, aplicada sucesivamente un par de veces, de\ncómo resultado la Identidad, se dirá que es Involutiva.");
					ready = true;
				}
				if (opcion.equals("Punto Unido")) {
					txtrDefinicion.setText(
							"Un punto es unido en una isometría si se transforma en sí mismo.\nP es unido ⇔ f(P) = P.");
					ready = true;
				}
				if (opcion.equals("Figura Unida")) {
					txtrDefinicion.setText(
							"Una figura es unida en una isometría si todos los puntos son unidos\nA es unida en f ⇔ ∀ P ∈ A ∶ f(P) = P.");
					ready = true;
				}
				if (opcion.equals("Figura Doble")) {
					txtrDefinicion.setText(
							"Una figura es doble en una isometría si su imagen es ella misma A\nes doble en f ⇔ f(A ) = A.");
					ready = true;
				}

			}
		});

		
		JButton btnRealizarPrueba = new JButton("Realizar prueba");
		btnRealizarPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ready==true){
					Geometria3 ventana3 = new Geometria3();
					ventana3.setVisible(true);
					dispose();
				}
			}
		});
		btnRealizarPrueba.setForeground(Color.ORANGE);
		btnRealizarPrueba.setBackground(Color.DARK_GRAY);
		btnRealizarPrueba.setBounds(246, 331, 156, 25);
		contentPane.add(btnRealizarPrueba);
		
		
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("src/img/senkuchrome.gif"));
		label.setBounds(0, -13, 621, 369);
		contentPane.add(label);
		
//		JLabel lblPrueba = new JLabel("Prueba");
//		lblPrueba.setHorizontalAlignment(SwingConstants.CENTER);
//		lblPrueba.setBounds(263, 292, 70, 15);
//		contentPane.add(lblPrueba);

	}
}
