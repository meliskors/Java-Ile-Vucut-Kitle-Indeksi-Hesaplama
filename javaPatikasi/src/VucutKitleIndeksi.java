import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu(metre cinsinden) Giriniz: ");
        double boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        double kilo = inp.nextDouble();

        double vki = kilo/(boy*boy); 
        System.out.println("Vücut Kitle İndeksiniz: " +vki);

    }

}
