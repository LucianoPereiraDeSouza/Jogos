package jogo;

//certificar que a visão ficara enquadrada no jogador
public class Camera {
	
	private int x, y;
	private Manipulador manipulador;
	private ObjetosJogo tempPlayer = null;
	
	public Camera(int x, int y, Manipulador manipulador) {
		this.x = x;
		this.y = y;
		this.manipulador = manipulador;
		
		encontrarjogador();
	}
	
	public void encontrarjogador() {
		for(int i = 0; i < manipulador.object.size(); i++) {
			if(manipulador.object.get(i).getId() == ID.Jogador) {
				tempPlayer = manipulador.object.get(i);
				break;
			}
		}
	}
	
	public void tick() {
		if(tempPlayer != null) {
			x = (int) tempPlayer.x - Jogo.largura/2;
			y = (int) tempPlayer.y - Jogo.altura/2;
		} else encontrarjogador();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
