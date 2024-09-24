package InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Random; 
import java.util.*; 

public class diceInterface extends JFrame {

	private JPanel contentPane;
	private JTextField inputNomeJogador1;
	private JTextField inputNomeJogador2;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diceInterface frame = new diceInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void LogicaDice() {
				Scanner snr = new Scanner(System.in);
				Random random = new Random();
				int n = 3;
				double[] pontuacaoJogador1 = new double[n], pontuacaoJogador2 = new double[n];
				double somaTotalJogador1 = 0, somaTotalJogador2 = 0;

				boolean doisValoresIguaisJogador1 = false;
				boolean doisValoresIguaisJogador2 = false;
				
				boolean tresValoresIguaisJogador1 = false;
				boolean tresValoresIguaisJogador2 = false;
				
				System.out.print("Digite o nome do Jogador 1: ");
				String jogador1 = snr.next();
				
				System.out.print("Digite o nome do Jogador 2: ");
				String jogador2 = snr.next();
				
				for(int i = 0; i < 3; i++) {
					pontuacaoJogador1[i] = random.nextInt(6)+1;
					pontuacaoJogador2[i] = random.nextInt(6)+1;

					somaTotalJogador1 += pontuacaoJogador1[i];
					somaTotalJogador2 += pontuacaoJogador2[i];
				}
				
				for(int j = 0; j < 2; j++) {
					for(int k = 1; k < 3; k++) {
						if(j == k) {
							if(pontuacaoJogador1[j] == pontuacaoJogador1[k]) {
								doisValoresIguaisJogador1 = true;
							}
							
							if(pontuacaoJogador2[j] == pontuacaoJogador2[k]) {
								doisValoresIguaisJogador2 = true;
							}
							
							if(pontuacaoJogador1[j] != pontuacaoJogador1[k]) {
								tresValoresIguaisJogador1 = true;
							}
							
							if(pontuacaoJogador2[j] != pontuacaoJogador2[k]) {
								tresValoresIguaisJogador2 = true;
							}
						}
					}
				}
				
				if(tresValoresIguaisJogador1) {
					somaTotalJogador1 *= 3;
				}else if(doisValoresIguaisJogador1){
					somaTotalJogador1 *= 2;
				}
				
				if(tresValoresIguaisJogador2) {
					somaTotalJogador2 *= 3;
				}else if(doisValoresIguaisJogador2){
					somaTotalJogador2 *= 2;
				}
				
				
				System.out.println(jogador1 + " fez " + somaTotalJogador1 + " pontos");
				System.out.println("dado1 = " + pontuacaoJogador1[0] + " dado2 = " + pontuacaoJogador1[1]
							+ " dado3 = " + pontuacaoJogador1[2]);
				
				System.out.println(jogador2 + " fez " + somaTotalJogador2 + " pontos");
				System.out.println("dado1 = " + pontuacaoJogador2[0] + " dado2 = " + pontuacaoJogador2[1]
							+ " dado3 = " + pontuacaoJogador2[2]);
				
				if(somaTotalJogador1 > somaTotalJogador2) {
					System.out.println("Jogador 1 " + jogador1 + " ganhou.");
					return;
				}
				
				System.out.println("Jogador 2 " + jogador2 + " ganhou.");
			}

	
	/**
	 * Create the frame.
	 */
	public diceInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 593);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(36, 31, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnResetar = new JButton("Resetar");
		btnResetar.setBounds(12, 12, 99, 25);
		contentPane.add(btnResetar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(123, 12, 99, 25);
		contentPane.add(btnFechar);
		
		JLabel lblNewLabel = new JLabel("Digite o nome do Jogador 1:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(50, 92, 251, 15);
		contentPane.add(lblNewLabel);
		
		inputNomeJogador1 = new JTextField();
		inputNomeJogador1.setBounds(306, 88, 337, 25);
		contentPane.add(inputNomeJogador1);
		inputNomeJogador1.setColumns(10);
		
		inputNomeJogador2 = new JTextField();
		inputNomeJogador2.setColumns(10);
		inputNomeJogador2.setBounds(306, 121, 337, 25);
		contentPane.add(inputNomeJogador2);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do Jogador 2:");
		lblDigiteONome.setForeground(new Color(255, 255, 255));
		lblDigiteONome.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDigiteONome.setBounds(50, 125, 251, 15);
		contentPane.add(lblDigiteONome);
		
		JLabel label = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(48, 152, 724, 25);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(94, 92, 100));
		panel.setBounds(50, 189, 714, 226);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblJogador = new JLabel(" Jogador 1:");
		lblJogador.setForeground(Color.WHITE);
		lblJogador.setFont(new Font("Dialog", Font.BOLD, 16));
		lblJogador.setBounds(12, 53, 106, 15);
		panel.add(lblJogador);
		
		JLabel lblJogador_2 = new JLabel(" Jogador 2:");
		lblJogador_2.setForeground(Color.WHITE);
		lblJogador_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblJogador_2.setBounds(12, 136, 106, 15);
		panel.add(lblJogador_2);
		
		JLabel lblDado = new JLabel("Dado1");
		lblDado.setForeground(new Color(255, 255, 255));
		lblDado.setBounds(337, 30, 70, 15);
		panel.add(lblDado);
		
		JLabel lblDado_2 = new JLabel("Dado2");
		lblDado_2.setForeground(Color.WHITE);
		lblDado_2.setBounds(419, 30, 70, 15);
		panel.add(lblDado_2);
		
		JLabel lblDado_2_1 = new JLabel("Dado3");
		lblDado_2_1.setForeground(Color.WHITE);
		lblDado_2_1.setBounds(490, 30, 70, 15);
		panel.add(lblDado_2_1);
		
		JButton btnJogarJogador1_1 = new JButton("Jogar");
		btnJogarJogador1_1.setBounds(573, 49, 117, 25);
		panel.add(btnJogarJogador1_1);
		
		JLabel lblDado_1 = new JLabel("Dado1");
		lblDado_1.setForeground(Color.WHITE);
		lblDado_1.setBounds(337, 121, 70, 15);
		panel.add(lblDado_1);
		
		JLabel lblDado_2_2 = new JLabel("Dado2");
		lblDado_2_2.setForeground(Color.WHITE);
		lblDado_2_2.setBounds(419, 121, 70, 15);
		panel.add(lblDado_2_2);
		
		JLabel lblDado_2_1_1 = new JLabel("Dado3");
		lblDado_2_1_1.setForeground(Color.WHITE);
		lblDado_2_1_1.setBounds(490, 121, 70, 15);
		panel.add(lblDado_2_1_1);
		
		JButton btnJogarJogador2_1 = new JButton("Jogar");
		btnJogarJogador2_1.setBounds(573, 132, 117, 25);
		panel.add(btnJogarJogador2_1);
		
		JLabel lblDado1Jogador1 = new JLabel("A");
		lblDado1Jogador1.setFont(new Font("Dialog", Font.BOLD, 36));
		lblDado1Jogador1.setForeground(new Color(255, 255, 255));
		lblDado1Jogador1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado1Jogador1.setBounds(324, 54, 70, 30);
		panel.add(lblDado1Jogador1);
		
		JLabel lblDado2Jogador1 = new JLabel("A");
		lblDado2Jogador1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado2Jogador1.setForeground(Color.WHITE);
		lblDado2Jogador1.setFont(new Font("Dialog", Font.BOLD, 36));
		lblDado2Jogador1.setBounds(406, 53, 70, 30);
		panel.add(lblDado2Jogador1);
		
		JLabel btnDado3Jogador1 = new JLabel("A");
		btnDado3Jogador1.setHorizontalAlignment(SwingConstants.CENTER);
		btnDado3Jogador1.setForeground(Color.WHITE);
		btnDado3Jogador1.setFont(new Font("Dialog", Font.BOLD, 36));
		btnDado3Jogador1.setBounds(490, 54, 70, 30);
		panel.add(btnDado3Jogador1);
		
		JLabel btnDado1Jogador2 = new JLabel("A");
		btnDado1Jogador2.setHorizontalAlignment(SwingConstants.CENTER);
		btnDado1Jogador2.setForeground(Color.WHITE);
		btnDado1Jogador2.setFont(new Font("Dialog", Font.BOLD, 36));
		btnDado1Jogador2.setBounds(324, 149, 70, 30);
		panel.add(btnDado1Jogador2);
		
		JLabel btnDado2Jogador2 = new JLabel("A");
		btnDado2Jogador2.setHorizontalAlignment(SwingConstants.CENTER);
		btnDado2Jogador2.setForeground(Color.WHITE);
		btnDado2Jogador2.setFont(new Font("Dialog", Font.BOLD, 36));
		btnDado2Jogador2.setBounds(406, 148, 70, 30);
		panel.add(btnDado2Jogador2);
		
		JLabel btnDado3Jogador2 = new JLabel("A");
		btnDado3Jogador2.setHorizontalAlignment(SwingConstants.CENTER);
		btnDado3Jogador2.setForeground(Color.WHITE);
		btnDado3Jogador2.setFont(new Font("Dialog", Font.BOLD, 36));
		btnDado3Jogador2.setBounds(490, 149, 70, 30);
		panel.add(btnDado3Jogador2);
		
		JLabel outputNomeJogador1 = new JLabel("jog1");
		outputNomeJogador1.setVisible(false);
		outputNomeJogador1.setHorizontalAlignment(SwingConstants.CENTER);
		outputNomeJogador1.setForeground(Color.WHITE);
		outputNomeJogador1.setFont(new Font("Dialog", Font.BOLD, 20));
		outputNomeJogador1.setBounds(116, 49, 70, 30);
		panel.add(outputNomeJogador1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(61, 56, 70));
		panel_2.setBounds(50, 450, 714, 74);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnJogarJogador1 = new JButton("Jogar");
		btnJogarJogador1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputNomeJogador1.getText();
				outputNomeJogador1.setText(input);
				outputNomeJogador1.setVisible(true);
			}
		});
		btnJogarJogador1.setBounds(655, 88, 117, 25);
		contentPane.add(btnJogarJogador1);
		
		JButton btnJogarJogador2 = new JButton("Jogar");
		btnJogarJogador2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputNomeJogador2.getText();
				outputNomeJogador2.setText(input);
				outputNomeJogador2.setVisible(true);
			}
		});
		btnJogarJogador2.setBounds(655, 125, 117, 25);
		contentPane.add(btnJogarJogador2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
