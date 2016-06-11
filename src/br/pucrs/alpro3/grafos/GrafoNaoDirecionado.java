package br.pucrs.alpro3.grafos;

public class GrafoNaoDirecionado extends Grafo {

	public GrafoNaoDirecionado(int tamanho) {
		super(tamanho);
	}
	
	public GrafoNaoDirecionado(String nomeDoArquivo) throws Exception {
		super(nomeDoArquivo);
	}

	public void addAresta(int origem, int destino) {
		checkOrigem(origem);
		checkDestino(destino);
		dados[origem][destino] = 1;
		dados[destino][origem] = 1;
	}

	public void addAresta(int origem, int destino, int peso) {
		checkOrigem(origem);
		checkDestino(destino);
		dados[origem][destino] = peso;
		dados[destino][origem] = peso;
	}	
	
	/**
	 * Kruskal
	 * @return
	 */
	public int mst() {
		return 0;
	}	
	
}
