package repasoM03.ejemploPackage.ejerSwing.ejer1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App1 extends JFrame {

	private JPanel contenedor;
	
	public static int contador = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App1 frame = new App1();
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
	

	
	public App1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBackground(UIManager.getColor("ComboBox.selectionBackground"));

		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		JLabel textoLabel = new JLabel("Pulsa los botones para modificar el valor");
		textoLabel.setBounds(72, 45, 344, 15);
		contenedor.add(textoLabel);
		
		
		
		JLabel labelContador = new JLabel("" + contador);
		labelContador.setBounds(220, 84, 70, 15);
		contenedor.add(labelContador);
		
		JButton btnIncrementar = new JButton("Incrementar");
		btnIncrementar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador++;
				labelContador.setText("" + contador);
			}
		});
		btnIncrementar.setBounds(72, 158, 117, 25);
		contenedor.add(btnIncrementar);
		
		JButton btnDecrementar = new JButton("Decrementar");
		btnDecrementar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador--;
				labelContador.setText("" + contador);
			}
		});
		btnDecrementar.setBounds(259, 158, 117, 25);
		contenedor.add(btnDecrementar);
	}
}
