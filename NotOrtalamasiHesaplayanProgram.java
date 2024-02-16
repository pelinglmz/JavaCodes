package slaytAlistirma;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
		
		//BMG , fizik , matematik , java, edebiyat , ingilizce
		
		// DERS1 BMG a %10 quiz, b %30 vize ,c %60 final *** 3 kredi
		// DERS2 fizik d %10 quiz , e %30 vize , f %60 final *** 4 kredi
		// DERS3 mat g %40 vize ,h %60 final *** 4 kredi
		// DERS4 java i %30 quiz ve proje ,j %30 vize ,k %40 final ***4 kredi
		// DERS5 edebiyat l %40 vize,m %60 final *** 2 kredi
		// DERS6 ingilizce n %40 vize ,o %60 final *** 2 kredi
		
		
		Scanner scan=new Scanner (System.in);
		double a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,ders1,ders2,ders3,ders4,ders5,ders6,ortalama;

		System.out.print("BMG quiz notunu giriniz : ");
		a=scan.nextDouble();
		System.out.print("BMG vize notunu giriniz : ");
		b=scan.nextDouble();
		System.out.print("BMG final notunu giriniz : ");
		c=scan.nextDouble();
		System.out.print("Fizik quiz notunu giriniz : ");
		d=scan.nextDouble();
		System.out.print("Fizik vize notunu giriniz : ");
		e=scan.nextDouble();
		System.out.print("Fizik final notunu giriniz : ");
		f=scan.nextDouble();
		System.out.print("Mat vize notunu giriniz : ");
		g=scan.nextDouble();
		System.out.print("Mat final notunu giriniz : ");
		h=scan.nextDouble();
		System.out.print("Java quiz notunu giriniz : ");
		i=scan.nextDouble();
		System.out.print("Java vize notunu giriniz : ");
		j=scan.nextDouble();
		System.out.print("Java final notunu giriniz : ");
		k=scan.nextDouble();
		System.out.print("Edebiyat vize notunu giriniz : ");
		l=scan.nextDouble();
		System.out.print("Edebiyat final notunu giriniz : ");
		m=scan.nextDouble();
		
		/*
		System.out.print("İng vize notunu giriniz : ");
		n=scan.nextDouble();
		System.out.print("İng final notunu giriniz : ");
		o=scan.nextDouble();
	   */
		ders1=(a*0.10)+(b*0.30)+(c*0.60);
		ders2=(d*0.10)+(e*0.30)+(f*0.60);
		ders3=(g*0.40)+(h*0.60);
		ders4=(i*0.30)+(j*0.30)+(k*0.40);
		ders5=(l*0.40)+(m*0.60);
		// ders6=(n*0.40)+(o*0.60);
		
		ortalama=((ders1*3)+(ders2*4)+(ders3*4)+(ders4*4)+(ders5*2))/17;
		
		System.out.println();
		System.out.println("BMG not ortalamanız :" +ders1);
		System.out.println("fizik not ortalamanız :"+ders2);
		System.out.println("Mat nor ortalamanız :" +ders3);
		System.out.println("Java not ortalamanız :" + ders4);
		System.out.println("Edebiyat not ortalamanız :" +ders1);
		System.out.println();
		System.out.println("Dönem sonu genel not ortalamanız :" + ortalama);
		System.out.println();
        System.out.println("Dönem sonu harf notunuz :");
        
        if(ortalama>=90)
        	System.out.println("AA");
        else if(85<=ortalama||ortalama<=89)
        	System.out.println("BA");
        else if(80<=ortalama||ortalama<=84)
        	System.out.println("BB");
        else if(75<=ortalama||ortalama<=79)
        	System.out.println("CB");
        else if(70<=ortalama||ortalama<=74)
        	System.out.println("CC");
        else if(65<=ortalama||ortalama<=69)
        	System.out.println("DC");
        else if(60<=ortalama||ortalama<=64)
        	System.out.println("DD");
        else if(50<=ortalama||ortalama<=59)
        	System.out.println("FD");
        else if(ortalama<49)
        	System.out.println("FF");
        
        
	
        
	}

}
