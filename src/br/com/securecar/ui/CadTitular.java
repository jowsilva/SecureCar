package br.com.securecar.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadTitular extends JInternalFrame {
	private JTextField textFieldNome;
	private JTextField textFieldIdentidade;
	private JTextField textFieldEmail;
	private JTextField textFieldProfissao;
	private JTextField textFieldLogradouro;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadTitular frame = new CadTitular();
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
	public CadTitular() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(true);
		setClosable(true);

		MaskFormatter mascaraData = null;
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		MaskFormatter mascaraFone = null;
		try {
			mascaraFone = new MaskFormatter("## ####-####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		MaskFormatter mascaraCPF = null;
		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setBounds(100, 100, 640, 480);

		JPanel panelBackground = new JPanel();
		panelBackground.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panelBackground, BorderLayout.CENTER);
		panelBackground.setLayout(null);

		JLabel lblCadastroDeTitular = new JLabel("CADASTRO DE TITULAR");
		lblCadastroDeTitular.setBounds(235, 17, 125, 14);
		panelBackground.add(lblCadastroDeTitular);
		lblCadastroDeTitular.setFont(new Font("Arial", Font.BOLD, 11));

		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 604, 99);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
				"Informa\u00E7\u00F5es Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null));
		panelBackground.add(panel);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNome.setBounds(10, 20, 30, 14);
		panel.add(lblNome);

		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldNome.setBounds(41, 17, 256, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblIdentidade = new JLabel("Identidade:");
		lblIdentidade.setFont(new Font("Arial", Font.PLAIN, 11));
		lblIdentidade.setBounds(307, 20, 52, 14);
		panel.add(lblIdentidade);

		textFieldIdentidade = new JTextField();
		textFieldIdentidade.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldIdentidade.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldIdentidade.setBounds(364, 17, 86, 20);
		panel.add(textFieldIdentidade);
		textFieldIdentidade.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCpf.setBounds(475, 20, 22, 14);
		panel.add(lblCpf);
		JFormattedTextField formattedTextFieldCPF = new JFormattedTextField(mascaraCPF);
		formattedTextFieldCPF.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldCPF.setText("");
		formattedTextFieldCPF.setBounds(501, 17, 93, 20);
		panel.add(formattedTextFieldCPF);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstadoCivil.setBounds(10, 45, 58, 14);
		panel.add(lblEstadoCivil);

		JComboBox comboBoxEC = new JComboBox();
		comboBoxEC.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxEC.setModel(new DefaultComboBoxModel(new String[] { "Solteiro (S)", "Casado (C)", "Vi\u00FAvo (V)",
				"Uni\u00E3o Est\u00E1vel (UE)", "Divorciado (D)" }));
		comboBoxEC.setBounds(71, 42, 114, 20);
		panel.add(comboBoxEC);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSexo.setBounds(195, 45, 28, 14);
		panel.add(lblSexo);

		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		comboBoxSexo.setBounds(224, 42, 73, 20);
		panel.add(comboBoxSexo);

		JLabel lblDataNascimento = new JLabel("Data de Nasc.:");
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDataNascimento.setBounds(307, 45, 71, 14);
		panel.add(lblDataNascimento);
		JFormattedTextField formattedTextFieldDN = new JFormattedTextField(mascaraData);
		formattedTextFieldDN.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldDN.setBounds(380, 42, 70, 20);
		panel.add(formattedTextFieldDN);

		JLabel lblDataCadastro = new JLabel("Data de Cad.:");
		lblDataCadastro.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDataCadastro.setBounds(460, 45, 65, 14);
		panel.add(lblDataCadastro);

		JFormattedTextField formattedTextFieldDC = new JFormattedTextField(mascaraData);
		formattedTextFieldDC.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldDC.setBounds(524, 42, 70, 20);
		panel.add(formattedTextFieldDC);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEmail.setBounds(10, 70, 31, 14);
		panel.add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(41, 67, 144, 20);
		panel.add(textFieldEmail);

		JLabel lblTelefone = new JLabel("Fone:");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTelefone.setBounds(195, 70, 27, 14);
		panel.add(lblTelefone);
		JFormattedTextField formattedTextFieldFone = new JFormattedTextField(mascaraFone);
		formattedTextFieldFone.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldFone.setFont(new Font("Arial", Font.PLAIN, 11));
		formattedTextFieldFone.setText("");
		formattedTextFieldFone.setBounds(222, 67, 75, 20);
		panel.add(formattedTextFieldFone);

		JLabel lblProfissao = new JLabel("Profiss\u00E3o:");
		lblProfissao.setFont(new Font("Arial", Font.PLAIN, 11));
		lblProfissao.setBounds(307, 70, 49, 14);
		panel.add(lblProfissao);

		textFieldProfissao = new JTextField();
		textFieldProfissao.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldProfissao.setColumns(10);
		textFieldProfissao.setBounds(357, 67, 93, 20);
		panel.add(textFieldProfissao);

		JLabel lblSituacao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituacao.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSituacao.setBounds(475, 70, 45, 14);
		panel.add(lblSituacao);

		JComboBox comboBoxSituacao = new JComboBox();
		comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxSituacao.setModel(new DefaultComboBoxModel(new String[] { "Ativo (A)", "Inativo (I)" }));
		comboBoxSituacao.setBounds(520, 67, 74, 20);
		panel.add(comboBoxSituacao);

		JPanel panelEndereco = new JPanel();
		panelEndereco.setForeground(new Color(0, 0, 0));
		panelEndereco.setToolTipText("");
		panelEndereco.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Endere\u00E7o",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEndereco.setBackground(Color.LIGHT_GRAY);
		panelEndereco.setBounds(10, 152, 604, 76);
		panelBackground.add(panelEndereco);
		panelEndereco.setLayout(null);

		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLogradouro.setBounds(10, 20, 59, 14);
		panelEndereco.add(lblLogradouro);

		textFieldLogradouro = new JTextField();
		textFieldLogradouro.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldLogradouro.setBounds(68, 17, 217, 20);
		panelEndereco.add(textFieldLogradouro);
		textFieldLogradouro.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBairro.setBounds(295, 20, 32, 14);
		panelEndereco.add(lblBairro);

		textFieldBairro = new JTextField();
		textFieldBairro.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(327, 17, 93, 20);
		panelEndereco.add(textFieldBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCidade.setBounds(430, 20, 36, 14);
		panelEndereco.add(lblCidade);

		textFieldCidade = new JTextField();
		textFieldCidade.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(467, 17, 93, 20);
		panelEndereco.add(textFieldCidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstado.setBounds(10, 45, 36, 14);
		panelEndereco.add(lblEstado);

		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] { "Para\u00EDba (PB)" }));
		comboBoxEstado.setBounds(47, 42, 85, 20);
		panelEndereco.add(comboBoxEstado);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCep.setBounds(141, 45, 22, 14);
		panelEndereco.add(lblCep);

		MaskFormatter mascaraCEP = null;
		try {
			mascaraCEP = new MaskFormatter("#####-###");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextFieldCEP = new JFormattedTextField(mascaraCEP);
		formattedTextFieldCEP.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldCEP.setBounds(164, 42, 68, 20);
		panelEndereco.add(formattedTextFieldCEP);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cadastrar) {
			}
		});
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCadastrar.setBounds(506, 417, 108, 23);
		panelBackground.add(btnCadastrar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cancelar) {

			}
		});
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCancelar.setBounds(407, 417, 89, 23);
		panelBackground.add(btnCancelar);

	}
}
