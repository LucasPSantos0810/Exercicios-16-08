package Exercicio4;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame{
	JLabel cabecalho,status,nome,bairro,cidade,estado,phonecom,cnpj,inscest,email,observacao,rua,numero,compl,cep,resphone,cellphone,cpf,rg,datanasc;
	JTextField a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;
	JRadioButton pf,pj;
	JButton cadastrar;
	ButtonGroup grupo;
	
public CadastroCliente(){
	super("Luxxkaah");
		Container tela = getContentPane();
		setLayout(null);
			cabecalho = new JLabel("Cadastro de Clientes");
			status = new JLabel("Status:");
			nome = new JLabel("Nome:");
			bairro = new JLabel("Bairro:");
			cidade = new JLabel("Cidade:");
			estado = new JLabel("Estado:");
			phonecom = new JLabel("Telefone Residencial:");
			cnpj = new JLabel("CNPJ:");
			inscest = new JLabel("Inscri��o Estadual:");
			email = new JLabel("Email:");
			observacao = new JLabel("Observa��o:");
			rua = new JLabel("Rua:");
			numero = new JLabel("N�mero:");
			compl = new JLabel("Complemento:");
			cep = new JLabel("CEP:");
			resphone = new JLabel("Telefone Residencial:");
			cellphone = new JLabel("Telefone Celular:");
			cpf = new JLabel("CPF:");
			rg = new JLabel("RG:");
			datanasc = new JLabel("Data de Nascimento:");
			pf = new JRadioButton("Pessoa F�sica");
			pj = new JRadioButton("Pessoa Jur�dica");
			cadastrar = new JButton("Cadastrar");
			a = new JTextField (50);
			b = new JTextField (35);
			c = new JTextField (30);
			d = new JTextField (2);
			e = new JTextField (11);
			f = new JTextField (12);
			g = new JTextField (20);
			h = new JTextField (35);
			i = new JTextField (600);
			j = new JTextField (50);
			k = new JTextField (6);
			l = new JTextField (30);
			m = new JTextField (8);
			n = new JTextField (10);
			o = new JTextField (11);
			p = new JTextField (11);
			q = new JTextField (9);
			r = new JTextField (8);
			
			cabecalho.setBounds(5,5,600,50);
			cadastrar.setBounds(950,400,200,50);
			pf.setBounds(200,60,120,20);
			pj.setBounds(500,60,120,20);
			a.setBounds(200,90,350,20);
			b.setBounds(200,120,200,20);
			c.setBounds(200,150,200,20);
			d.setBounds(200,180,60,20);
			e.setBounds(200,210,100,20);
			f.setBounds(200,240,120,20);
			g.setBounds(200,270,100,20);
			h.setBounds(200,300,200,20);
			i.setBounds(200,330,500,200);
			j.setBounds(900,60,350,20);
			k.setBounds(900,90,100,20);
			l.setBounds(900,120,200,20);
			m.setBounds(900,150,180,20);
			n.setBounds(900,180,150,20);
			o.setBounds(900,210,150,20);
			p.setBounds(900,240,190,20);
			q.setBounds(900,270,150,20);
			r.setBounds(900,300,180,20);
			status.setBounds(150,60,300,20);
			nome.setBounds(162,90,300,20);
			bairro.setBounds(150,120,300,20);
			cidade.setBounds(150,150,300,20);
			estado.setBounds(150,180,300,20);
			phonecom.setBounds(65,210,300,20);
			cnpj.setBounds(160,240,300,20);
			inscest.setBounds(78,270,300,20);
			email.setBounds(155,300,300,20);
			observacao.setBounds(128,400,300,20);
			rua.setBounds(865,60,300,20);
			numero.setBounds(848,90,300,20);
			compl.setBounds(818,120,300,20);
			cep.setBounds(865,150,300,20);
			resphone.setBounds(765,180,300,20);
			cellphone.setBounds(790,210,300,20);
			cpf.setBounds(867,240,300,20);
			rg.setBounds(872,270,300,20);
			datanasc.setBounds(778,300,300,20);
			
			cabecalho.setForeground(Color.green);
			
			cabecalho.setFont(new Font("Courier New", Font.BOLD,22));
			status.setFont(new Font("Courier New", Font.BOLD,10));
			nome.setFont(new Font("Courier New", Font.BOLD,10));
			bairro.setFont(new Font("Courier New", Font.BOLD,10));
			cidade.setFont(new Font("Courier New", Font.BOLD,10));
			estado.setFont(new Font("Courier New", Font.BOLD,10));
			phonecom.setFont(new Font("Courier New", Font.BOLD,10));
			cnpj.setFont(new Font("Courier New", Font.BOLD,10));
			inscest.setFont(new Font("Courier New", Font.BOLD,10));
			email.setFont(new Font("Courier New", Font.BOLD,10));
			observacao.setFont(new Font("Courier New", Font.BOLD,10));
			rua.setFont(new Font("Courier New", Font.BOLD,10));
			numero.setFont(new Font("Courier New", Font.BOLD,10));
			compl.setFont(new Font("Courier New", Font.BOLD,10));
			cep.setFont(new Font("Courier New", Font.BOLD,10));
			resphone.setFont(new Font("Courier New", Font.BOLD,10));
			cellphone.setFont(new Font("Courier New", Font.BOLD,10));
			cpf.setFont(new Font("Courier New", Font.BOLD,10));
			rg.setFont(new Font("Courier New", Font.BOLD,10));
			datanasc.setFont(new Font("Courier New", Font.BOLD,10));
			
			grupo = new ButtonGroup();
			grupo.add(pf);
			grupo.add(pj);
			
			tela.add(cabecalho);
			tela.add(pf);
			tela.add(pj);
			tela.add(cadastrar);
			tela.add(a);
			tela.add(b);
			tela.add(c);
			tela.add(d);
			tela.add(e);
			tela.add(f);
			tela.add(g);
			tela.add(h);
			tela.add(i);
			tela.add(j);
			tela.add(k);
			tela.add(l);
			tela.add(m);
			tela.add(n);
			tela.add(o);
			tela.add(p);
			tela.add(q);
			tela.add(r);
			tela.add(status);
			tela.add(nome);
			tela.add(bairro);
			tela.add(cidade);
			tela.add(estado);
			tela.add(phonecom);
			tela.add(cnpj);
			tela.add(inscest);
			tela.add(email);
			tela.add(observacao);
			tela.add(rua);
			tela.add(numero);
			tela.add(compl);
			tela.add(cep);
			tela.add(resphone);
			tela.add(cellphone);
			tela.add(cpf);
			tela.add(rg);
			tela.add(datanasc);
			setSize(1300,600);
			setVisible(true);
			setLocationRelativeTo(null);
	
}

public static void main(String args[]) {
		CadastroCliente app = new CadastroCliente();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
