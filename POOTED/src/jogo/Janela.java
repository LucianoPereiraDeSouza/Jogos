package jogo;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Janela {
	public Janela(int largura, int altura, String titulo, Jogo jogo) {
		JFrame frame = new JFrame(titulo);
		frame.setPreferredSize(new Dimension(largura, altura));
		frame.setMinimumSize(new Dimension(largura, altura));
		frame.setMaximumSize(new Dimension(largura, altura));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		frame.add(jogo);
		

	}

}
