package diapo41;

import java.util.ArrayList;
import java.util.List;

public abstract class Instrumento {

	private List<NotasMusicales> melodia;

	public Instrumento() {

		this.melodia = new ArrayList<NotasMusicales>();

	}

	public List<NotasMusicales> getNotasMusicales() {
		return melodia;
	}

	public void setNotasMusicales(List<NotasMusicales> notasMusicales) {
		this.melodia = notasMusicales;
	}

	public void add(NotasMusicales nota) {
		this.melodia.add(nota);

	}

	public abstract void interpretar();

}
