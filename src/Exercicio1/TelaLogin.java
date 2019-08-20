package Exercicio1;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame{
	JLabel login, password, texto;
	JTextField caixa1, caixa2;
	JButton ok, cancel;
	
	public TelaLogin(){
		super("Tela de Inicialização - Paloma");
		Container tela = getContentPane();
		setLayout(null);
			texto = new JLabel ("Entre com os seus dados:");
			login = new JLabel ("Login:");
			password = new JLabel ("Password:");
			caixa1 = new JTextField(30);
			caixa2 = new JTextField(8);
			ok = new JButton("Ok");
			cancel = new JButton("Cancelar");
			texto.setBounds(150,40,600,20);
			login.setBounds(70,100,300,20);
			password.setBounds(60,160,300,20);
			caixa1.setBounds(170,100,300,20);
			caixa2.setBounds(170,160,300,20);
			ok.setBounds(190,250,110,30);
			cancel.setBounds(320,250, 110,30);
			texto.setForeground(Color.red);
			texto.setFont(new Font("Courier New", Font.BOLD,18));
			login.setFont(new Font("Courier New", Font.BOLD,17));
			password.setFont(new Font("Courier New", Font.BOLD,17));
			tela.add(texto);
			tela.add(login);
			tela.add(password);
			tela.add(caixa1);
			tela.add(caixa2);
			tela.add(ok);
			tela.add(cancel);
			setSize(600,420);
			setVisible(true);
			setLocationRelativeTo(null);
		
	}
	
	public static void main(String args[]) {
		TelaLogin app = new TelaLogin();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
