package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

/**
*
* @author neodev
*/
public class Geometria2 extends JFrame {
	
	private static final long serialVersionUID = 1L;

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
		setResizable(false);
		setTitle(Geometria.nombre+" - Definiciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 388);
		setLocationRelativeTo(null);
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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(229, 68, 156, 24);
		comboBox.setToolTipText("");
		
		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Buscar definici??n", "Isometr??a", "Simetr??a Axial",
				"Simetr??a Central", "Rotaci??n", "Traslaci??n", "Antitraslaci??n", "Isometr??a Directa",
				"Isometr??a Indirecta", "Isometr??a Involutiva", "Punto Unido", "Figura Unida", "Figura Doble" }));
		contentPane.add(comboBox);

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				// Item
				String opcion = (String) comboBox.getSelectedItem();

				if (opcion.equals("Buscar definici??n")) {

					txtrDefinicion.setText("");
					
				}
				if (!opcion.equals("Buscar definici??n")) {

					txtrDefinicion.setForeground(Color.ORANGE);
					
				}
				if (opcion.equals("Isometr??a")) {

					txtrDefinicion.setText("Funci??n biyectiva del plano en el plano, que conserva las distancias.");
					ready = true;
				}
				if (opcion.equals("Simetr??a Axial")) {

				txtrDefinicion.setText(
					"Simetr??a que existe en torno a un eje cuando la totalidad de los\nsemiplanos que se toman desde una determinada mediatriz\nexhiben las mismas caracter??sticas.");
					ready = true;
				}
				if (opcion.equals("Simetr??a Central")) {
					txtrDefinicion.setText(
							"Una simetr??a central, de centro el punto O, es un movimiento del\nplano con el que a cada punto P del plano le hace corresponder\notro punto P', siendo O el punto medio del segmento de extremos\nP y P'.");
					ready = true;
				}
				if (opcion.equals("Rotaci??n")) {
					txtrDefinicion.setText(
							"Es una isometr??a directa, con uno y solo un punto fijo, (llamado\ncentro de giro) generalmente nombrado como O. Que cumple: para\ntodo punto P del plano, le hace corresponder un punto P??? de modo\nque P??P??? = ????  constante, (llamado ??ngulo de giro).");
					ready = true;
				}
				if (opcion.equals("Traslaci??n")) {
					txtrDefinicion.setText(
							"Es una isometr??a directa, sin puntos fijos, respecto a un vector\ngeneralmente nombrado como u??? . Que cumple: para todo punto P\ndel plano le hace corresponder un punto P???, de modo que P????????????P????????? ??? = u???.");
					ready = true;
				}
				if (opcion.equals("Antitraslaci??n")) {
					txtrDefinicion.setText(
							"Es una isometr??a indirecta, sin puntos fijos, respecto a un vector \ny a una recta, generalmente nombrado como u??? y r. Que cumple:\nser la composici??n de una traslaci??n de u??? , con una simetr??a axial\nde eje r paralelo al vector de traslaci??n.");
					ready = true;
				}
				if (opcion.equals("Isometr??a Directa")) {
					txtrDefinicion.setText("Se define isometr??a directa a la que conserva el sentido en el plano.");
					ready = true;
				}
				if (opcion.equals("Isometr??a Indirecta")) {
					txtrDefinicion.setText("Se define isometr??a indirecta a la que cambia el sentido en el plano.");
					ready = true;
				}
				if (opcion.equals("Isometr??a Involutiva")) {
					txtrDefinicion.setText(
							"Toda isometr??a que, aplicada sucesivamente un par de veces, de\nc??mo resultado la Identidad, se dir?? que es Involutiva.");
					ready = true;
				}
				if (opcion.equals("Punto Unido")) {
					txtrDefinicion.setText(
							"Un punto es unido en una isometr??a si se transforma en s?? mismo.\nP es unido ??? f(P) = P.");
					ready = true;
				}
				if (opcion.equals("Figura Unida")) {
					txtrDefinicion.setText(
							"Una figura es unida en una isometr??a si todos los puntos son unidos\nA es unida en f ??? ??? P ??? A ??? f(P) = P.");
					ready = true;
				}
				if (opcion.equals("Figura Doble")) {
					txtrDefinicion.setText(
							"Una figura es doble en una isometr??a si su imagen es ella misma A\nes doble en f ??? f(A ) = A.");
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
				}else {
					txtrDefinicion.setForeground(Color.RED);
					txtrDefinicion.setText("ANTES DE CONTINUAR DEBES LEER LAS DEFINICIONES !!!");
				}
			}
		});
		
		JButton btnAtras = new JButton("<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Geometria ventana1 = new Geometria();
				ventana1.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblCop2 = new JLabel("neodev??");
		lblCop2.setBounds(12, 329, 70, 15);
		contentPane.add(lblCop2);
		btnAtras.setToolTipText("Vover");
		btnAtras.setForeground(Color.ORANGE);
		btnAtras.setBackground(Color.DARK_GRAY);
		btnAtras.setBounds(190, 331, 44, 25);
		contentPane.add(btnAtras);
		btnRealizarPrueba.setForeground(Color.ORANGE);
		btnRealizarPrueba.setBackground(Color.DARK_GRAY);
		btnRealizarPrueba.setBounds(246, 331, 156, 25);
		contentPane.add(btnRealizarPrueba);
		
		
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("img/senkuchrome.gif"));
		label.setBounds(0, -13, 621, 369);
		contentPane.add(label);

	}
}
