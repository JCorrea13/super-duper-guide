package br.pucrs.alpro3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArvoreAVLTest {

	ArvoreAVL a;
	
	@Before
	public void setup()
	{
		 a = new ArvoreAVL();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testChaveDuplicada() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		a.inserir(30);
	}

	@Test
	public void testArvoreVazia() {
		String expected = "[]";
		String actual = a.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testArvoreCom10() {
		a.inserir(10);
		String expected = "[10]";
		String actual = a.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testArvoreCom30E10E20() {
		a.inserir(30);
		a.inserir(10);
		a.inserir(20);
		String expected = "[10, 20, 30]";
		String actual = a.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testArvoreCom20E10E30() {
		a.inserir(20);
		a.inserir(10);
		a.inserir(30);
		String expected = "[10, 20, 30]";
		String actual = a.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testArvoreComTamanhoZero() {
		int expected = 0;
		int actual = a.tamanho();
		assertEquals(expected, actual);
	}

	@Test
	public void testArvoreComTamanhoUm() {
		a.inserir(10);
		int expected = 1;
		int actual = a.tamanho();
		assertEquals(expected, actual);
	}

	@Test
	public void testCaminhoAte10() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		List<Integer> expected = new ArrayList<>();
		expected.add(20);
		expected.add(10);
		List<Integer> actual = a.caminho(10);
		assertEquals(expected, actual);
	}

	@Test
	public void testCaminhoAte20() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		 List<Integer> expected = new ArrayList<>();
		 expected.add(20);
		List<Integer> actual = a.caminho(20);
		assertEquals(expected, actual);
	}

	@Test
	public void testCaminhoAte30() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		List<Integer> expected = new ArrayList<>();
		expected.add(20);
		expected.add(30);
		List<Integer> actual = a.caminho(30);
		assertEquals(expected, actual);
	}

	@Test
	public void testCaminhoAte5() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = a.caminho(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testCaminhoAte40() {
		a.inserir(10);
		a.inserir(30);
		a.inserir(20);
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = a.caminho(40);
		assertEquals(expected, actual);
	}

	@Test
	public void testFolhasArvoreVazia() {
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = a.folhas();
		assertEquals(expected, actual);
	}

}
