package modul10;

/*Crea una Functional Interface que continga un m�tode abstracte reverse (), que retorne un valor String; 
 * en una altra classe, injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode, 
 * de manera que torne la mateixa cadena que rep com a par�metre per� a l'inrev�s. 
 * Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat. */

@FunctionalInterface
public interface GetReverse {
	String Reverse(String string);
}
