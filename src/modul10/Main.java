package modul10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		//FASE 1
		
		//Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista 
		//de totes les cadenes que comencen amb la lletra 'a' (mayuscula) 
		//i tenen exactament 3 lletres. Imprimeix el resultat. 
		
		ArrayList<String> noms = new ArrayList();
		
		noms.add("Joan");
		noms.add("Ana");
		noms.add("Andrea");
		noms.add("ari");
		noms.add("Josep");
		noms.add("Ornitorrinco");
		
		System.out.println("Noms que comencen amb la lletra a: " + llistaCondicional(noms, s -> s.startsWith("A") && s.length() == 3));
		
		
		/*Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. 
		 * Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell 
		 * i precedit de la lletra "o" si el nombre és imparell. 
		 * Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44". Imprimeix el resultat.*/
		
		ArrayList <Integer> numeros = new ArrayList();
		
		numeros.add(5);
		numeros.add(135);
		numeros.add(4);
		numeros.add(163);
		numeros.add(0);
		numeros.add(180);
		numeros.add(8);
		
		System.out.println("Llista d'integers parells (e) i imparells (o): " + parellsImparells(numeros, (i) -> i % 2 == 0));
		
		/*Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes 
		 * que continguen la lletra ‘o’ i imprimeix el resultat. */
		
		System.out.println("Llista de cadenes que contenen la o: " + llistaCondicional(noms, s -> s.contains("o")));
		
		/*Has de fer el mateix que en el punt anterior, però retornant una llista que incloga els elements amb més de 5 lletres. 
		 * Imprimeix el resultat. */
		
		System.out.println("Llista de cadenes que contenen la o i tenen més de 5 lletres: " 
		+ llistaCondicional(noms, s -> s.contains("o") && s.length() > 5));
		
		/*Crea una llista amb els noms dels mesos de l’any. 
		 * Imprimeix tots els elements de la llista amb una lambda.*/
		
		ArrayList<String> mesos = new ArrayList<String>(
	            Arrays.asList("Gener","Febrer", "Març", "Abril", "Maig", "Juny",
	            			  "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));
		
		//System.out.println("Mesos de l'any: " + llistaCondicional(mesos, s -> true));
		
		mesos.forEach(s -> System.out.print(s + " "));
		
		/*Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference.*/
		
		mesos.forEach(System.out::println);
		
		GetPi pi = () -> 3.1415;
		
		System.out.println(pi.getPiValue());
		
		GetReverse invertir = (string) -> {
			StringBuffer sbr = new StringBuffer(string);
	        sbr.reverse();
	        String str = sbr.toString();
			return str;
		};
		
		System.out.println(invertir.Reverse("hola que tal"));
		

	}	
	
	private static ArrayList llistaCondicional(ArrayList<String> noms, Predicate<String> predicate) {
		ArrayList<String> llista = new ArrayList();
		for (String s : noms) {
			if(predicate.test(s)) llista.add(s);	
		}
		
		return llista;
		
	}
	
	private static String parellsImparells(ArrayList<Integer> numeros, Predicate<Integer> predicate) {
		String s = "";
		for (int i : numeros) {
			if(predicate.test(i)) s = s + "e" + i;
			else s = s + "o" + i;
			if (numeros.indexOf(i) == numeros.size() - 1) s = s + ".";
			else s = s + ", ";
		}
		return s;
	}

}


