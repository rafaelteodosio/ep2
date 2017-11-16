package ep2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class distorcaoHarmonica1 {

	private JFrame frame;
	public int impar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distorcaoHarmonica1 window = new distorcaoHarmonica1();
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
	public distorcaoHarmonica1() {
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
		
		JButton btnNewButton = new JButton("ordens harmônicas impares");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				impar = 1;
				distorcaoHarmonica2 distHarm2 = new distorcaoHarmonica2();
				distHarm2.main(null);
				
			}
		});
		btnNewButton.setBounds(200, 100, 300, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOrdensHarmnicasPares = new JButton("ordens harmônicas pares");
		btnOrdensHarmnicasPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				impar = 0;
				distorcaoHarmonica2 distHarm2 = new distorcaoHarmonica2();
				distHarm2.main(null);	
				
			}
		});
		btnOrdensHarmnicasPares.setBounds(200, 200, 300, 25);
		frame.getContentPane().add(btnOrdensHarmnicasPares);
	}
}
