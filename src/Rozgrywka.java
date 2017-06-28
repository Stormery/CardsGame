import java.util.Scanner;



public class Rozgrywka {

	
	private static int wyborMiejsca;
	
	
	
	public static void main(String[] args) {
		
		Plansza.nrOkna[0]= "1";
		Plansza.nrOkna[1]= "2";
		Plansza.nrOkna[2]= "3";
		Plansza.nrOkna[3]= "4";
		Plansza.nrOkna[4]= "5";
		Plansza.nrOkna[5]= "6";
		Plansza.nrOkna[6]= "7";
		Plansza.nrOkna[7]= "8";
		Plansza.nrOkna[8]= "9";
		
		
		
		
		Scanner input = new Scanner(System.in);
		int ktoryTeam=0;
		int wyborKarty;
		for (int i = 0; i < 9; i++) {			
			if(i%2!=0)
			{
				
				System.err.print("Ktore okno wybierasz jako przeciwnik? ( X ): ");
				wyborMiejsca = input.nextInt();
				System.err.print("Ktora karte wybierasz jako przeciwnik? ( X ): ");
				 wyborKarty = input.nextInt();
				 	ktoryTeam = Plansza.TEAM2;
				 	
				 	Plansza.wybieranieKarty(wyborKarty);
				 	
					Plansza.przypisanieKartyDoOkna(wyborMiejsca);
					
					Plansza.walka(wyborMiejsca, Plansza.TEAM2);
			}
			else{
				System.out.print("Ktore okno wybierasz? ( O ): ");
				wyborMiejsca = input.nextInt();
				System.out.print("Ktora karte wybierasz? ( O ): ");
				 wyborKarty = input.nextInt();
				 	ktoryTeam = Plansza.TEAM1;
				 	Plansza.wybieranieKarty(wyborKarty);
					Plansza.przypisanieKartyDoOkna(wyborMiejsca);
					Plansza.walka(wyborMiejsca, Plansza.TEAM1);
					
			}
			
				Plansza.rysujeOkna(wyborMiejsca, wyborKarty, ktoryTeam );
				System.out.println();
				Plansza.podliczeniePunktow();
				
		
		}
			
		
		input.close();	
			
		}

	
}



