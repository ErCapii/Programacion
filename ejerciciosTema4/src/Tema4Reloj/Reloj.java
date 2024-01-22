package Tema4Reloj;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24Horas;

	public Reloj() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
		this.formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24Horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {

		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	public Boolean check() {
		return (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59);
	}

	private String formateo(Integer x) {

		if (x >= 10) {
			return x.toString();
		} else
			return "0" + x;

	}

	@Override
	public String toString() {
		if (!check()) {
			return "Hora Incorrecta";
		}

		if (formato24Horas) {
			return formateo(horas) + ":" + formateo(minutos) + ":" + formateo(segundos);

		}
		if (horas > 12) {
			return formateo(horas - 12) + ":" + formateo(minutos) + ":" + formateo(segundos) + "pm/am";
		} else
			return formateo(horas) + ":" + formateo(minutos) + ":" + formateo(segundos) + "pm/am";
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}
