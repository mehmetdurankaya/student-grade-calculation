package studentgradecalculation;

import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik; //variable declaration

        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=scan.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=scan.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=scan.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=scan.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik=scan.nextInt();

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
