package br.pucrs.alpro3.grafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	 * Kruskal MST-KRUSAL( G,w )
	 * 
	 * @return
	 */

	class Aresta implements Comparable<Aresta> {
		public Aresta(int u, int v, int p) {
			origem = u;
			destino = v;
			peso = p;
		}

		public int origem;
		public int destino;
		public int peso;

		@Override
		public int compareTo(Aresta o) {
			Integer peso1 = new Integer(peso);
			Integer peso2 = new Integer(o.peso);
			return peso1.compareTo(peso2);
		}

		@Override
		public String toString() {
			return String.format("Aresta [origem=%s, destino=%s, peso=%s]", origem, destino, peso);
		}

	}

	public int mstKruskal() {
		// 1. A <- VAZIO
		List<Aresta> A = new ArrayList<>();
		int u, v;
		// 2. para cada vertice v de G faça
		List<Set<Integer>> ss = new ArrayList<>();
		for (v = 0; v < dados.length; v++) {
			// 3. MAKE-SET(v)
			Set<Integer> s = new HashSet<>();
			s.add(v);
			ss.add(s);
		}
		// 4. ordena as arestas de E por peso w crescente
		List<Aresta> E = new ArrayList<>();
		// preencher com todas as arestas do grafo...
		for (int i = 0; i < dados.length; i++) {
			for (int j = i; j < dados.length; j++) {
				if (dados[i][j] != 0) {
					E.add(new Aresta(i, j, dados[i][j]));
				}
			}
		}
		// ordenar arestas por peso...
		Collections.sort(E);
//		System.out.println(A);
//		System.out.println(E);
//		System.out.println(ss);
		
		// 5. para cada aresta ( u,v ) de E em ordem de peso crescente faça
		for (int i = 0; i < E.size(); i++) {
			Aresta a = E.get(i);
			u = a.origem;
			v = a.destino;
			// 6. se FIND-SET(u) ≠ FIND-SET(v) então
			Set<Integer> su = findSet(ss, u);
			Set<Integer> sv = findSet(ss, v);
			if ( su != sv) {
				// 7. A <- A U {( u,v )}
				//A.add(new Aresta(u, v, dados[u][v]));
				A.add(a);
				// 8. UNION( u,v )
				ss.remove(su);
				sv.addAll(su);
			}
		}
		
		//
		if (ss.size() != 1) {
			throw new IllegalArgumentException("Nao foi possivel conectar todos os nodos!");
		}
		
		// 9. retorna A
		int s = 0;
		for (Aresta aresta : A) {
			s += aresta.peso;
		}
		return s;
	}

	private Set<Integer> findSet(List<Set<Integer>> ss, int u) {
		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i).contains(u)) {
				return ss.get(i);
			}
		}
		return null;
	}

}
