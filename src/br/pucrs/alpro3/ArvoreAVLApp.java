package br.pucrs.alpro3;

public class ArvoreAVLApp {

	public static void main(String[] args) {
		ArvoreAVL a = new ArvoreAVL();
		System.out.println(a.dump());
		a.inserir(30);
		System.out.println(a.dump());
		a.inserir(20);
		System.out.println(a.dump());
		a.inserir(10);
		System.out.println(a.dump());

	}
}
