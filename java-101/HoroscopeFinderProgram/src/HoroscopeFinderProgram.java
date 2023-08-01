import java.util.Scanner;

public class HoroscopeFinderProgram {
    public static void find() {

        int month, day;
        String burc = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = scanner.nextInt();
        System.out.print("Doğduğunuz Gün: ");
        day = scanner.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                burc = "Geçersiz giriş yaptınız ! ";
            }
        } else {
            System.out.println("Geçersiz bir ay girdiniz ! ");
        }
        System.out.println(burc);
    }
}
