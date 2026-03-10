public class Latihan7 {
    static void main() {
        var nilai = 67;
        var absen = 89;

        if (nilai >= 90 && absen >= 90)
            System.out.println("Bagus Sekali");
        else if (nilai >= 80 && absen >= 80)
            System.out.println("Bagus");
        else if (nilai >= 70 && absen >= 70)
            System.out.println("Cukup Bagus");
        else if (nilai >= 60 && absen >= 60)
            System.out.println("Tolong Perbaiki");
        else
            System.out.println("Lebih giat Lagi yaa");

    }
}
