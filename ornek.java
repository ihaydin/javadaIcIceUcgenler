import java.util.Scanner;
 
public class Ucgen{
 
		public static void main(String[] args) {
			
			Scanner iha = new Scanner(System.in);
			int yukseklik;
			
			System.out.print("Şekil için yükseklik giriniz: ");
			yukseklik = iha.nextInt();
			
			while (yukseklik<=1){
				System.out.print("Şekil için yükseklik giriniz: ");
				yukseklik = iha.nextInt();
			}
			
			int k = 2*yukseklik-7;
			
			for (int i = 0; i <yukseklik; i++){
				if( i == 0){
					UcgenCiz('*', 1, false);					//ücgenin en basındaki yıldız
					UcgenCiz('-', 2*yukseklik-3, false);		//üçgenin üstündeki cizgiler
					UcgenCiz('*', 1, false);					//ücgenin sonundaki yıldız
				}
				
				else if(i==yukseklik-1){
					UcgenCiz(' ', yukseklik-1, false);			//ücgenin en alt tabanındaki bosluklar
					UcgenCiz('*', 1, false);					//ücgenin en sonundaki yıldız
				}
				
				else{
					UcgenCiz(' ', i, false);					//ücgenin dısındaki bosluklar
					UcgenCiz('\\', 1, false);					//ücgenin sol kenarındaki cizgiler
					if (yukseklik!=3) {
						UcgenCiz(' ', 1, false);				//iki üçgen arasındaki sol taraftaki bosluklar
					}
					if (i==1){
						UcgenCiz('*', k, false);				//icteki ücgenin üstündeki yıldızlar
						UcgenCiz(' ', 1, false);				//iki ücgen arasındaki sag taraftaki bosluklar
						UcgenCiz('/', 1, false);				//ücgenin sag tarafındaki en üstteki cizgi
					}
					
					else{
						
						if (yukseklik>4 && i>1 && i<yukseklik-2){
							
							UcgenCiz('*', 1, false);			//icteki ücgenin solundaki yıldızlar
							
							if (yukseklik-4 >= i){
								k-=2;
								UcgenCiz(' ', k-2, false);		//icteki ücgenin icindeki bosluklar
								UcgenCiz('*', 1, false);		//icteki ücgenin sagındaki yıldızlar	
								UcgenCiz(' ', 1, false);		//ücgenlerin arasındaki sag taraftaki bosluk
							}
							
							else if(yukseklik-3==i){
								UcgenCiz(' ', 1, false);		//icteki ücgenin sonundaki bosluk
							}
						}
						UcgenCiz('/', 1, false);				//ücgenin sagındaki cizgiler
					}
					
				}
				UcgenCiz(' ', -1, false);
			}
		}
		
		
		public static void UcgenCiz(char ihaa , int sayi, boolean sekil){
			for (int i = 0; i < sayi; i++){
				System.out.print(ihaa+"");				//sekli yazdırmak için tanımlanan fonksiyon
			}										
			if (sekil){
				System.out.println();					//satırları alt alta sıralayan kod
			}
		}
 
	}
