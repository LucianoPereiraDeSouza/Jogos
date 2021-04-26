package jogo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Jogo extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	public static int largura = 640, altura = 480;
	public String titulo = "Revolta das Galinhas";

	private Thread thread;
	private boolean isRunning = false;
	
	//Instancia
	private Manipulador manipulador;
	private KeyImput imput;
	private MouseImput mimput;
	private Camera cam;
	
	// Construtor
	public Jogo() {
		new Janela(largura, altura, titulo, this);
		iniciar();
		init();
		
		
	}
	
	public void init() {
		manipulador = new Manipulador();
		imput = new KeyImput();
		cam = new Camera(0, 0, manipulador);
		mimput = new MouseImput(manipulador, cam);
		this.addKeyListener(imput);	
		this.addMouseListener(mimput);
		cam = new Camera(0, 0, manipulador);
		
		manipulador.addObjeto(new Jogador(100, 100, ID.Jogador, imput, manipulador));
		
		manipulador.addObjeto(new Caixa(100, 100, ID.Bloco));
		manipulador.addObjeto(new Caixa(200, 200, ID.Bloco));
		manipulador.addObjeto(new Caixa(300, 300, ID.Bloco));
		manipulador.addObjeto(new Caixa(400, 400, ID.Bloco));
		
		mimput.encontrarjogador();
	}
	
	private synchronized void iniciar() {
		if(isRunning) return;
		
		thread = new Thread(this);
		thread.start();
		isRunning = true;
	}
	
	private synchronized void stop() {
		if(!isRunning) return;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isRunning = false;
	}

	// loop do jogo
	@Override
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while(isRunning){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
					
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
			}
		}

	}
	
	//Atualiza o jogo
	private void tick() {
		//atualiza tudo no jogo
		manipulador.tick(null);
		cam.tick();
		
			
	}
	
	//renderiza o jogo
	private void render() {	
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		//Carnes e ossos do render
		Graphics g = bs.getDrawGraphics();
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.gray);
		g.fillRect(0, 0, largura, altura);
		
		g2d.translate(-cam.getX(), -cam.getY());
		
		manipulador.render(g);
		
		g2d.translate(cam.getX(), cam.getY());
		
		bs.show();
		g.dispose();
	}
	
	

	public static void main(String args[]) {
		new Jogo();
	}

}
