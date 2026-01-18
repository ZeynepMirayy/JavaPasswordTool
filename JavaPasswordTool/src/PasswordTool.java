import java.util.Scanner;

public class PasswordTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Java Sifre Analiz Araci ---");
        
        System.out.print("Analiz etmek istediginiz sifreyi girin: ");
        String password = scanner.nextLine();
        
        int puan = sifreGucuHesapla(password);
        System.out.println("Sifre Gucu: " + puan + "/5");
        
        if (puan < 3) System.out.println("Sonuc: Zayif sifre!");
        else if (puan < 5) System.out.println("Sonuc: Orta seviye sifre.");
        else System.out.println("Sonuc: Guclu sifre!");
        
        scanner.close();
    }

    public static int sifreGucuHesapla(String password) {
        int puan = 0;
        if (password.length() >= 8) puan++;
        if (password.matches(".*[a-z].*")) puan++;
        if (password.matches(".*[A-Z].*")) puan++;
        if (password.matches(".*[0-9].*")) puan++;
        if (password.matches(".*[!@#$%^&*].*")) puan++;
        return puan;
    }
}
