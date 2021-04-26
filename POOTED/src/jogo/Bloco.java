package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bloco extends ObjetosJogo {
	
	public Bloco(float x, float y, ID id) {
		super(x, y, id);
		float w = 200;
		h = 200;
	}
	



	@Override
	public void tick() {
		
	}


	@Override
	public void render(Graphics g) {
		
		Graphics g2d = (Graphics2D) g;
		
		g2d.setColor(Color.red);
		((Graphics2D) g2d).draw(getBounds());
	}
	
	public Rectangle getBounds() {
		return new Rectangle ((int) x, (int) y, (int) w, (int) h);
	}

}
