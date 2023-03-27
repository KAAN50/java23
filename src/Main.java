import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int ksayi,bsayi;
        Scanner input = new Scanner(System.in);

        System.out.println("N1 saysını giriniz");
        int n1 = input.nextInt();

        System.out.println("N1 saysını giriniz");
        int n2 = input.nextInt();

        if(n1<n2)
        {
            ksayi = n1;
            bsayi =n2;
        }
        else {
            ksayi=n2;
            bsayi=n1;
        }
        int ebob = 1, i = 1;
        while (i<=ksayi) {
            if ((ksayi % i == 0) && (bsayi % i == 0)) {
                ebob = i;
            }
            i++;
        }
        int ekok = 1, j = 1;
        while (j <= (ksayi * bsayi)) {
            if ((j%ksayi== 0) && (j%bsayi == 0)) {
                ekok = j;
                break;
            }
            j++;

        }
        System.out.println("Sayıların EBOBU : " + ebob);
        System.out.println("Sayıların EKOKU : " + ekok);
    }
}