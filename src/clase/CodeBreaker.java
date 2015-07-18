package clase;
/**
 * 
 * @author Juan Estrada
 *
 */
public class CodeBreaker {
	public String validar(String numero,String correcto){
		String equis = "";
		String rayas = "";
		int i = 0;
		for (char c: numero.toCharArray()){
			if(c == correcto.charAt(i)){
				equis += "x";
			}else{
				for (char d: correcto.toCharArray()){
					if(c==d){
						rayas += "-";
					}
				}
			}
			i++;
		}
		return equis+rayas;
	}
}
