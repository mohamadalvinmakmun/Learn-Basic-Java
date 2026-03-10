public class IfStatment {
    public static void main(String[] args) {

        var nilai = 60;
        var absen = 60;

        if (nilai >= 75 && absen >= 75 ) {
            System.out.println("selamat anda lulus");
        } else if (nilai >= 60 && absen >=60 ) {
            System.out.println("Nilai angka uhuy");
        } else {
            System.out.println("Silahkan coba lagi tahun depan");
        }
    }
}
