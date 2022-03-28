import java.util.Scanner;
public class sayiKuvvetleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Bir Sayı Giriniz:");
        a=input.nextInt();

        for (int i=1; i<=a; i *= 5){
            System.out.println(i);
        }
        for (int i=1; i<=a; i *= 4){
            System.out.println(i);
        }

    }
}
