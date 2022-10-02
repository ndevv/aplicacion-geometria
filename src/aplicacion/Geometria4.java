package aplicacion;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author neodev
*/
public class Geometria4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geometria4 frame = new Geometria4();
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
	public Geometria4() {
		setResizable(false);
		setTitle(Geometria.nombre+" - Resultados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	
		JTextPane txtpnResultadoPuntos = new JTextPane();
		txtpnResultadoPuntos.setFont(new Font("Dialog", Font.BOLD, 24));
		txtpnResultadoPuntos.setEditable(false);
		txtpnResultadoPuntos.setForeground(Color.CYAN);
		txtpnResultadoPuntos.setBackground(new Color(0, 0, 0, 0));
		txtpnResultadoPuntos.setText("RESULTADO: "+Geometria3.puntaje+" PUNTOS");
		txtpnResultadoPuntos.setBounds(134, 83, 376, 35);
		contentPane.add(txtpnResultadoPuntos);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 0, 0, 64));
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		if (Geometria3.puntaje >= 5) {
			label.setIcon(new ImageIcon("img/youwin.gif"));
		}else {
			label.setIcon(new ImageIcon("img/youlose.gif"));
		}
		
		JButton btnNuevoIntento = new JButton("Nuevo Intento");
		btnNuevoIntento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Geometria ventana1 = new Geometria();
				ventana1.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblCop4 = new JLabel("neodev©");
		lblCop4.setBounds(0, 404, 70, 15);
		contentPane.add(lblCop4);
		btnNuevoIntento.setToolTipText("Vuelve a la página principal");
		btnNuevoIntento.setForeground(Color.ORANGE);
		btnNuevoIntento.setBackground(Color.DARK_GRAY);
		btnNuevoIntento.setBounds(235, 399, 160, 25);
		contentPane.add(btnNuevoIntento);
		
		label.setBounds(0, -13, 621, 437);
		contentPane.add(label);
	}
}
