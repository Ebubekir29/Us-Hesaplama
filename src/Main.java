import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k,r,toplam=1;
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        k = scan.nextInt();
        System.out.print("Ussu giriniz : ");
        r = scan.nextInt();

        for(int i =1;i<=r;i++)
        {
            toplam *=k;
        }
        System.out.println("Toplam = "+toplam);
    }
}
