package modelo;
import java.util.ArrayList;

public class Mundo {
	private ArrayList <Personaje> losPersonajes = new ArrayList<>();

	
	
    public void agregarPersonajes(Personaje p) {
    	losPersonajes.add(p);
	}
    
    
    public boolean hayPersonaNormal() {
    	for (Personaje p: losPersonajes) {
    		if (p.esNormal() == true) {
    			return true;
    		}
    	} 
    	return false;
    }

    

	public ArrayList <Personaje> personajesLindos() {
		ArrayList <Personaje> losPersonajesLindos = new ArrayList<>();
		for (Personaje p: losPersonajes) {
			
          if (p.esLinde() == true) {
        	losPersonajesLindos.add(p);
           }
		} 
		return losPersonajesLindos;
		}
	
	
	
	public ArrayList <Personaje> personajesNormales() {
		ArrayList <Personaje> losPersonajesNormales = new ArrayList<>();
		for (Personaje p: losPersonajes) {
			if (p.esNormal() == true) {
				losPersonajesNormales.add(p);
				}
			}
			return losPersonajesNormales;
			}
		

	
	public int cuantosEnMaravilla(int maravilloso) {
		for (Personaje p: losPersonajes) {
			if (p.esDeMaravilla() == true) {
				maravilloso += 1;
			}
		}return maravilloso;
	}
	
	
	
	
	public boolean masLindos(int lindos, int normales) {
		for (Personaje p : losPersonajes) {
			if (p.esLinde() == true) {
				lindos += 1;
				}
			else normales+=1;}
			  if (lindos>normales) {
				return true;
			}
			else return false;
	}
			
	

		public Personaje personajeMayorLocura() {
			Personaje masLoco = losPersonajes.get(0);
			for (Personaje p: losPersonajes) {
				if (p.getLocura()>masLoco.getLocura()) {
					masLoco = p;
				}		
		}return masLoco;	
	}
	
		
	    public ArrayList <Personaje> getLosPersonajes() {
	    	return losPersonajes;
	    }
}
