package ep2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaPrincipal window = new janelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public janelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("fluxo de potência fundamental");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fluxoDePotenciaFundamental fluxoDePotFun = new fluxoDePotenciaFundamental();
				fluxoDePotFun.main(null);
				
			}
		});
		btnNewButton.setBounds(200, 50, 300, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("distorção harmônica");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				distorcaoHarmonica1 distorHarm = new distorcaoHarmonica1();
				distorHarm.main(null);
				
			}
		});
		btnNewButton_3.setBounds(200, 200, 300, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("fluxo de potência harmônico");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			fluxoDePotenciaHarmonico fluPotHar = new fluxoDePotenciaHarmonico();
			fluPotHar.main(null);
				
			}
		});
		btnNewButton_6.setBounds(200, 350, 300, 25);
		frame.getContentPane().add(btnNewButton_6);
	}
}
