package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class InterfaceCalculadora {

	private JFrame frmCalculadora;
	private JTextField tFTela;
	Double entrada1, entrada2;
	String resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCalculadora window = new InterfaceCalculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public InterfaceCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.GRAY);
		frmCalculadora.setBackground(Color.BLACK);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 267, 288);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "0");
			}
		});
		btnNewButton.setBounds(10, 197, 92, 40);
		frmCalculadora.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(",");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + ",".replace(",","."));
			}
		});
		btnNewButton_1.setBounds(101, 197, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "1");
			}
		});
		btnNewButton_1_1.setBounds(9, 157, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "2");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(55, 157, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("3");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "3");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3.setBounds(101, 157, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText()+"4");
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_4.setBounds(9, 117, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("5");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "5");
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_5.setBounds(55, 117, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("6");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "6");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_6.setBounds(101, 117, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("7");
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "7");
			}
		});
		btnNewButton_1_7.setBounds(9, 77, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("8");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "8");
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_8.setBounds(55, 77, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("9");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText(tFTela.getText() + "9");
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_9.setBounds(101, 77, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_3_1 = new JButton("=");
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada2 = Double.parseDouble(tFTela.getText());
				if (resultado == "soma") 
				{
					tFTela.setText(String.valueOf(entrada1 + entrada2));
				}else if (resultado == "subtracao") 
					{
						tFTela.setText(String.valueOf(entrada1 - entrada2));
					} else if (resultado == "multiplicacao") 
						{
							tFTela.setText(String.valueOf(entrada1 * entrada2));
						} else if (resultado == "divisao")
							{
								tFTela.setText(String.valueOf(entrada1 / entrada2));
							}
				
			}
		});
		btnNewButton_1_3_1.setBounds(194, 157, 47, 81);
		frmCalculadora.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_3_2 = new JButton("C");
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText("");
			}
		});
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3_2.setBounds(194, 117, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_3_3 = new JButton("ON");
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFTela.setText("");
			}
		});
		btnNewButton_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_3_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3_3.setBounds(194, 77, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_9_1 = new JButton("/");
		btnNewButton_1_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada1 = Double.parseDouble(tFTela.getText());
				tFTela.setText("");
				resultado = "divisao";
				
			}
		});
		btnNewButton_1_9_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_9_1.setBounds(147, 77, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_9_1);
		
		JButton btnNewButton_1_9_2 = new JButton("*");
		btnNewButton_1_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada1 = Double.parseDouble(tFTela.getText());
				tFTela.setText("");
				resultado = "multiplicacao";
			}
		});
		btnNewButton_1_9_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_9_2.setBounds(147, 117, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_9_2);
		
		JButton btnNewButton_1_9_3 = new JButton("+");
		btnNewButton_1_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada1 = Double.parseDouble(tFTela.getText());
				tFTela.setText("");
				resultado = "soma";
			}
		});
		btnNewButton_1_9_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_9_3.setBounds(147, 157, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_9_3);
		
		JButton btnNewButton_1_9_4 = new JButton("-");
		btnNewButton_1_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada1 = Double.parseDouble(tFTela.getText());
				tFTela.setText("");
				resultado = "subtracao";
			}
		});
		btnNewButton_1_9_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_9_4.setBounds(147, 197, 47, 40);
		frmCalculadora.getContentPane().add(btnNewButton_1_9_4);
		
		tFTela = new JTextField();
		tFTela.setEditable(false);
		tFTela.setHorizontalAlignment(SwingConstants.RIGHT);
		tFTela.setBounds(10, 11, 231, 55);
		frmCalculadora.getContentPane().add(tFTela);
		tFTela.setColumns(10);
	}
}

