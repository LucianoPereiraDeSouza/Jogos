package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Caixa extends ObjetosJogo{

	public Caixa(float x, float y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, 64, 64);
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}

}
