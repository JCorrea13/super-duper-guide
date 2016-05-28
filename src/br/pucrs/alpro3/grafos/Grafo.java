package br.pucrs.alpro3.grafos;

/**
 * Grafo direcionado com arestas não valoradas.
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class Grafo {

	private int dados[][];
		
	public Grafo(int tamanho) {
		dados = new int[tamanho][tamanho];
	}
		
	public void addAresta(int origem, int destino) {
		dados[origem][destino] = 1;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < dados.length; i++) {
			for (int j = 0; j < dados.length; j++) {
				s += String.format("%d ",dados[i][j]);
			}
			s += '\n';
		}
		return s;
	}
	
}
