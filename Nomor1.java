import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        int totalHonor = 0;
        int jamLembur;
        double honorPerJam;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam lembur anda:");
        jamLembur = input.nextInt();

        for (int i = 1; i <= jamLembur; i++) {
            if (i > 16 ) {
                if (jamLembur <= 16) {
                    jamLembur = jamLembur * 10000;
                }
                        else {
                            jamLembur = jamLembur * 15000;
                        }
                    }
                    totalHonor += jamLembur;
                }
        System.out.println("Total jam lembur anda: " + jamLembur);
        System.out.println("Total Honor lembur anda: " + (totalHonor += jamLembur));

    }
}
