import java.util.Scanner;

public class Zgadywanka {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int menuWybor=0;
		int poziom=0;
		int wygenerowanaLiczba = 0;
		
		System.out.println("Witaj w grze zgadywance. Twoim zadaniem b�dzie odgadni�cie liczby kt�r� wygenerowa� komputer");
		
		while(true) {
			//P�tla do wy�wietlenia menu
			do {
				System.out.println("------------------------------");
				System.out.println("MENU");
				System.out.println("------------------------------");
				System.out.println("1. Nowa Gra");
				System.out.println("2. Wyj�cie");
				System.out.print("Tw�j wyb�r: ");
				menuWybor = in.nextInt();
			} while(menuWybor != 1 && menuWybor !=2);
			
			//Sprawdzanie wprowadzonej warto�ci
			if(menuWybor == 1) {
				do {
					System.out.println("------------------------------");
					System.out.println("WYIERZ POZIOM TRUDNO�CI");
					System.out.println("------------------------------");
					System.out.println("1. �atwy");
					System.out.println("2. Normalny");
					System.out.println("3. Trydny");
					System.out.print("Tw�j wyb�r: ");
					poziom = in.nextInt();
				} while(poziom != 1 && poziom !=2 && poziom !=3);
				
				//Sprawdzanie wprowadzonej warto�ci
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
					System.out.print("Podaj liczb�: ");
					liczbaGracza = in.nextInt();
					licznik++;
					
					if(wygenerowanaLiczba > liczbaGracza) {
						System.out.println("Liczba kt�r� poda�e� jest mniejsza od prawid�owej. Spr�buj jeszcze raz");
					} else if(wygenerowanaLiczba < liczbaGracza) {
						System.out.println("Liczba kt�r� poda�e� jest wi�ksza od prawid�owej. Spr�buj jeszcze raz");
					}
				}
				
				System.out.println("Gratulacje! Wygenerowana liczba to "+wygenerowanaLiczba+". Uda�o ci si� odgadn�� warto�� po "+licznik+" pr�bach.");
				
			} else if(menuWybor == 2) {
				System.exit(0);
			}
		}
	}
}
