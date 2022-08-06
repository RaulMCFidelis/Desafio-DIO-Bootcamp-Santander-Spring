package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Hoder"
 * 
 * @see <a href="http://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author RaulMCFidelis
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder( ) {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}