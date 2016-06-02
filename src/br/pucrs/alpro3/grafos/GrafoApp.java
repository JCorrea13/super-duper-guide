package br.pucrs.alpro3.grafos;

public class GrafoApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Grafos");
		
		Grafo g = new Grafo("g5.txt");
	
		System.out.println(g);
		
		System.out.println(g.percursoLargura(0));
		
		
	}
}
