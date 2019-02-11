package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaPrincipal {

	private JFrame frmSoftwareRestaurante;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public void mostrarVentana(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal window = new VistaPrincipal();
					window.frmSoftwareRestaurante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public VistaPrincipal() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmSoftwareRestaurante = new JFrame();
		frmSoftwareRestaurante.setBackground(Color.RED);
		frmSoftwareRestaurante.setTitle("Software Restaurante ");
		frmSoftwareRestaurante.setResizable(false);
		frmSoftwareRestaurante.setBounds(100, 100, 837, 600);
		frmSoftwareRestaurante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Cliceo");
			}
		});
		panel.setBackground(Color.ORANGE);
		frmSoftwareRestaurante.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
