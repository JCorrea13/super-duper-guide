package br.pucrs.alpro3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class ArvoreAVL {

	private static class Nodo {
		int chave;
		Nodo direito;
		Nodo esquerdo;
		int altura;

		Nodo(int chave) {
			this.chave = chave;
		}
	}

	private Nodo raiz;
	private int contador;

	/**
	 * 
	 * @param chave
	 * @return
	 */
	public boolean contem(int chave) {
		return contem0(raiz, chave);
	}

	private boolean contem0(Nodo nodo, int chave) {
		if (nodo == null) {
			return false;
		}
		if (nodo.chave < chave)
			return contem0(nodo.direito, chave);
		else if (nodo.chave > chave)
			return contem0(nodo.esquerdo, chave);
		else
			return true;
	}

	/**
	 * Deve gerar exce��o no caso de chave duplicada.
	 * 
	 * @param chave
	 */
	public void inserir(int chave) {
		raiz = inserir0(raiz, chave);
	}

	private Nodo inserir0(Nodo nodo, int chave) {
		if (nodo == null) {
			contador++;
			return new Nodo(chave);
		}
		if (nodo.chave < chave)
			nodo.direito = inserir0(nodo.direito, chave);
		else if (nodo.chave > chave)
			nodo.esquerdo = inserir0(nodo.esquerdo, chave);
		else
			throw new IllegalArgumentException("chave duplicada");
		
		nodo.altura = 1 + Math.max(h(nodo.direito), h(nodo.esquerdo));
		
		return nodo;
	}

	private static int h(Nodo nodo) {
		if (nodo == null)
			return -1;
		return nodo.altura;
	}

	public String dump() {
		List<String> chaves = new ArrayList<>();
		dump0(raiz, chaves);
		return chaves.toString();
	}

	private void dump0(Nodo nodo, List<String> chaves) {
		if (nodo == null)
			return;
		dump0(nodo.esquerdo, chaves);
		chaves.add(String.format("{%d : %d}", nodo.chave, nodo.altura));
		dump0(nodo.direito, chaves);
	}	
	
	@Override
	public String toString() {
		List<Integer> chaves = new ArrayList<>();
		toString0(raiz, chaves);
		return chaves.toString();
	}

	private void toString0(Nodo nodo, List<Integer> chaves) {
		if (nodo == null)
			return;
		toString0(nodo.esquerdo, chaves);
		chaves.add(nodo.chave);
		toString0(nodo.direito, chaves);
	}

	/**
	 * 
	 * @return
	 */
	public int tamanho() {
		return contador;
	}

	/**
	 * 
	 * @return
	 */
	public int altura() {
		return altura0(raiz);
	}

	private int altura0(Nodo nodo) {
		if (nodo == null)
			return -1;
		return 1 + Math.max(altura0(nodo.esquerdo), altura0(nodo.direito));
	}

	public List<Integer> caminho(int chave) {
		List<Integer> resposta = new ArrayList<>();
		caminho0(raiz, chave, resposta);
		return resposta;
	}

	private void caminho0(Nodo nodo, int chave, List<Integer> resposta) {
		if (nodo == null) {
			resposta.clear();
			return;
		}
		resposta.add(nodo.chave);
		if (nodo.chave < chave)
			caminho0(nodo.direito, chave, resposta);
		else if (nodo.chave > chave)
			caminho0(nodo.esquerdo, chave, resposta);
	}

	public List<Integer> folhas() {
		List<Integer> resposta = new ArrayList<>();
		folhas0(raiz, resposta);
		return resposta;
	}

	private void folhas0(Nodo nodo, List<Integer> resposta) {
		if (nodo != null) {
			if (nodo.direito == null && nodo.esquerdo == null) {
				resposta.add(nodo.chave);
				return;
			}
			folhas0(nodo.esquerdo, resposta);
			folhas0(nodo.direito, resposta);
		}
	}

}
