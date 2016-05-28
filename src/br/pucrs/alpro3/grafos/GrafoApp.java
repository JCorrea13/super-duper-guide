package br.pucrs.alpro3.grafos;

public class GrafoApp {

	public static void main(String[] args) {
		System.out.println("Grafos");
		
		Grafo g = new Grafo(5);
		
		g.addAresta(0, 4);
		g.addAresta(4, 0);
		
		System.out.println(g);
		
		
	}
}
