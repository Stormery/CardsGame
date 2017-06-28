
public class Plansza extends Karta {

	public Plansza(String nick, int nrGorny, int nrDolny, int nrLewy, int nrPrawy) {
		super(nick, nrGorny, nrDolny, nrLewy, nrPrawy);

	}

	private final static String poziomyFrame = "_";
	private final static String pionowyFrame = "|";
	private final static String pusteOkno = " ";
	
	public final static int TEAM1 = 1;
	public final static int TEAM2 = 2;
	
	public static String[] nrOkna = new String[9];
	public static int[][] statystykiKarty = new int[9][4];
	public static int[] team = new int[9];
	
	
	private static boolean[][] uzycieKart = new boolean[2][9];
	

	private static int calaDlugosc = 19;

	// Nazwa karty
	private static int wysrodkowanieSlowa(int osPozioma, int symbolOkna) {
		int podsumowanieDlugosci = 0;
		// od lewej dodaje puste pola o dlugosci 9(czyli srodek) - dlugosc slowa
		for (int dlugosc = 0; dlugosc <= (calaDlugosc / 2) - (nrOkna[symbolOkna].length() / 2); dlugosc++) {
			System.out.print(pusteOkno);
		}
		System.out.print(nrOkna[symbolOkna]);
		// po slowie liczy ile spacji musi pominac + slowo nieparzyste
		if (nrOkna[symbolOkna].length() % 2 != 0) {
			podsumowanieDlugosci++;
		}
		return podsumowanieDlugosci += (calaDlugosc / 2) + (nrOkna[symbolOkna].length() / 2);

	}

