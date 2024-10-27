package tarihsaat;
import java.util.Scanner;
public class tarihsaatpro {
	public static void main(String args[]) {
		Scanner oku=new Scanner(System.in);
		System.out.println("gün gir:");
		int gün=oku.nextInt();
		int gun=5000,aritilansu=5000; 
	    double fiyat = 0,toplam=0;
	        for(int i=1;i<=365;i++){
	    
	            if(aritilansu<=30000){
	                fiyat=gun*2.5;
	            }else if(aritilansu>30000 && aritilansu<=50000){
	                fiyat=gun*3;
	            }else if(aritilansu>50000){
	                fiyat=gun*3.5;
	            }
	            aritilansu=aritilansu+5000;
	            toplam=toplam+ fiyat;
	            System.out.println(i+". Gün Sonunda Masraf = "+toplam+" TL");
	        }
}
}
