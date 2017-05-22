import java.util.Scanner;

public class Zgadywanka {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int menuWybor=0;
		int poziom=0;
		int wygenerowanaLiczba = 0;
		
		System.out.println("Witaj w grze zgadywance. Twoim zadaniem bêdzie odgadniêcie liczby któr¹ wygenerowa³ komputer");
		
		while(true) {
			//Pêtla do wyœwietlenia menu
			do {
				System.out.println("------------------------------");
				System.out.println("MENU");
				System.out.println("------------------------------");
				System.out.println("1. Nowa Gra");
				System.out.println("2. Wyjœcie");
				System.out.print("Twój wybór: ");
				menuWybor = in.nextInt();
			} while(menuWybor != 1 && menuWybor !=2);
			
			//Sprawdzanie wprowadzonej wartoœci
			if(menuWybor == 1) {
				do {
					System.out.println("------------------------------");
					System.out.println("WYIERZ POZIOM TRUDNOŒCI");
					System.out.println("------------------------------");
					System.out.println("1. £atwy");
					System.out.println("2. Normalny");
					System.out.println("3. Trydny");
					System.out.print("Twój wybór: ");
					poziom = in.nextInt();
				} while(poziom != 1 && poziom !=2 && poziom !=3);
				
				//Sprawdzanie wprowadzonej wartoœci
				if(poziom == 1) {
					wygenerowanaLiczba = (int)(Math.random() * 100);
				} else if(poziom == 2) {
					wygenerowanaLiczba = (int)(Math.random() * 500);
				} else if(poziom == 3) {
					wygenerowanaLiczba = (int)(Math.random() * 1000);
				}
				
				int liczbaGracza = -1;
				int licznik = 0;
				
				while(wygenerowanaLiczba != liczbaGracza) {
					System.out.print("Podaj liczbê: ");
					liczbaGracza = in.nextInt();
					licznik++;
					
					if(wygenerowanaLiczba > liczbaGracza) {
						System.out.println("Liczba któr¹ poda³eœ jest mniejsza od prawid³owej. Spróbuj jeszcze raz");
					} else if(wygenerowanaLiczba < liczbaGracza) {
						System.out.println("Liczba któr¹ poda³eœ jest wiêksza od prawid³owej. Spróbuj jeszcze raz");
					}
				}
				
				System.out.println("Gratulacje! Wygenerowana liczba to "+wygenerowanaLiczba+". Uda³o ci siê odgadn¹æ wartoœæ po "+licznik+" próbach.");
				
			} else if(menuWybor == 2) {
				System.exit(0);
			}
		}
	}
}
