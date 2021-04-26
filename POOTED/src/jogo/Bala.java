package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends ObjetosJogo {

	public Bala(float x, float y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect((int)x,(int) y, 8, 8);
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}

}
