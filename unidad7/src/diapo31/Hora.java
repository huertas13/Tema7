package diapo31;

public class Hora {


	
		
		private int hora;
		private int minuto;
		
		public Hora(int hora, int minuto) {
			setHora(hora);
			setMinuto(minuto);
		}
		
		public int getHora() {
			return this.hora;
		}
		
		public boolean setHora(int hora) {
			boolean cambio = false;
			
			if(hora >= 0 && hora <= 23) {
				cambio = true;
				this.hora = hora;
			}
				
			return cambio;
		}
		
		public int getMinuto() {
			return this.minuto;
		}
		
		public boolean setMinuto(int minuto) {
			boolean cambio = false;
			
			if(minuto >= 0 && minuto <= 59) {
				cambio = true;
				this.minuto = minuto;
			}
				
			return cambio;
			
		}
		
		public void inc() {
			this.minuto++;
			if(this.minuto == 60 && this.hora == 23) {
				this.hora = 0;
				this.minuto = 0;
			} else if(this.minuto == 60){
				this.hora++;
				this.minuto = 0;
			}
		}

		@Override
		public String toString() {
			return String.format("%02d:%02d", this.hora, this.minuto);
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
			Hora otra = (Hora) obj;
				
			if (this.hora == otra.hora && this.minuto == otra.minuto) {
				
				iguales = true;
				
				
			}
			
			return iguales;
			}

}
