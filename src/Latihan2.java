public class Latihan2 {
    public static void main(String[] args) {
    var nilai = 90;
    var absen = 90;

    if (nilai >= 90 && absen >= 90)
        System.out.println("Bagus Sekali");
    else if (nilai >= 80 && absen >= 80)
        System.out.println("Bagus");
    else if (nilai >= 70 && absen >= 70)
        System.out.println("Cukup Bagus");
    else if (nilai >= 60 && absen >= 60)
        System.out.println("Tolong perbaiki");
    else
        System.out.println("Silahkan coba lagi tahun depan");

    }
}
