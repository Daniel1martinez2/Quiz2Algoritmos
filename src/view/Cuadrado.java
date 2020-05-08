package view;

import processing.core.PApplet;

public class Cuadrado  implements Runnable  {
	int posx,posy,tam, r, g,b, valor,diry; 
	PApplet app; 
	boolean estoy; 

	public Cuadrado(PApplet app, int posx, int posy, int valor) {
		this.app= app; 
		this.posx= posx; 
		this.posy = posy; 
		tam= 20; 
		r = 255; 
		g= 255; 
		b= 255; 
		this.valor=valor; 
		diry= 1; 
		estoy = false; 
		
		
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void pintar() {
		app.fill(r,g,b);
		app.rect(posx, posy, 20, 20);
	}

	
	public void run() {
		try {
			Thread.sleep(50000);
			mover(); 
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
	public void mover() {
		posy--; 
		
		
		
		
		
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	
	
	
	

}
