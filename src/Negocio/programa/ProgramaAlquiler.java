package Negocio.programa;

import javax.persistence.Entity;

@Entity
public class ProgramaAlquiler extends Programa {
	private float precioHora;

	public void getPrecioFinal() {
		
	}

	public void setPrecioFinal() {
		
	}

	public ProgramaAlquiler() {
		
	}

	public float getPrecioHora() {
		
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		
		this.precioHora = precioHora;
	}
	
	
}