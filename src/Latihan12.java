public class Latihan12 {
    static void main() {
        var nilai = 90;
        var absen = 90;

        if (nilai >= 90 && absen >= 90)
            System.out.println("Baik sekali");
        else if (nilai >= 80 && absen >= 80)
            System.out.println("Baik");
        else if (nilai >= 70 && absen >= 70)
            System.out.println("cukup Baik");
        else if (nilai >= 60 && absen >= 60)
            System.out.println("Cukup");
        else if (nilai >= 50 && absen >= 50)
            System.out.println("Belajar Lagi ya");
        else
            System.out.println("Waduh Danger Belajar Lagi");
    }
}
