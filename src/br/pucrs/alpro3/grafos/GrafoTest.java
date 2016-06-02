package br.pucrs.alpro3.grafos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest {

	@Test
	public void testG1() throws Exception {
		Grafo g = new Grafo("g1.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG2() throws Exception {
		Grafo g = new Grafo("g2.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG3() throws Exception {
		Grafo g = new Grafo("g3.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(1);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG4() throws Exception {
		Grafo g = new Grafo("g4.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	

	@Test
	public void testG5() throws Exception {
		Grafo g = new Grafo("g5.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(4);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}	
	
	
	@Test
	public void testG6() throws Exception {
		Grafo g = new Grafo("g6.txt");
		List<Integer> expected = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			expected.add(i);
		}
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}
	
	
}
