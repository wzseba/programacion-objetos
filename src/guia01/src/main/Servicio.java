package main;

import java.time.LocalDate;

public class Servicio {
	
	private LocalDate fechaInicio;
	
	public Servicio(LocalDate fechaIncio) {
		this.fechaInicio = LocalDate.MAX;
	}
	
	public void setFechaInicio(LocalDate fi) {
		this.fechaInicio = fi;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

}
