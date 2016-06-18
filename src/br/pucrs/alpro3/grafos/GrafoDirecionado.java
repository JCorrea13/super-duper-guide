package br.pucrs.alpro3.grafos;

public class GrafoDirecionado extends Grafo {

	
	public GrafoDirecionado(int tamanho) {
		super(tamanho);
	}

	public GrafoDirecionado(String nomeDoArquivo) throws Exception {
		super(nomeDoArquivo);
	}
	
	
	public void floydWarshall() {
		// TODO: completar
	}

	public int djikstra(int origem, int destino) {
		int d[] = new int[dados.length];
		// TODO Auto-generated method stub
		return d[destino];
	}
	
	
}
