package examen;
/**
 *  La clase fecha gestiona los datos para decir si una fecha es válida o no
 * 
 * @author Mario Jiménez
 * @version 1.0
 */
public class Fecha {
	/**
	 * @param fechaValida indica la fecha 
	 */
	public boolean fechaValida;
/**
 * El metodo devuelve con los parametros dados si la fecha es una fecha valida.
 * 
 * @param anio indica el año que se le pasa como parametro al método
 * @param mes indica el mes que se le pasa como parametro al método
 * @param dia indica el dia que se le pasa como parametro al método
 * @return variable fechaValida nos dice si la fecha es valida o no
 */
	public boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}