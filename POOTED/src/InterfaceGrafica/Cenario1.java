package InterfaceGrafica;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cenario1 extends JFrame {

	// Polimorfismo
	// Equals
	// Getters e Setters
	// List<>
	// Enumeração
	// Interface
	// Classes abstratas 
	// Domains, Business, Persistence, TUI
	
	JLabel cenario = new JLabel(new ImageIcon(getClass().getResource("ground.png")));

	JLabel gramado1 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado2 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado3 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado4 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado5 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado6 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado7 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado8 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado9 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado10 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado11 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado12 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado13 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado14 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado15 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado16 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado17 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado18 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado19 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));
	JLabel gramado20 = new JLabel(new ImageIcon(getClass().getResource("gramado.jpg")));

	JLabel arbusto1 = new JLabel(new ImageIcon(getClass().getResource("arbusto.png")));
	JLabel arbusto2 = new JLabel(new ImageIcon(getClass().getResource("arbusto.png")));
	JLabel arbusto3 = new JLabel(new ImageIcon(getClass().getResource("arbusto.png")));

	ImageIcon galinhaCostas = new ImageIcon(getClass().getResource("galinhaCostas1.png"));
	ImageIcon galinhaCostasGif = new ImageIcon(getClass().getResource("andandoCostas.gif"));
	JLabel lGalinhaCostasI = new JLabel(galinhaCostas);

	ImageIcon galinhaFrente = new ImageIcon(getClass().getResource("galinhaFrente1.png"));
	ImageIcon galinhaFrenteGif = new ImageIcon(getClass().getResource("andandoFrente.gif"));
	JLabel lGalinhaFrenteI = new JLabel(galinhaFrente);

	ImageIcon galinhaEsquerda = new ImageIcon(getClass().getResource("galinhaEsquerda1.png"));
	ImageIcon galinhaEsquerdaGif = new ImageIcon(getClass().getResource("andandoEsquerda.gif"));
	JLabel lGalinhaEsquerdaI = new JLabel(galinhaEsquerda);

	ImageIcon galinhaDireita = new ImageIcon(getClass().getResource("galinhaDireita1.png"));
	ImageIcon galinhaDireitaGif = new ImageIcon(getClass().getResource("andandoDireita.gif"));
	JLabel lGalinhaDireitaI = new JLabel(galinhaDireita);

	int posGalinhaX = 300;
	int posGalinhaY = 300;

	public Cenario1() {
		editarJanela();
		editarComponentes();
		addMovimentos();
	}

	public void editarJanela() {
		setTitle("Game");
		setSize(1000, 840);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		add(arbusto1);
		add(arbusto2);
		add(arbusto3);
		add(lGalinhaCostasI);

		add(gramado1);
		add(gramado2);
		add(gramado3);
		add(gramado4);
		add(gramado5);
		add(gramado6);
		add(gramado7);
		add(gramado8);
		add(gramado9);
		add(gramado10);
		add(gramado11);
		add(gramado12);
		add(gramado13);
		add(gramado14);
		add(gramado15);
		add(gramado16);
		add(gramado17);
		add(gramado18);
		add(gramado19);
		add(gramado20);

		add(cenario);
	}

	public void editarComponentes() {
		lGalinhaCostasI.setBounds(300, 300, 32, 31);
		lGalinhaFrenteI.setBounds(300, 300, 32, 31);
		lGalinhaDireitaI.setBounds(300, 300, 32, 31);
		lGalinhaEsquerdaI.setBounds(300, 300, 32, 31);

		arbusto1.setBounds(200, 200, 32, 32);
		arbusto2.setBounds(200, 168, 32, 32);
		arbusto3.setBounds(232, 168, 32, 32);

		gramado1.setBounds(0, 0, 225, 225);
		gramado2.setBounds(0, 225, 225, 225);
		gramado3.setBounds(0, 450, 225, 225);
		gramado4.setBounds(0, 675, 225, 225);

		gramado5.setBounds(225, 0, 225, 225);
		gramado6.setBounds(450, 0, 225, 225);
		gramado7.setBounds(675, 0, 225, 225);
		gramado8.setBounds(900, 0, 225, 225);

		gramado9.setBounds(225, 225, 225, 225);
		gramado10.setBounds(225, 450, 225, 225);
		gramado11.setBounds(225, 675, 225, 225);

		gramado12.setBounds(450, 225, 225, 225);
		gramado13.setBounds(450, 450, 225, 225);
		gramado14.setBounds(450, 675, 225, 225);

		gramado15.setBounds(675, 225, 225, 225);
		gramado16.setBounds(675, 450, 225, 225);
		gramado17.setBounds(675, 675, 225, 225);

		gramado18.setBounds(900, 225, 225, 225);
		gramado19.setBounds(900, 450, 225, 225);
		gramado20.setBounds(900, 675, 225, 225);
	}

	public void addMovimentos() {
		addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
				lGalinhaCostasI.setIcon(galinhaCostas);
			}

			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
//				if((lGalinhaCostasI.getY() > 0 && lGalinhaCostasI.getY() < 840) || (lGalinhaCostasI.getX() > 0 && lGalinhaCostasI.getX() < 1000 )) {
				if (codigo == KeyEvent.VK_UP) {
					lGalinhaCostasI.setIcon(galinhaCostasGif);
					posGalinhaY -= 10;
				}

				if (codigo == KeyEvent.VK_DOWN) {
					lGalinhaCostasI.setIcon(galinhaFrenteGif);
					posGalinhaY += 10;
				}

				if (codigo == KeyEvent.VK_LEFT) {
					lGalinhaCostasI.setIcon(galinhaEsquerdaGif);
					posGalinhaX -= 10;
				}

				if (codigo == KeyEvent.VK_RIGHT) {
					lGalinhaCostasI.setIcon(galinhaDireitaGif);
					posGalinhaX += 10;
				}
				lGalinhaCostasI.setBounds(posGalinhaX, posGalinhaY, 32, 31);
//				if(bateu(lGalinhaDireitaI, arbusto1)) {
//					JOptionPane.showMessageDialog(null, "BATEU!");
//					System.exit(0);
//				}
			}
//			}
		});
	}
	
//	public boolean bateu(Component a, Component b) {
//		int aX = a.getX();
//		int aY = a.getY();
//		int ladoDireitoA = aX+a.getWidth();
//		int ladoEsquerdoA = aX;
//		int ladoBaixoA = aY+a.getHeight();
//		int ladoCimaA = aY;
//
//		int bX = b.getX();
//		int bY = b.getY();
//		int ladoDireitoB = bX+b.getWidth();
//		int ladoEsquerdoB = bX;
//		int ladoBaixoB = bY+b.getHeight();
//		int ladoCimaB = bY;
//
//		boolean bateu = false;
//
//		boolean cDireita = false;
//		boolean cCima = false;
//		boolean cBaixo = false;
//		boolean cEsquerda = false;
//
//		if(ladoDireitoA>=ladoEsquerdoB) {
//			cDireita = true;
//		}
//		if(ladoCimaA<=ladoBaixoB) {
//			cCima = true;
//		}
//		if(ladoBaixoA>=ladoCimaB) {
//			cBaixo = true;
//		}
//		if(ladoEsquerdoA<=ladoDireitoB) {
//			cEsquerda = true;
//		}
//		if(cDireita && cEsquerda && cBaixo && cCima) {
//			bateu = true;
//		}
//		return bateu;
//	}
	
	public Rectangle getBounds() {
		//FIXME
		int largura = 0;
		int altura = 0;
		return new Rectangle(getX(), getY(), largura, altura);
	}
}
