package ep2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fluxoDePotenciaHarmonico extends CalculosEValidacoes{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fluxoDePotenciaHarmonico window = new fluxoDePotenciaHarmonico();
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
	public fluxoDePotenciaHarmonico() {
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
		
		JLabel lblNewLabel_1 = new JLabel("ângulo de fase da tensão fundamental");
		lblNewLabel_1.setBounds(100, 125, 300, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ângulo de fase do harmônico da corrente");
		lblNewLabel_2.setBounds(100, 75, 300, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("ordem harmônica da corrente");
		lblNewLabel.setBounds(100, 25, 300, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("amplitude do harmônico da corrente");
		lblNewLabel_3.setBounds(100, 175, 300, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(100, 50, 300, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 100, 300, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 150, 300, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 200, 300, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("amplitude da tensão fundamental");
		lblNewLabel_4.setBounds(100, 225, 300, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 250, 300, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("potência liquida");
		lblNewLabel_5.setBounds(425, 25, 250, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("potência de distorção");
		lblNewLabel_6.setBounds(425, 125, 250, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblFatorDePot = new JLabel("fator de potência verdadeiro");
		lblFatorDePot.setBounds(425, 225, 250, 25);
		frame.getContentPane().add(lblFatorDePot);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText("0");
		textField_5.setBounds(425, 75, 125, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setText("0");
		textField_6.setBounds(425, 175, 125, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("0");
		textField_7.setBounds(425, 275, 125, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("")) {
					if(validaOrdemHarm(textField.getText())) {
						if(!textField_1.getText().equals("")) {
							if(validaAng(textField_1.getText())) {
								if(!textField_2.getText().equals("")) {
									if(validaAng(textField_2.getText())) {
										if(!textField_3.getText().equals("")) {
											if(validaAmpCor(textField_3.getText())) {
												if(textField_4.getText().equals("")) {
													if(validaAmpTen(textField_4.getText())){
														textField_6.setText((calculaPotDist(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText())));
														textField_7.setText(fatorPotTrue());	
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		btnNewButton_1.setBounds(275, 425, 125, 25);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