	public static void rysujeOkna(int wyborOkna, int wyborKarty, int ktoryTeam) {
		
		team[wyborOkna-1] = ktoryTeam;
		// gorna linia
		for (int i = 0; i <= 60; i++) {
			System.out.print(poziomyFrame);
		}

		System.out.println();

		// srodkowe linie + okna
		for (int osPionowa = 1; osPionowa <= 30; osPionowa++) {
			// linie przecinajace okna
			if (osPionowa % 10 == 0 && osPionowa != 0) {
				System.out.print(pionowyFrame);
				for (int l = 0; l <= 58; l++) {
					System.out.print(poziomyFrame);
				}
			}

			// calosc okien
			System.out.print(pionowyFrame);
			for (int osPozioma = 0; osPozioma < 19; osPozioma++) {

				if (osPozioma == 0 && osPionowa == 5) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 0);

				} else if (osPozioma == 0 && osPionowa == 15) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 3);
				} else if (osPozioma == 0 && osPionowa == 25) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 6);
				}
				////////////////// Statystyki Karty///////////////////
				////////////// Pierwsze okno
				else if (osPozioma == 10 && osPionowa == 3)
				{
					if(team[0]==1)
					{
						System.out.print("O");
						osPozioma++;
					}
					if(team[0]==2)
					{
						System.out.print("X");
						
						
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 6) {
					if (statystykiKarty[0][0] > 0) {
						System.out.print(statystykiKarty[0][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 7) {
					if (statystykiKarty[0][1] > 0 && statystykiKarty[0][2] > 0) {
						System.out.print(statystykiKarty[0][1] + "   " + statystykiKarty[0][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 8) {
					if (statystykiKarty[0][3] > 0) {
						System.out.print(statystykiKarty[0][3]);
					} else
						System.out.print(" ");
				}
				////////////// Czwarte okno
				else if (osPozioma == 10 && osPionowa == 13)
				{
					if(team[3]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[3]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 16) {
					if (statystykiKarty[3][0] > 0) {
						System.out.print(statystykiKarty[3][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 17) {
					if (statystykiKarty[3][1] > 0 && statystykiKarty[3][2] > 0) {
						System.out.print(statystykiKarty[3][1] + "   " + statystykiKarty[3][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 18) {
					if (statystykiKarty[3][3] > 0) {
						System.out.print(statystykiKarty[3][3]);
					} else
						System.out.print(" ");
				}
				/////////////////// Siodme okno
				else if (osPozioma == 10 && osPionowa == 23)
				{
					if(team[6]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[6]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 26) {
					if (statystykiKarty[6][0] > 0) {
						System.out.print(statystykiKarty[6][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 27) {
					if (statystykiKarty[6][1] > 0 && statystykiKarty[6][2] > 0) {
						System.out.print(statystykiKarty[6][1] + "   " + statystykiKarty[6][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 28) {
					if (statystykiKarty[6][3] > 0) {
						System.out.print(statystykiKarty[6][3]);
					} else
						System.out.print(" ");
				}
				/////////////////// Jesli zadne z wyzej, rob puste
				/////////////////// okna///////////////////////////////////
				else
					System.out.print(pusteOkno);
				///////////////////////////////////////////////////

			}

			/////////////// Srodkowe okna
			////////// Rysuje okna
			System.out.print(pionowyFrame);

			for (int osPozioma = 0; osPozioma < 19; osPozioma++) {
				if (osPozioma == 0 && osPionowa == 5) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 1);

				} else if (osPozioma == 0 && osPionowa == 15) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 4);
				} else if (osPozioma == 0 && osPionowa == 25) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 7);
				}
				///////////// Drugie okno
				else if (osPozioma == 10 && osPionowa == 3)
				{
					if(team[1]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[1]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 6) {
					if (statystykiKarty[1][0] > 0) {
						System.out.print(statystykiKarty[1][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 7) {
					if (statystykiKarty[1][1] > 0 && statystykiKarty[1][2] > 0) {
						System.out.print(statystykiKarty[1][1] + "   " + statystykiKarty[1][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 8) {
					if (statystykiKarty[1][3] > 0) {
						System.out.print(statystykiKarty[1][3]);
					} else
						System.out.print(" ");
				}
				////////////// Piate okno
				else if (osPozioma == 10 && osPionowa == 13)
				{
					if(team[4]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[4]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 16) {
					if (statystykiKarty[4][0] > 0) {
						System.out.print(statystykiKarty[4][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 17) {
					if (statystykiKarty[4][1] > 0 && statystykiKarty[4][2] > 0) {
						System.out.print(statystykiKarty[4][1] + "   " + statystykiKarty[4][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 18) {
					if (statystykiKarty[4][3] > 0) {
						System.out.print(statystykiKarty[4][3]);
					} else
						System.out.print(" ");
				}
				/////////////////// Osme okno
				else if (osPozioma == 10 && osPionowa == 23)
				{
					if(team[7]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[7]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 26) {
					if (statystykiKarty[7][0] > 0) {
						System.out.print(statystykiKarty[7][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 27) {
					if (statystykiKarty[7][1] > 0 && statystykiKarty[7][2] > 0) {
						System.out.print(statystykiKarty[7][1] + "   " + statystykiKarty[7][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 28) {
					if (statystykiKarty[7][3] > 0) {
						System.out.print(statystykiKarty[7][3]);
					} else
						System.out.print(" ");
				} else
					System.out.print(pusteOkno);
				///////////////////////////////////////////////////////////////

			}
			/////////////////// Prawe Okna
			/////////// Rysuje okna
			System.out.print(pionowyFrame);
			for (int osPozioma = 0; osPozioma < 19; osPozioma++) {
				if (osPozioma == 0 && osPionowa == 5) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 2);
				} else if (osPozioma == 0 && osPionowa == 15) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 5);
				} else if (osPozioma == 0 && osPionowa == 25) {
					osPozioma += wysrodkowanieSlowa(osPozioma, 8);
				}
				///////////// Trzecie okno
				else if (osPozioma == 10 && osPionowa == 3)
				{
					if(team[2]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[2]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 6) {
					if (statystykiKarty[2][0] > 0) {
						System.out.print(statystykiKarty[2][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 7) {
					if (statystykiKarty[2][1] > 0 && statystykiKarty[2][2] > 0) {
						System.out.print(statystykiKarty[2][1] + "   " + statystykiKarty[2][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 8) {
					if (statystykiKarty[2][3] > 0) {
						System.out.print(statystykiKarty[2][3]);
					} else
						System.out.print(" ");
				}
				////////////// Szoste okno
				else if (osPozioma == 10 && osPionowa == 13)
				{
					if(team[5]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[5]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 16) {
					if (statystykiKarty[5][0] > 0) {
						System.out.print(statystykiKarty[5][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 17) {
					if (statystykiKarty[5][1] > 0 && statystykiKarty[5][2] > 0) {
						System.out.print(statystykiKarty[5][1] + "   " + statystykiKarty[5][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 18) {
					if (statystykiKarty[5][3] > 0) {
						System.out.print(statystykiKarty[5][3]);
					} else
						System.out.print(" ");
				}
				/////////////////// Dziewiate okno
				else if (osPozioma == 10 && osPionowa == 23)
				{
					if(team[8]==1)
					{
						System.out.print("O");osPozioma++;
					}
					if(team[8]==2)
					{
						System.out.print("X");
					}
					else
						System.out.print(" ");
					
				}
				else if (osPozioma == 9 && osPionowa == 26) {
					if (statystykiKarty[8][0] > 0) {
						System.out.print(statystykiKarty[8][0]);
					} else
						System.out.print(" ");

				} else if (osPozioma == 7 && osPionowa == 27) {
					if (statystykiKarty[8][1] > 0 && statystykiKarty[8][2] > 0) {
						System.out.print(statystykiKarty[8][1] + "   " + statystykiKarty[8][2]);
						osPozioma += 4;
					} else
						System.out.print(" ");

				} else if (osPozioma == 9 && osPionowa == 28) {
					if (statystykiKarty[8][3] > 0) {
						System.out.print(statystykiKarty[8][3]);
					} else
						System.out.print(" ");
				} else
					System.out.print(pusteOkno);
			}
			///////////////////////////////////////////////
			System.out.print(pionowyFrame);
			System.out.println(osPionowa); // liczenie + daje nowa linie
		}
	}

	public static Plansza wybranaKarta;

	public static Plansza Kerrigan = new Plansza("Kerrigan", 4, 4, 4, 4);
	public static Plansza Zeratul = new Plansza("Zeratul", 6, 3, 2, 1);
	public static Plansza Uther = new Plansza("Uther", 2, 2, 5, 3);
	public static Plansza Sonya = new Plansza("Sonya", 3, 2, 1, 7);
	public static Plansza Rexxar = new Plansza("Rexxar", 3, 2, 4, 3);
	public static Plansza Abathur = new Plansza("Abathur", 2, 4, 4, 2);
	public static Plansza Raynor = new Plansza("Raynor", 1, 3, 6, 2);
	public static Plansza Artanis = new Plansza("Artanis", 3, 1, 3, 5);
	public static Plansza SgtHammer = new Plansza("Sgt.Hammer", 9, 1, 1, 1);
	public static void wybieranieKarty(int wyborKarty) {
		
	
			switch (wyborKarty) {
			case 1:
				wybranaKarta = Kerrigan;
				break;
			case 2:
				wybranaKarta = Zeratul;
				break;
			case 3:
				wybranaKarta = Uther;
				break;
			case 4:
				wybranaKarta = Sonya;
				break;
			case 5:
				wybranaKarta = Rexxar;
				break;
			case 6: 
				wybranaKarta = Abathur;
				break;
			case 7:
				wybranaKarta = Raynor;
				break;
			case 8: 
				wybranaKarta = Artanis;
				break;
			case 9:
				wybranaKarta = SgtHammer;
				break;
				
				//brakuje mi tu default
			}

	}
	
	public static void podliczeniePunktow()
	{
		
		int team1=0;
		int team2=0;
		for(int i=0;i<=team.length-1;i++)
		{
			//1 to team 1/ 2 to team 2, 
			if(team[i]==1){team1++;}
			if(team[i]==2){team2++;}
		}
		System.out.println("Team O : Team X ");
		System.out.println("     " +team1+ " : " + team2);
	}

//	private static void rozpisaniePustychOkien() {
//		for (int i = 0; i < statystykiKarty.length; i++) {
//			for (int j = 0; j < statystykiKarty[i].length; j++) {
//				statystykiKarty[i][j] = -1;
//			}
//		}
//	}
	
	
	
	
	
	
	public static void walka(int wyborMiejsca, int ktoryTeam)
	{	
		wyborMiejsca-=1;
		
		// sprawdza czy miejsce nie jest narozne, albo czy nie zaatakuje karty -1 ktora nie jest obok
		// karty dookola sa zawsze -3 -1 +1 +3 od miejsca w ktorym karta jest kladziona
		if (wyborMiejsca-3>=0)
		{
			if(statystykiKarty[wyborMiejsca][0]>statystykiKarty[wyborMiejsca-3][3]&& team[wyborMiejsca-3]!=0)
			{
				team[wyborMiejsca-3] = ktoryTeam;
				
			}
		}
		if (wyborMiejsca-1>=0 && wyborMiejsca-1!=2 && wyborMiejsca-1!=5 )
		{
			if(statystykiKarty[wyborMiejsca][1]>statystykiKarty[wyborMiejsca-1][2]&& team[wyborMiejsca-1]!=0)
			{
				team[wyborMiejsca-1] = ktoryTeam;
				
			}
		}
		if (wyborMiejsca+1<=8 && wyborMiejsca+1!=3 && wyborMiejsca+1!=6)
		{
			if(statystykiKarty[wyborMiejsca][2]>statystykiKarty[wyborMiejsca+1][1]&& team[wyborMiejsca+1]!=0)
			{
				team[wyborMiejsca+1] = ktoryTeam;
				
			}
		}
		if (wyborMiejsca+3<=8)
		{
			if(statystykiKarty[wyborMiejsca][3]>statystykiKarty[wyborMiejsca+3][0]&& team[wyborMiejsca+3]!=0)
			{
				team[wyborMiejsca+3] = ktoryTeam;
				
			}
		}
		
	}
	

	public static void przypisanieKartyDoOkna(int symbolOkna) {
		symbolOkna -= 1;
		
		
		nrOkna[symbolOkna] = wybranaKarta.getNick();
		statystykiKarty[symbolOkna][0] = wybranaKarta.getNrGorny();
		statystykiKarty[symbolOkna][1] = wybranaKarta.getNrLewy();
		statystykiKarty[symbolOkna][2] = wybranaKarta.getNrPrawy();
		statystykiKarty[symbolOkna][3] = wybranaKarta.getNrDolny();

	}

}
