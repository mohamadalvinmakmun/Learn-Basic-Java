public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("wow anda Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin anda Salah Jurusan");

        }

        switch (nilai) {
            case "A" -> System.out.println("wow anda Lulus dengan baik");
            case "B" -> System.out.println("Nilai Anda Cukup Baik");
            case "C" -> System.out.println("Nilai Anda Cukup");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = ("wow anda Lulus dengan baik");
            case "B" -> ucapan = ("Nilai Anda Cukup Baik");
            case "C" -> ucapan = ("Nilai Anda Cukup");
            default -> ucapan = ("Mungkin anda salah jurusan");
        }
        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield ("wow anda Lulus dengan baik");
            case "B":
                yield ("Nilai Anda Cukup Baik");
            case "C":
                yield ("Nilai Anda Cukup");
            default:
                yield ("Mungkin anda salah jurusan");
        };
        System.out.println(ucapan);


    }

}