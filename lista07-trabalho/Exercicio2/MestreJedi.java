package Exercicio2;

public class MestreJedi {
	public double vida; 
	private double dominioDaFor�a; 
	private double dominioDoSabre; 
	public double dano;  // classe batalha precisaria chamar o get muitas vezes, acaba sendo melhor deixar a variavel publica 
	
	void setDominioDaForca(double forca) {
		this.dominioDaFor�a=forca; 
	}
	double getDominioDaForca() {
		return this.dominioDaFor�a;
	}
	void setDominioDoSabre(double sabre) {
		this.dominioDoSabre=sabre; 
	}
	double getDominioDoSabre() {
		return this.dominioDoSabre;
	}
	
	
	
	double ataqueFor�a1 () {
		return this.dano = 50*(this.dominioDaFor�a); 
		
	}
	double ataqueFor�a2 () {
		return this.dano = 35*(this.dominioDaFor�a); 
		
	}
	double ataqueSabre1 () {
		return this.dano = 100*(this.dominioDoSabre); 
		
	}
	double ataqueSabre2 () {
		return this.dano = 75*(this.dominioDoSabre); 
		
	}
	
	
	
}
