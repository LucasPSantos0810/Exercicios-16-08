package Exercicio3;

import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame{
	JLabel cep,phone,cpf,date;
	JTextField caixa1,caixa2,caixa3,caixa4;
	
	public Cadastro(){
		Container tela = getContentPane();
		setLayout(null);
			cep = new JLabel("CEP:");
			phone = new JLabel("Telefone:");
			cpf = new JLabel("CPF:");
			date = new JLabel("Data:");
			caixa1 = new JTextField(8);
			caixa2 = new JTextField(11);
			caixa3 = new JTextField(11);
			caixa4 = new JTextField(8);
			
			cep.setBounds(100,75,200,50);
			phone.setBounds(100,175,200,50);
			cpf.setBounds(100,275,200,50);
			date.setBounds(100,375,200,50);
			caixa1.setBounds(250,75,250,50);
			caixa2.setBounds(250,175,250,50);
			caixa3.setBounds(250,275,250,50);
			caixa4.setBounds(250,375,250,50);
			
			tela.add(cep);
			tela.add(phone);
			tela.add(cpf);
			tela.add(date);
			tela.add(caixa1);
			tela.add(caixa2);
			tela.add(caixa3);
			tela.add(caixa4);
			setSize(800,500);
			setVisible(true);
			setLocationRelativeTo(null);
	
}

public static void main(String args[]) {
		Cadastro app = new Cadastro();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
