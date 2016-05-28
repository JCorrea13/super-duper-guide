package br.pucrs.alpro3.grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

	public Grafo(String nomeDoArquivo) throws Exception {
		int tamanho;
		String aresta[];
		String linha;
		try(BufferedReader bf = new BufferedReader(new FileReader(new File(nomeDoArquivo)))) {
			tamanho = Integer.parseInt(bf.readLine());
			dados = new int[tamanho][tamanho];

			while ((linha = bf.readLine()) != null) {
				aresta = linha.split(" ");
				addAresta(Integer.parseInt(aresta[0]), Integer.parseInt(aresta[1]));
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public void addAresta(int origem, int destino) {
		dados[origem][destino] = 1;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < dados.length; i++) {
			for (int j = 0; j < dados.length; j++) {
				s += String.format("%d ", dados[i][j]);
			}
			s += '\n';
		}
		return s;
	}

}
