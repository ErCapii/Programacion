package Tema4Pais;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Pais> bolsaPaises = new HashSet<Pais>();
		
		System.out.println(bolsaPaises);
		Pais pais1 = new Pais("ES", "España");
		Pais pais2 = new Pais("CK", "Islas Cook");
		Pais pais3 = new Pais("CK", "Islas Caiman");
		
		bolsaPaises.add(pais1);
		bolsaPaises.add(pais2);
		bolsaPaises.add(pais3);
		
		System.out.println(bolsaPaises);
		Pais pais4 = new Pais("es", "España");
		bolsaPaises.add(pais4);
		System.out.println(bolsaPaises);
		
		for (Iterator iterator = bolsaPaises.iterator(); iterator.hasNext();) {
			Pais pais = (Pais) iterator.next();
			
			if(!pais.getCodigo().equals("ES")) {
				iterator.remove();
			}
		}
		System.out.println(bolsaPaises);
		bolsaPaises.clear();
		System.out.println(bolsaPaises);
	}
}
