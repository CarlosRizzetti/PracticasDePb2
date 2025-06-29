package ar.edu.unlam.pb2.amarras;

import java.util.ArrayList;
import java.util.List;

public class Fondadero {

	private Integer amarras;
	private List<Yate> listaDeAmarras=new ArrayList<Yate>();

	public Fondadero(Integer cantDeAmarras) {
		this.amarras = cantDeAmarras;

	}

	public Integer obtenerAmarras() {
		
		return this.amarras;
	}

	public void amarrarYate(Yate yate) {
		listaDeAmarras.add(yate);
		
	}

	public Integer obtenerAmarrasDisponibles() {
		
		return this.amarras-listaDeAmarras.size();
	}

	public void desamarrarYate(Yate yate) {
		listaDeAmarras.remove(yate);
		
	}
	
	
}
