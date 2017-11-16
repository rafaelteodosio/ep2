package ep2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.function.ToIntFunction;

public class fluxoDePotenciaFundamental extends CalculosEValidacoes {

	private JFrame frame;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_3;
	private JTextField result_1;
	private JTextField result_2;
	private JTextField result_3;
	private JTextField result_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fluxoDePotenciaFundamental window = new fluxoDePotenciaFundamental();
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
	public fluxoDePotenciaFundamental() {
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
		
		JLabel lblAmplitude = new JLabel("Amplitude da corrente");
		lblAmplitude.setBounds(100, 75, 300, 25);
		frame.getContentPane().add(lblAmplitude);
		
		textField2 = new JTextField();
		textField2.setBounds(100, 100, 300, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblnguloDeFase = new JLabel("Ângulo de fase da tensão");
		lblnguloDeFase.setBounds(100, 125, 200, 25);
		frame.getContentPane().add(lblnguloDeFase);
		
		JLabel lblNewLabel = new JLabel("Ângulo de fase da corrente");
		lblNewLabel.setBounds(100, 175, 200, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField3 = new JTextField();
		textField3.setBounds(100, 150, 300, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(100, 200, 300, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JButton btnContinuar = new JButton("calcular");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!textField1.getText().equals("")) {
					if(validaAmpTen(textField1.getText())) {
						if(!textField2.getText().equals("")) {
							if(validaAmpCor(textField2.getText())) {
								if(!textField3.getText().equals("")) {
									if(validaAng(textField3.getText())) {
										if(!textField4.getText().equals("")) {
											if(validaAng(textField4.getText())) {
												result_1.setText(calculaPotAtiva(textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText()));
												result_2.setText(calculaPotReativa(textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText()));
												result_3.setText(calculaPotAparente(textField1.getText(),textField2.getText()));
												result_4.setText(calculaFatPot(textField3.getText(),textField4.getText()));
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
		btnContinuar.setBounds(275, 425, 125, 25);
		frame.getContentPane().add(btnContinuar);
		
		JLabel lblNewLabel_1 = new JLabel("amplitude da tensão");
		lblNewLabel_1.setBounds(100, 25, 300, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField1 = new JTextField();
		textField1.setBounds(100, 50, 300, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("potência ativa");
		lblNewLabel_2.setBounds(100, 225, 300, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("potência reativa");
		lblNewLabel_4.setBounds(300, 225, 300, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("potência aparente");
		lblNewLabel_5.setBounds(100, 325, 300, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_3 = new JLabel("fator de potência");
		lblNewLabel_3.setBounds(300, 325, 300, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		result_1 = new JTextField();
		result_1.setText("0");
		result_1.setEditable(false);
		result_1.setBounds(100, 275, 125, 20);
		frame.getContentPane().add(result_1);
		result_1.setColumns(10);
		
		result_2 = new JTextField();
		result_2.setEditable(false);
		result_2.setText("0");
		result_2.setBounds(300, 275, 125, 20);
		frame.getContentPane().add(result_2);
		result_2.setColumns(10);
		
		result_3 = new JTextField();
		result_3.setText("0");
		result_3.setEditable(false);
		result_3.setBounds(100, 375, 125, 20);
		frame.getContentPane().add(result_3);
		result_3.setColumns(10);
		
		result_4 = new JTextField();
		result_4.setText("0");
		result_4.setEditable(false);
		result_4.setBounds(300, 375, 125, 20);
		frame.getContentPane().add(result_4);
		result_4.setColumns(10);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
