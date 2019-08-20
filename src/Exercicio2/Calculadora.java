package Exercicio2;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame{
	
	JLabel cabecalho;
	JTextField visor;
	JButton a,b,c,d,e,f,g,h,i,j,soma,sub,mult,div,doc,clear,space,res;
	
	public Calculadora() {
	super("By Carlos Coelho");
		Container tela = getContentPane();
		setLayout(null);
			cabecalho = new JLabel("Calculadora");
			visor = new JTextField(12);
			space = new JButton("Backspace");
			clear = new JButton("ce");
			a = new JButton("7");
			b = new JButton("8");
			c = new JButton("9");
			d = new JButton("4");
			e = new JButton("5");
			f = new JButton("6");
			g = new JButton("1");
			h = new JButton("2");
			i = new JButton("3");
			j = new JButton("0");
			doc = new JButton(".");
			res = new JButton("=");
			div = new JButton("/");
			mult = new JButton("*");
			sub = new JButton("-");
			soma = new JButton("+");
			
			cabecalho.setBounds(5,5,600,50);
			visor.setBounds(20,60,560,50);
			space.setBounds(20,120,270,65);
			clear.setBounds(310,120,270,65);
			a.setBounds(20,190,125,65);
			b.setBounds(165,190,125,65);
			c.setBounds(310,190,125,65);
			d.setBounds(20,260,125,65);
			e.setBounds(165,260,125,65);
			f.setBounds(310,260,125,65);
			g.setBounds(20,330,125,65);
			h.setBounds(165,330,125,65);
			i.setBounds(310,330,125,65);
			j.setBounds(20,400,125,65);
			doc.setBounds(165,400,125,65);
			res.setBounds(310,400,125,65);
			div.setBounds(455,190,125,65);
			mult.setBounds(455,260,125,65);
			sub.setBounds(455,330,125,65);
			soma.setBounds(455,400,125,65);
			
			cabecalho.setForeground(Color.black);
			space.setForeground(Color.red);
			clear.setForeground(Color.red);
			a.setForeground(Color.blue);
			b.setForeground(Color.blue);
			c.setForeground(Color.blue);
			d.setForeground(Color.blue);
			e.setForeground(Color.blue);
			f.setForeground(Color.blue);
			g.setForeground(Color.blue);
			h.setForeground(Color.blue);
			i.setForeground(Color.blue);
			j.setForeground(Color.blue);
			doc.setForeground(Color.red);
			res.setForeground(Color.red);
			div.setForeground(Color.red);
			mult.setForeground(Color.red);
			sub.setForeground(Color.red);
			soma.setForeground(Color.red);
			
			tela.add(cabecalho);
			tela.add(visor);
			tela.add(space);
			tela.add(clear);
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
			tela.add(soma);
			tela.add(sub);
			tela.add(mult);
			tela.add(div);
			tela.add(doc);
			tela.add(res);
			setSize(600,600);
			setVisible(true);
			setLocationRelativeTo(null);
	
}

public static void main(String args[]) {
		Calculadora app = new Calculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
