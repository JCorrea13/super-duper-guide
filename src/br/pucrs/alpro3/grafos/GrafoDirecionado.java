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

		/**
		 * Entrada: grafo rotulado G com valores numéricos não-negativos e um
		 * vértice v qualquer de G 
		 * Saída: vetor D com os valores das distâncias do menor caminho do vértice v para qualquer outro vértice u de G
		 * 
		 * Dijkstra(G, v) { 
		 *   Inicializa D[v] = 0 e, para todo u != v, D[u] = +infinito 
		 *   Inicializa a fila prioritária Q com todos os vértices u de
		 *   G usando os valores em D como chave 
		 * 
		 *   ENQUANTO Q não-vazia FAÇA { 
		 * 	   u = Q.removeMin(); //remove o vértice com a menor chave
		 * 
		 *     PARA CADA vértice z adjacente à u tal que z está em Q FAÇA { 
		 *        SE ((D[u] + valor(u, z)) < D[z]) ENTÃO { 
		 *           D[z] = D[u] + valor(u, z)
		 *           Atualiza a chave do vértice z em Q com o novo valor de D[z] 
		 *     }
		 *   } 
		 * }
		 *   RETORNA o vetor D 
		 * }
		 */

		return d[destino];
	}

}
