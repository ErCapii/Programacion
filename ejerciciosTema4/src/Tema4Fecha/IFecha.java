package Tema4Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface IFecha {

	public void setFecha(LocalDate fecha);
	
	
	public void actual();
	public String tostring();
	/** Valida la fecha para saber si es valida
	 * 
	 * @return
	 */
	public Boolean validar();
	public void cambiarFormato(DateTimeFormatter patron);
	public boolean equals(Object obj);
	public Integer getDiaMes(Integer dia,Integer mes);
	public Integer getMes(Integer mes);
	public Integer getAño(Integer año);
	/** devuelve el dia de la semana en formato (lunes,martes..)
	 * 
	 * @param dia
	 * @return
	 */
	public Integer getDiaSemana(Integer dia);
	public Integer sumarDias(Integer dia);
	public Integer sumarMeses(Integer mes);
	public Integer sumarAños(Integer año);
	public Boolean esFestivo(Boolean festivo);
	public Integer restar(Integer fecha);
	public Integer getDiasRestantes(Integer dia);
	public Boolean esBisiesto(Boolean bisiesto);
	/** Devuelve la edad
	 * 
	 * @param fecha
	 * @return
	 */
	public Integer getDiferencia(Integer fecha);
	
	
	
	
}
