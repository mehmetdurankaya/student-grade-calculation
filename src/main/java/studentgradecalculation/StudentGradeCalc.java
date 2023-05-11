package studentgradecalculation;

import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik; //variable declaration
        boolean isTrue=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bu uygulama Sınıf geçme-kalma durumunuzu hesaplar.\n" +
                "Notlarınızı girerken 0' dan küçük ve 100' den büyük değerler girmeyiniz.\n" +
                "Girdiğiniz takdirde değerlendirmeye alınmayacaktır. Başarılar!");
        System.out.print("Matematik Notunuz: ");
        mat=scan.nextInt();
        if(mat>=0 && mat<=100){
        }else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            mat=0;
        }
//----------------------------------------------------
        System.out.print("Fizik Notunuz: ");
        fizik=scan.nextInt();
        if(fizik>=0 && fizik<=100){
        }else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            fizik=0;
        }
//----------------------------------------------------------
        System.out.print("Türkçe Notunuz: ");
        turkce=scan.nextInt();
        if(turkce>=0 && turkce<=100){
        }else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            turkce=0;
        }

//-------------------------------------------------------------
        System.out.print("Kimya Notunuz: ");
        kimya=scan.nextInt();
        if(kimya>=0 && kimya<=100){
        }else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            kimya=0;
        }
//---------------------------------------------------------------
        System.out.print("Müzik Notunuz: ");
        muzik=scan.nextInt();
        if(muzik>=0 && muzik<=100){
        }else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            muzik=0;
        }
//--------------------------------------------------------------------
       double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if (avarage<=55){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere! ");
        }else{
            System.out.println("Tebrikler Sınıfı geçtiniz! ");

        }
        System.out.println("Ortalamanız " + avarage);
        System.out.println("**************************");
        System.out.println("Not:\n55 puan ve altı Başarısız sayılmaktadır.");

    }
}
