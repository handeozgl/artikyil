import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input= new Scanner(System.in);
        System.out.println("yil giriniz: ");
        yil= input.nextInt();

        if ((yil%4==0) || (yil%400==0)){
            System.out.println(yil + " bir artik yil");
        }else{
            System.out.println(yil + " artik yil degil");
        }
    }
}
