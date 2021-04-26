package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Jogador extends ObjetosJogo {
	
	//para aceletar e desacelerar
	private float _acc = 1f;
	private float _dcc = 0.5f;
	
	private KeyImput imput;
	private Manipulador manipulador;

	public Jogador(float x, float y, ID id, KeyImput imput, Manipulador manipulador) {
		super(x,y,id);
		this.imput = imput;
		this.manipulador = manipulador;
		
		velX = 1;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		//Movimento horizontal
		// teclado 0 = true direita
		// teclado 1 = true esquerda
		if(imput.keys[0]) velY += _acc;
		else if (imput.keys[2]) velY -= _acc;
		else if (!imput.keys[0] && !imput.keys[2]) {
			
			if(velY > 0) velY -= _dcc;
			else if(velY < 0) velY += _dcc;
		}
		
		//Movimento vertical
		// teclado 2 = true cima
		// teclado 3 = true baixo
				if(imput.keys[1]) velX += _acc;
				else if (imput.keys[3]) velX -= _acc;
				else if (!imput.keys[1] && !imput.keys[3]) {
					
					if(velX > 0) velX -= _dcc;
					else if(velX < 0) velX += _dcc;
				}
				
		velX = clamp(velX, -5, 5);
		velY = clamp(velY, -5, 5);
		
		Collision();
				
  	}
	
	private void Collision() {
		
		for(int i = 0; i < manipulador.object.size(); i++) {
			ObjetosJogo tempObjeto = manipulador.object.get(i);
			if(tempObjeto.getId() == ID.Bloco) {
				
				if(getBounds().intersects(tempObjeto.getBounds())) {
				
				if(tempObjeto.getVelX() < 0)  // bloco vai para esquerda{
					if(x < tempObjeto.getX() + tempObjeto.getW()/2) x = tempObjeto.getX() - 32;
				} else if (tempObjeto.getVelY() > 0) { // bloco vai para direitaa{
					if(x < tempObjeto.getX() + tempObjeto.getW()/2) x = tempObjeto.getX() + tempObjeto.getW();
				}
				
				if(velX > 0) { //Direita
					velX = 0;
					x = tempObjeto.getX() - 32;
					
				} else if(velX < 0) { // esquerda
					velX = 0;
					x = tempObjeto.getX() + tempObjeto.getW();
					
				}
				
			}
			
			if(getBounds2().intersects(tempObjeto.getBounds())) {

				if(tempObjeto.getVelY() < 0)  // bloco vai para esquerda{
					if(y < tempObjeto.getY() + tempObjeto.getH()/2) y = tempObjeto.getY() - 32;
				} else if (tempObjeto.getVelY() > 0) { // bloco vai para direitaa{
					if(y < tempObjeto.getY() + tempObjeto.getH()/2) y = tempObjeto.getY() + tempObjeto.getH();
				}
				
			if(velY > 0) { // Baixo
				velY = 0;
				y = tempObjeto.getY() - 32;
				
			} else if(velY < 0) { // cima
				velY = 0;
				y = tempObjeto.getY() + tempObjeto.getH();
				
			}
			
		}
		
	}
	
	
	public Rectangle getBounds() {//Colisão horizontal
		
		float bx = x + velX ;
		float by = y + 2 ;
		float bw = 32  + velX/2;
		float bh = 28 ;
		
		return new Rectangle((int)bx, (int)by, (int)bw, (int)bh);
	}
	
	public Rectangle getBounds2() {//Colisão vertical
		float bx = x + 2;
		float by = y + velY  ;
		float bw = 28 ;
		float bh = 32 + velY/2;
		
		return new Rectangle((int)bx, (int)by, (int)bw, (int)bh);
	}
	
	@Override
	public void render(Graphics g) {
		
		Graphics g2d = (Graphics2D) g;
		
		g2d.setColor(Color.red);
		((Graphics2D) g2d).fill(getBounds());
		
		g2d.setColor(Color.red);
		((Graphics2D) g2d).fill(getBounds2());
				
		g.setColor(Color.white);
		g.fillRect((int) x,(int) y, 32, 32);
	}
	
	private float clamp(float valor, float max, float min) {
		if(valor >= max) valor = max;
		else if(valor <= min) valor = min;
		
		return valor;
	}

}
