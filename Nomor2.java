import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        int totalOmzet = 0;
        int biayaTrip = 13000;
        Scanner input = new Scanner(System.in);

         try {
                System.out.println("Masukkan Nama Driver (Beliau/Mereka/Kita) :"); 
                String nama = input.nextLine();

                System.out.print("Masukkan lama trip: ");
                int lamaTrip = input.nextInt();

                System.out.println("Input lagi? (Y/N)");
                String lagi = input.nextLine();
                String lanjut = "";
                switch (lagi) {
                    case 1:
                        lagi = "Y";
                        break;
                    case 2:
                        lagi = "N";
                        break;
                    default:
                      System.out.println("Driver: " + nama);
                      System.out.println("lama trip: " + lamaTrip);
                      System.out.println("total trip" + (lamaTrip));
                return;

                System.out.println("Total trip semua driver: " + ( lamaTrip ));
                System.out.println("Omzet tertinggi diperoleh " + nama + " dengan total omzet " + (lamaTrip *biayaTrip));

            } 
        }
    }
}
