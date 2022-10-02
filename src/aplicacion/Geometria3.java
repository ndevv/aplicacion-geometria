package aplicacion;

import java.awt.EventQueue;
import java.util.Random; //
import javax.swing.ButtonGroup; //
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author neodev
*/
public class Geometria3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup bg1 = new ButtonGroup(); // ButtonGroup RadioButton
	private ButtonGroup bg2 = new ButtonGroup();
	private ButtonGroup bg3 = new ButtonGroup();
	private ButtonGroup bg4 = new ButtonGroup();
	private ButtonGroup bg5 = new ButtonGroup();
	
	public static int puntaje = 0;
	private Random azar;
	private int primera;
	private int segunda;
	private int tercera;
	private int cuarta;
	private int quinta;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geometria3 frame = new Geometria3();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	//Setters indices
	public void setPrimera(int primera) {
		this.primera = primera;
	}
	public void setSegunda(int segunda) {
		if(segunda != primera) {
			this.segunda = segunda;
		}else {
			setSegunda(azar.nextInt(5));
		}
		
	}
	public void setTercera(int tercera) {
		if(tercera != primera && tercera != segunda) {
			this.tercera = tercera;
		}else {
			setTercera(azar.nextInt(5));
		}
		
	}
	public void setCuarta(int cuarta) {
		if(cuarta != primera && cuarta != segunda && cuarta != tercera) {
			this.cuarta = cuarta;
		}else {
			setCuarta(azar.nextInt(5));
		}
		
		//this.cuarta = cuarta;
	}
	public void setQuinta(int quinta) {
		if(quinta != primera && quinta != segunda && quinta != tercera && quinta != cuarta) {
			this.quinta = quinta;
		}else {
			setQuinta(azar.nextInt(5));
		}
			//this.quinta = quinta;
		
	}

	/**
	 * Create the frame.
	 */
	public Geometria3() {
		azar = new Random();
		setPrimera(azar.nextInt(5));
		setSegunda(azar.nextInt(5));
		setTercera(azar.nextInt(5));
		setCuarta(azar.nextInt(5));
		setQuinta(azar.nextInt(5));
		
		setResizable(false);
		setTitle(Geometria.nombre+" - Test V o F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 388);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		////////////////////////////////////////////////////////////Array de definiciones
		String[] definicion = new String[]{"Función biyectiva del plano en el plano, que conserva las distancias.", 
				"Una simetría central, de centro el punto O, es un movimiento del plano con el que a cada punto P del plano le hace corresponder otro punto P', siendo O el punto medio del segmento de extremos P y P'.",
				"Es una isometría directa, sin puntos fijos, respecto a un vector\ngeneralmente nombrado como u⃗ . Que cumple: para todo punto P\ndel plano le hace corresponder un punto P’, de modo que P⃗⃗⃗⃗P⃗⃗⃗ ′ = u⃗.",
				"Se define isometría directa a la que conserva el sentido en el plano.",
				"Un punto es unido en una isometría si se transforma en sí mismo.\nP es unido ⇔ f(P) = P."};
		
		
		
		JLabel lblSimetraAxial = new JLabel("Isometría"); /////////1
		lblSimetraAxial.setForeground(Color.WHITE);
		lblSimetraAxial.setBounds(12, 12, 75, 15);
		contentPane.add(lblSimetraAxial);
		
		JTextPane txtpnDef1 = new JTextPane();
		txtpnDef1.setForeground(Color.WHITE);
		txtpnDef1.setEditable(false);
		txtpnDef1.setText(definicion[primera]);
		txtpnDef1.setBounds(142, 17, 459, 51);
		txtpnDef1.setBackground(new Color(0, 0, 0, 64)); //
		contentPane.add(txtpnDef1);
		
		String def1 = txtpnDef1.getText();
		
		JRadioButton rdbtnV1 = new JRadioButton("V");
		rdbtnV1.setForeground(Color.WHITE);
		rdbtnV1.setBackground(Color.GRAY); //
		rdbtnV1.setBounds(22, 35, 34, 23);
		contentPane.add(rdbtnV1);
		
		JRadioButton rdbtnF1 = new JRadioButton("F");
		rdbtnF1.setForeground(Color.WHITE);
		rdbtnF1.setBackground(Color.GRAY); //
		rdbtnF1.setBounds(63, 35, 34, 23);
		contentPane.add(rdbtnF1);

		bg1.add(rdbtnV1);
		bg1.add(rdbtnF1);
		
		JLabel lblSimetraCentral = new JLabel("Simetría Central"); /////////2
		lblSimetraCentral.setForeground(Color.WHITE);
		lblSimetraCentral.setBounds(9, 80, 115, 15);
		contentPane.add(lblSimetraCentral);
		
		JTextPane txtpnDef2 = new JTextPane();
		txtpnDef2.setForeground(Color.WHITE);
		txtpnDef2.setText(definicion[segunda]);
		txtpnDef2.setEditable(false);
		txtpnDef2.setBounds(142, 80, 459, 51);
		txtpnDef2.setBackground(new Color(0, 0, 0, 64)); //
		contentPane.add(txtpnDef2);
		
		String def2 = txtpnDef2.getText();
		
		JRadioButton rdbtnV2 = new JRadioButton("V");
		rdbtnV2.setForeground(Color.WHITE);
		rdbtnV2.setBackground(Color.GRAY);
		rdbtnV2.setBounds(22, 103, 34, 23);
		contentPane.add(rdbtnV2);
		
		JRadioButton rdbtnF2 = new JRadioButton("F");
		rdbtnF2.setForeground(Color.WHITE);
		rdbtnF2.setBackground(Color.GRAY);
		rdbtnF2.setBounds(63, 103, 34, 23);
		contentPane.add(rdbtnF2);
		
		bg2.add(rdbtnV2);
		bg2.add(rdbtnF2);
		
		JLabel lblTraslacin = new JLabel("Traslación"); /////////3
		lblTraslacin.setForeground(Color.WHITE);
		lblTraslacin.setBounds(12, 143, 115, 15);
		contentPane.add(lblTraslacin);
		
		JTextPane txtpnDef3 = new JTextPane();
		txtpnDef3.setForeground(Color.WHITE);
		txtpnDef3.setText(definicion[tercera]);
		txtpnDef3.setEditable(false);
		txtpnDef3.setBounds(142, 143, 459, 51);
		txtpnDef3.setBackground(new Color(0, 0, 0, 64)); //
		contentPane.add(txtpnDef3);
		
		String def3 = txtpnDef3.getText();
		
		JRadioButton rdbtnV3 = new JRadioButton("V");
		rdbtnV3.setForeground(Color.WHITE);
		rdbtnV3.setBackground(Color.GRAY);
		rdbtnV3.setBounds(22, 166, 34, 23);
		contentPane.add(rdbtnV3);
		
		JRadioButton rdbtnF3 = new JRadioButton("F");
		rdbtnF3.setForeground(Color.WHITE);
		rdbtnF3.setBackground(Color.GRAY);
		rdbtnF3.setBounds(63, 166, 34, 23);
		contentPane.add(rdbtnF3);
		
		bg3.add(rdbtnV3);
		bg3.add(rdbtnF3);
		
		JLabel lblIsometraDirecta = new JLabel("Isometría Directa"); /////////4
		lblIsometraDirecta.setForeground(Color.WHITE);
		lblIsometraDirecta.setBounds(9, 206, 127, 15);
		contentPane.add(lblIsometraDirecta);
		
		JTextPane txtpnDef4 = new JTextPane();
		txtpnDef4.setForeground(Color.WHITE);
		txtpnDef4.setText(definicion[cuarta]);
		txtpnDef4.setEditable(false);
		txtpnDef4.setBounds(142, 206, 459, 51);
		txtpnDef4.setBackground(new Color(0, 0, 0, 64)); //
		contentPane.add(txtpnDef4);
		
		String def4 = txtpnDef4.getText();
		
		JRadioButton rdbtnV4 = new JRadioButton("V");
		rdbtnV4.setForeground(Color.WHITE);
		rdbtnV4.setBackground(Color.GRAY);
		rdbtnV4.setBounds(22, 229, 34, 23);
		contentPane.add(rdbtnV4);
		
		JRadioButton rdbtnF4 = new JRadioButton("F");
		rdbtnF4.setForeground(Color.WHITE);
		rdbtnF4.setBackground(Color.GRAY);
		rdbtnF4.setBounds(63, 229, 34, 23);
		contentPane.add(rdbtnF4);
		
		bg4.add(rdbtnV4);
		bg4.add(rdbtnF4);
		
		JLabel lblPuntoUnido = new JLabel("Punto Unido"); /////////5
		lblPuntoUnido.setForeground(Color.WHITE);
		lblPuntoUnido.setBounds(9, 269, 100, 15);
		contentPane.add(lblPuntoUnido);
		
		JTextPane txtpnDef5 = new JTextPane();
		txtpnDef5.setForeground(Color.WHITE);
		txtpnDef5.setText(definicion[quinta]);
		txtpnDef5.setEditable(false);
		txtpnDef5.setBounds(142, 269, 459, 51);
		txtpnDef5.setBackground(new Color(0, 0, 0, 64)); //
		contentPane.add(txtpnDef5);
		
		String def5 = txtpnDef5.getText();
		
		JRadioButton rdbtnV5 = new JRadioButton("V");
		rdbtnV5.setForeground(Color.WHITE);
		rdbtnV5.setBackground(Color.GRAY);
		rdbtnV5.setBounds(22, 292, 34, 23);
		contentPane.add(rdbtnV5);
		
		JRadioButton rdbtnF5 = new JRadioButton("F");
		rdbtnF5.setForeground(Color.WHITE);
		rdbtnF5.setBackground(Color.GRAY);
		rdbtnF5.setBounds(63, 292, 34, 23);
		contentPane.add(rdbtnF5);
		
		
		bg5.add(rdbtnV5);
		bg5.add(rdbtnF5);
		
		JLabel lblCop3 = new JLabel("neodev©");
		lblCop3.setBounds(12, 329, 70, 15);
		contentPane.add(lblCop3);
		
		JButton btnAtras2 = new JButton("<");
		btnAtras2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Geometria2 ventana2 = new Geometria2();
				ventana2.setVisible(true);
				dispose();
			}
		});
		btnAtras2.setToolTipText("Volver");
		btnAtras2.setForeground(Color.ORANGE);
		btnAtras2.setBackground(Color.DARK_GRAY);
		btnAtras2.setBounds(396, 327, 44, 25);
		contentPane.add(btnAtras2);
		
		
		JButton btnVerResultado = new JButton("Ver resultado -->");
		
		btnVerResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnV1.isSelected() && def1.equals(definicion[0])) {
					puntaje += 2;
				}else if (rdbtnF1.isSelected() && (!def1.equals(definicion[0])) ){
					puntaje += 2;
				}
				
				if (rdbtnV2.isSelected() && def2.equals(definicion[1])) {
					puntaje += 2;
				}else if (rdbtnF2.isSelected() && (!def2.equals(definicion[1])) ) {
					puntaje += 2;
				}
				
				if (rdbtnV3.isSelected() && def3.equals(definicion[2])) {
					puntaje += 2;
				}else if (rdbtnF3.isSelected() && (!def3.equals(definicion[2])) ){
					puntaje += 2;
				}
				
				if (rdbtnV4.isSelected() && def4.equals(definicion[3])) {
					puntaje += 2;
				}else if (rdbtnF4.isSelected() && (!def4.equals(definicion[3])) ){
					puntaje += 2;
				}
				
				if (rdbtnV5.isSelected() && def5.equals(definicion[4])) {
					puntaje += 2;
				}else if (rdbtnF5.isSelected() && (!def5.equals(definicion[4])) ){
					puntaje += 2;
				}
				
				if( (rdbtnV1.isSelected()||rdbtnF1.isSelected()) && (rdbtnV2.isSelected()||rdbtnF2.isSelected()) &&
						(rdbtnV3.isSelected()||rdbtnF3.isSelected()) && (rdbtnV4.isSelected()||rdbtnF4.isSelected()) &&
						(rdbtnV5.isSelected()||rdbtnF5.isSelected()) ) {
					Geometria4 ventana4 = new Geometria4();
					ventana4.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Error - Debes completar todo el verdadero o falso");
				}
				
			}
		});
		
		btnVerResultado.setForeground(Color.ORANGE);
		btnVerResultado.setBackground(Color.DARK_GRAY);
		btnVerResultado.setBounds(446, 327, 155, 25);
		contentPane.add(btnVerResultado);
		
		System.out.println(primera);
		System.out.println(segunda);
		System.out.println(tercera);
		System.out.println(cuarta);
		System.out.println(quinta);
		
	}
}
