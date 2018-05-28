package Exercicio2;



public class batalha {

	
	public static void main (String args []) {
		
		MestreJedi Jedi = new MestreJedi(); 
		LordeSith Sith = new LordeSith(); 
		
		Sith.vida=100; 
		Sith.setDominioDaForca(0.2);
		Sith.setDominioDoSabre(0.25);
		Jedi.vida=100; 
		Jedi.setDominioDaForca(0.1);
		Jedi.setDominioDoSabre(0.15);
		
		if (Sith.getDominioDaForca() > Jedi.getDominioDaForca() ) {  // para decidir quem começa atacando
			while(Sith.vida>0 && Jedi.vida>0 ) {
				Sith.vida = Sith.vida - Jedi.ataqueForça1(); 
				if (Sith.vida >0 )
					Jedi.vida=Jedi.vida - Sith.ataqueForça1(); 
				else break; 
				if(Jedi.vida>0 && Sith.vida>0) {
					Sith.vida=Sith.vida - Jedi.ataqueForça2();
					if (Sith.vida >0 )
						Jedi.vida=Jedi.vida - Sith.ataqueForça2(); 
					else break; 
				}
				else break; 
				if(Jedi.vida>0 && Sith.vida>0) {
					Sith.vida=Sith.vida - Jedi.ataqueSabre1();
					if (Sith.vida >0 )	
						Jedi.vida=Jedi.vida - Sith.ataqueSabre1(); 
					else break; 
				}
				else break; 
				if(Jedi.vida>0 && Sith.vida>0) {
					Sith.vida=Sith.vida - Jedi.ataqueSabre2();
					if (Sith.vida >0 )
						Jedi.vida=Jedi.vida - Sith.ataqueSabre2(); 
					else break; 
				}
				else break; 
					
			}
			
		}
		else {
			while(Sith.vida>0 && Jedi.vida>0 ) {
				Jedi.vida = Jedi.vida - Sith.ataqueForça1(); 
				if (Jedi.vida >0 )
					Sith.vida=Sith.vida - Jedi.ataqueForça1(); 
				else break; 
				if(Sith.vida>0 && Jedi.vida>0) {
					Jedi.vida=Jedi.vida - Sith.ataqueForça2();
					if (Jedi.vida >0 )
						Sith.vida=Sith.vida - Jedi.ataqueForça2(); 
					else break; 
				}
				else break; 
				if(Sith.vida>0 && Jedi.vida>0) {
					Jedi.vida=Jedi.vida - Sith.ataqueSabre1();
					if (Jedi.vida >0 )	
						Sith.vida=Sith.vida - Jedi.ataqueSabre1(); 
					else break; 
				}
				else break; 
				if(Sith.vida>0 && Jedi.vida>0) {
					Jedi.vida=Jedi.vida - Sith.ataqueSabre2();
					if (Jedi.vida >0 )
						Sith.vida=Sith.vida - Jedi.ataqueSabre2(); 
					else break; 
				}
				else break; 
					
			}
		}
			
			if(Jedi.vida>0)
				System.out.println("Jedi Venceu");
			if (Sith.vida>0)
				System.out.println("Sith Venceu");
		
		
	}

}
