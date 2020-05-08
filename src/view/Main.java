package view;


import processing.core.PApplet;

public class Main extends PApplet{
	Cuadrado[][] cuadrados; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	public void settings() {
		size(800,600); 
		
	

	}

	public void setup() {
		cuadrados= new Cuadrado[30][20]; 
		
		for (int i = 0; i < 30; i++) {
			
			for (int j = 0; j < 20; j++) {
				
				cuadrados[i][j]= new Cuadrado(this, i*20, j*20,0); 
				
				
				
			}
			
		}
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 20; j++) {
				if(i%2==0 && j%2==0) {
				
					cuadrados[i][j].setValor(1);
					
					
					
				}
				if(j%2!=0&&i%2!=0 ) {
				
					cuadrados[i][j].setValor(2);
				}
				
				if(cuadrados[i][j].getValor()==0) {
					cuadrados[i][j].setB(255);
					cuadrados[i][j].setR(255);
					cuadrados[i][j].setG(255);
				}
				if(cuadrados[i][j].getValor()==1) {
					cuadrados[i][j].setB(0);
					cuadrados[i][j].setR(0);
					cuadrados[i][j].setG(0);
					
					
				}	
				if(cuadrados[i][j].getValor()==2) {
					cuadrados[i][j].setB(0);
					cuadrados[i][j].setR(0);
					cuadrados[i][j].setG(0);
				
					
					
				}
			}
		}
	}

	public void draw() {
		background(100); 

		
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 20; j++) {
				
		
				cuadrados[i][j].pintar();
				
				if(cuadrados[i][j].getValor()==2) {
					if(cuadrados[i][j].isEstoy()==false) {
						cuadrados[i][j].mover();
						
					}
					
				}
				
				
			}
			
		}
		
		
	
		
		

	}
	
	public void paila() throws Exception1  {
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 20; j++) {
				int x= cuadrados[i][j].getPosx(); 
				int y = cuadrados[i][j].getPosy(); 
			
				if(dist(mouseX,mouseY,cuadrados[i][j].getPosx(),
						cuadrados[i][j].getPosy())<=5) {
					System.out.println("------------------------");
					
			
					
				}
				
				if(mouseX >x && mouseX<x+20 
						&& mouseY>y&&mouseY<y+20 && cuadrados[i][j].getValor()==2) {
					
					cuadrados[i][j].setR(255);
					cuadrados[i][j].setEstoy(true);
					
					if(cuadrados[i][j].isEstoy()==true) {
						
						throw new Exception1("perdon estoy roto "); 
						
					}
				
					
				}
					
				
				
				
			}
		}
		
		
		
	}
	
	
	public void mousePressed() {

		try {
			paila();
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		
		
	}

}
