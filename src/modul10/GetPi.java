package modul10;

//FASE 2

		/*Crea una Functional Interface que continga un m�tode abstracte getPiValue (), 
		 * que retorna un valor double; en una altra classe, instancie la interf�cie 
		 * i assigneu-li mitjan�ant una lambda el valor 3.1415. 
		 * Invoca el m�tode getPiValue de la inst�ncia d'interf�cie i imprimeix el resultat. */

@FunctionalInterface
public interface GetPi {
	
	double getPiValue();

}
