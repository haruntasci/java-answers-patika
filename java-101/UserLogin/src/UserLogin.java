package org.example;

import java.util.Scanner;

public class UserLogin {

    public static void login() {
        String userName, password, select, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            select = input.nextLine();

            if (select.equalsIgnoreCase("Evet")) {
                System.out.println("Yeni şifreyi giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }

        }

    }


}
