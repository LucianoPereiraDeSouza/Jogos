package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame implements ActionListener {
	
	//Criar botão//
	JButton jb = new JButton("Mensagem");
	JButton jb2 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
		JOptionPane.showMessageDialog(null, "Carregando");
		} if (e.getSource() == jb2) {
			System.exit(0);
		}
	}
	
	
	public Janela() {
		//Informa que este botão será tratado na própria classe//
		jb.addActionListener(this);
		jb2.addActionListener(this);
		
		//Adicionar botão e suas dimensões//
		setLayout(null);
		jb.setBounds(150, 300, 100, 60);
		jb2.setBounds(300, 300, 100, 60);
		add(jb);
		add(jb2);
		
		//Adicionar janela e suas dimensões//
		JFrame jf = new JFrame();
		setTitle("Titulo da janela");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocale(null);
		setResizable(true);
		
	}
	

	public static void main(String[] args) {
		new Janela(); //Instanciar método//
		
		/*
		 * Janela teste = new Janela(); int soma = teste.somarNumeros(10, 20, 30, 40);
		 * System.out.println(soma);
		 */
	}
}
