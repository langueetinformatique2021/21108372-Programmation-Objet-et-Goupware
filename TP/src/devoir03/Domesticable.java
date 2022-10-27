/**
 * 
 */
package devoir03;

/**
 * @author yuyan
 *
 */
public interface Domesticable {
	/** 
	* Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal 
	* */

	public abstract void domestiquer(String nom);
	
	/** 
	* Rend le nom de l'animal
	* @return nom de l'animal 
	* */
	public abstract String nom();
	}