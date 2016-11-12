package br.com.securecar.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class CadSeguro extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadSeguro frame = new CadSeguro();
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
	public CadSeguro() {
		setBounds(100, 100, 640, 480);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Informa\u00E7\u00F5es do Seguro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 11, 604, 153);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(10, 25, 46, 14);
		panel_1.add(lblNumero);
		
		textField = new JTextField();
		textField.setBounds(50, 22, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(153, 25, 46, 14);
		panel_1.add(lblValor);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(197, 22, 6, 20);
		panel_1.add(formattedTextField);
		
		JLabel lblFranquia = new JLabel("Franquia:");
		lblFranquia.setBounds(252, 25, 46, 14);
		panel_1.add(lblFranquia);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(340, 22, 6, 20);
		panel_1.add(formattedTextField_1);

	}
}
