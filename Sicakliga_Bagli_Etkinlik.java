import java.util.Scanner;

public class Sicakliga_Bagli_Etkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int isi;
        System.out.print("Sicaklik giriniz: ");
        isi = inp.nextInt();

        if (isi < 5){
            System.out.println("Kayak yapabilirsiniz");

        }
        else if(isi <= 25){
            if(isi <= 15){
                System.out.println("Sinemaya gidebilirsiniz");

            } if(isi >= 10){
                System.out.println("Piknige gidebilirsiniz");
            }
            else {
                System.out.println("Yüzebilirsiniz");
            }
        }
    }
}
