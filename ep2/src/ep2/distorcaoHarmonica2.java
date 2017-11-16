package ep2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.naming.ldap.Rdn;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class distorcaoHarmonica2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField txtAmplitudeFundamental;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distorcaoHarmonica2 window = new distorcaoHarmonica2();
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
	public distorcaoHarmonica2() {
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
		
		textField = new JTextField();
		textField.setBounds(250, 50, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnHarmnico = new JRadioButton("harmônico 1");
		rdbtnHarmnico.setBounds(100, 25, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico);
		
		JRadioButton rdbtnHarmnico_1 = new JRadioButton("harmônico 2");
		rdbtnHarmnico_1.setBounds(100, 75, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico_1);
		
		JRadioButton rdbtnHarmnico_2 = new JRadioButton("harmônico 3");
		rdbtnHarmnico_2.setBounds(100, 125, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico_2);
		
		JRadioButton rdbtnHarmnico_3 = new JRadioButton("harmônico 4");
		rdbtnHarmnico_3.setBounds(100, 175, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico_3);
		
		JRadioButton rdbtnHarmnico_4 = new JRadioButton("harmônico 5");
		rdbtnHarmnico_4.setBounds(100, 225, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico_4);
		
		JRadioButton rdbtnHarmnico_5 = new JRadioButton("harmônico 6");
		rdbtnHarmnico_5.setBounds(100, 275, 150, 25);
		frame.getContentPane().add(rdbtnHarmnico_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 100, 150, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 150, 150, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(250, 250, 150, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 200, 150, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(250, 300, 150, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSrieDeFourrier = new JLabel("amplitude");
		lblSrieDeFourrier.setBounds(250, 25, 250, 25);
		frame.getContentPane().add(lblSrieDeFourrier);
		
		
		JButton btnNewButton = new JButton("continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnHarmnico.isSelected()) {
					textField.getText();
				}
				if(rdbtnHarmnico_1.isSelected()) {
					textField_1.getText();
				}
				if(rdbtnHarmnico_2.isSelected()) {
					textField_2.getText();
				}
				if(rdbtnHarmnico_3.isSelected()) {
					textField_3.getText();
				}
				if(rdbtnHarmnico_4.isSelected()) {
					textField_4.getText();
				}
				if(rdbtnHarmnico_5.isSelected()) {
					textField_5.getText();
				}
				if(true) {
					textField_6.setText(toString());
				}
			}
		});
		btnNewButton.setBounds(275, 425, 125, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("angulo");
		lblNewLabel.setBounds(425, 25, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setBounds(425, 50, 150, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("fundamental");
		lblNewLabel_1.setBounds(100, 325, 200, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAmplitudeFundamental = new JTextField();
		txtAmplitudeFundamental.setBounds(250, 350, 150, 19);
		frame.getContentPane().add(txtAmplitudeFundamental);
		txtAmplitudeFundamental.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(425, 100, 150, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(425, 150, 150, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(425, 250, 150, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(425, 200, 150, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(425, 300, 150, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(425, 350, 150, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
	}
}
