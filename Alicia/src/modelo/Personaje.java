
package modelo;

public class Personaje {
	private int secretos;
	private int ubicacion;
	private int locura;
	private static final int MAXIMO_LOCURA = 10;
	
	
    public void embellecer(int masLocura) {
    	locura += masLocura;
    	secretos -= 10;
    }
    
    public boolean esDeMaravilla() {
    	if (ubicacion < 0) {
    		return true;
    	}
    	else return false;
    	}
    
    public boolean esLinde() {
    	if (locura > MAXIMO_LOCURA*0.75f && esDeMaravilla() == true) {
    		return true;
    	}
    	else return false;
    }
    
    public boolean esNormal() {
    	if (locura  < 10 && secretos >= 500) {
    		return true;
    	}
    	else return false;
    }
    
    public Personaje(int locura, int secretos, int ubicacion) {
    	this.locura = locura;
    	this.secretos = secretos;
    	this.ubicacion = ubicacion;
    }
    
    public int getLocura() {
    	return locura;
    }
    
    public int getSecretos() {
    	return secretos;
    }
    
    public int getubicacion() {
    	return ubicacion;
    	
    }
    public void setSecretos(int secretos) {
    	this.secretos = secretos;
    }
    				

}