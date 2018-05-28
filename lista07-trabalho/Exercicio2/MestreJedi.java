package Exercicio2;

public class MestreJedi {
	public double vida; 
	private double dominioDaForça; 
	private double dominioDoSabre; 
	public double dano;  // classe batalha precisaria chamar o get muitas vezes, acaba sendo melhor deixar a variavel publica 
	
	void setDominioDaForca(double forca) {
		this.dominioDaForça=forca; 
	}
	double getDominioDaForca() {
		return this.dominioDaForça;
	}
	void setDominioDoSabre(double sabre) {
		this.dominioDoSabre=sabre; 
	}
	double getDominioDoSabre() {
		return this.dominioDoSabre;
	}
	
	
	
	double ataqueForça1 () {
		return this.dano = 50*(this.dominioDaForça); 
		
	}
	double ataqueForça2 () {
		return this.dano = 35*(this.dominioDaForça); 
		
	}
	double ataqueSabre1 () {
		return this.dano = 100*(this.dominioDoSabre); 
		
	}
	double ataqueSabre2 () {
		return this.dano = 75*(this.dominioDoSabre); 
		
	}
	
	
	
}
