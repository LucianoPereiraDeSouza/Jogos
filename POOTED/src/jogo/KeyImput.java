package jogo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyImput extends KeyAdapter {
	
	public boolean keys[] = new boolean[4];
	//abre espaço para registrar quais teclas usaremos
	//para controlar o jogo (esquerda, direita, cima, baixo)
	// teclado 0 = true direita
	// teclado 1 = true esquerda
	// teclado 2 = true cima
	// teclado 3 = true baixo
	public void PressionarTeclado(KeyEvent e) {
		int teclado = e.getKeyCode();
		 if(teclado == KeyEvent.VK_D) { keys[0] = true; }
		 if(teclado == KeyEvent.VK_A) { keys[1] = true; }
		 if(teclado == KeyEvent.VK_W) { keys[2] = true; }
		 if(teclado == KeyEvent.VK_S) { keys[3] = true; }
	}
	
	public void SoltarTeclado(KeyEvent e) {
		int teclado = e.getKeyCode();
		
		 if(teclado == KeyEvent.VK_D) { keys[0] = false; }
		 if(teclado == KeyEvent.VK_A) { keys[1] = false; }
		 if(teclado == KeyEvent.VK_W) { keys[2] = false; }
		 if(teclado == KeyEvent.VK_S) { keys[3] = false; }
	}

}
