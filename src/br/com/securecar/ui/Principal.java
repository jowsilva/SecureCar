package br.com.securecar.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Principal extends JFrame {

	private static CadTitular titular;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 560);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Cadastros");
		mnArquivo.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnArquivo);

		JMenuItem mntmCadastroDeTitular = new JMenuItem("Cadastro de Titular");
		mntmCadastroDeTitular.setFont(new Font("Arial", Font.PLAIN, 11));
		mntmCadastroDeTitular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (titular == null) {
					titular = new CadTitular();
					desktopPane.add(titular);
					try {
						titular.setMaximum(true);
					} catch (PropertyVetoException e1) {
						e1.printStackTrace();
					}
					titular.setVisible(true);
				} else {
					titular.setVisible(true);
					desktopPane.moveToFront(titular);
				}
			}
		});
		mnArquivo.add(mntmCadastroDeTitular);
		
		JMenuItem mntmCadastroDeSeguro = new JMenuItem("Cadastro de Seguro");
		mntmCadastroDeSeguro.setFont(new Font("Arial", Font.PLAIN, 11));
		mnArquivo.add(mntmCadastroDeSeguro);
		
		JMenu mnAtualizaes = new JMenu("Atualiza\u00E7\u00F5es");
		mnAtualizaes.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnAtualizaes);
		
		JMenuItem mntmAtualizarCadastroDe = new JMenuItem("Atualizar Titular");
		mntmAtualizarCadastroDe.setFont(new Font("Arial", Font.PLAIN, 11));
		mnAtualizaes.add(mntmAtualizarCadastroDe);
		
		JMenuItem mntmAtualizarCadastroDe_1 = new JMenuItem("Atualizar Seguro");
		mntmAtualizarCadastroDe_1.setFont(new Font("Arial", Font.PLAIN, 11));
		mnAtualizaes.add(mntmAtualizarCadastroDe_1);
		
		JMenu mnExcluses = new JMenu("Exclus\u00F5es");
		mnExcluses.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnExcluses);
		
		JMenuItem mntmExcluirCadastroDe = new JMenuItem("Excluir Titular");
		mntmExcluirCadastroDe.setFont(new Font("Arial", Font.PLAIN, 11));
		mnExcluses.add(mntmExcluirCadastroDe);
		
		JMenuItem mntmExcluirCadastroDe_1 = new JMenuItem("Excluir Seguro");
		mntmExcluirCadastroDe_1.setFont(new Font("Arial", Font.PLAIN, 11));
		mnExcluses.add(mntmExcluirCadastroDe_1);
		
		JMenu mnConsultas = new JMenu("Consultas");
		mnConsultas.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnConsultas);
		
		JMenuItem mntmConsultarTitulares = new JMenuItem("Consultar Titulares");
		mntmConsultarTitulares.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConsultas.add(mntmConsultarTitulares);
		
		JMenuItem mntmConsultarSeguros = new JMenuItem("Consultar Seguros");
		mntmConsultarSeguros.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConsultas.add(mntmConsultarSeguros);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnSair);

	}
}
