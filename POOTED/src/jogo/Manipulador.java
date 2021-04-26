package jogo;

import java.awt.Graphics;
import java.util.LinkedList;

//Estará no comando de rodar e atualizar cada objeto do jogo
public class Manipulador {

	public LinkedList<ObjetosJogo> object = new LinkedList<ObjetosJogo>();
	
	public Manipulador() {
		
	}
	
	//roda tudo
	public void tick(ObjetosJogo tempObjeto) {
		for(int i = 0; i < object.size(); i++) {
			object.get(i).tick();
			tempObjeto.tick();
		}
	}
	
	//renderiza tudo
	public void render(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			object.get(i).render(g);
		}
	}
	
	//adiciona tudo
	public ObjetosJogo addObjeto(ObjetosJogo tempObjeto) {
		object.add(tempObjeto);
		return tempObjeto;
	}
	
	//remove tudo
	public ObjetosJogo removeObjeto(ObjetosJogo tempObjeto) {
		object.remove(tempObjeto);
		return tempObjeto;
	}
	
}
