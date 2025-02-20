package diapo31;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;

	}

	public int getSegundo() {

		return this.segundo;

	}

	public boolean setSegundo(int segundo) {
		boolean cambio = false;

		if (segundo >= 0 && segundo <= 59) {
			cambio = true;
			this.segundo = segundo;

		}

		return cambio;

	}

	@Override
	public void inc() {

		if (this.segundo != 59) {
			this.segundo++;

		} else {

			this.segundo = 0;
			super.inc();
		}

	}
		@Override
	
	public String toString() {
			
		
		return super.toString() + String.format(":%02d", this.segundo);

}

		@Override
		
		public boolean equals (Object obj) {
			
			if (obj == null) {
			return false;	
				
			}
			if (!this.getClass().equals(obj.getClass())) {
				
				return false;
			}
		boolean iguales = false;
		HoraExacta otra = (HoraExacta) obj;
			
		if (super.equals(obj)&& 
				this.segundo == otra.segundo) {
			
			iguales = true;
			
			
		}
		
		return iguales;
		}
		
		
		
}
