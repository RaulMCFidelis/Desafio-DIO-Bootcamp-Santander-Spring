package one.digitalinnovation.gof.strategy;

public class ComportametoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}
	
}