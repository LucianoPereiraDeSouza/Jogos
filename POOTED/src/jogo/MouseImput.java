package jogo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseImput extends MouseAdapter{
	
	private Manipulador manipulador;
	private Camera cam;
	private ObjetosJogo tempPlayer = null;
	
	public MouseImput(Manipulador manipulador, Camera cam) {
		this.manipulador = manipulador;
		this.cam = cam;
	}
	
	public void encontrarjogador() {
		for(int i = 0; i < manipulador.object.size(); i++) {
			if(manipulador.object.get(i).getId() == ID.Jogador) {
				tempPlayer = manipulador.object.get	(i);
				break;
			}
		}
	}
	
	public void pressionarMouse(MouseEvent e) {
		
		int mx = e.getX();
		int my = e.getY();
		
		
		if(tempPlayer != null) {
			ObjetosJogo tempBala = new Bala(tempPlayer.x + 16, tempPlayer.y + 16, ID.Bala);
			manipulador.addObjeto(tempBala);
			float angulo = (float) Math.atan2(my - tempPlayer.y-16+cam.getY(), mx - tempPlayer.x-16+cam.getX());
			int balaVel = 10;
			
			tempBala.velX = (float) ((balaVel) * Math.cos(angulo));
			tempBala.velY = (float) ((balaVel) * Math.sin(angulo));
			

			
		} else encontrarjogador();
	}
	

}
