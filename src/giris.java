import java.util.Scanner;

public class giris {
    public static void main(String[] args) {
        String password, cevapeh, yenisifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz:");
        password = input.nextLine();
        if (password.equals("kerem")) {
            System.out.print("Sifre kabul edildi.");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? E/H");
            cevapeh = input.nextLine();
            if (cevapeh.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz:");
                yenisifre = input.nextLine();
                if (yenisifre.equals("kerem")) {
                    System.out.print("Şifreniz daha önce kullandıklarınızdan farklı olmalı");
                } else {
                    System.out.print("şifreniz değitirildi.");
                }
            } else if (cevapeh.equals("H")) {
                System.out.print("Program bitti.");
            }
        }

    }
}

