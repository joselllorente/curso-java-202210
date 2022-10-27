package curso.java.poo.interfaces;

public interface IUpdatable extends IInsertable{
	
	/**
	 * Método para actualizar el registro de la base de datos
	 */
	void update(long id);
}
