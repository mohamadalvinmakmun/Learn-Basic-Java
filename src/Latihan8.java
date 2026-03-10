public class Latihan8 {
    static void main() {
        var nilai = 70;
        var absen = 70;

        if (nilai >= 85 && absen >= 85)
            System.out.println("Grade A");
        else if (nilai >= 75 && absen >=75)
            System.out.println("Grade B");
        else if (nilai >= 65 && absen >=65)
            System.out.println("Grade C");
        else
            System.out.println("Tidak Lulus");
    }
}
