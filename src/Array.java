public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Mohamad";
        stringArray[1] = "Alvin";
        stringArray[2] = "Makmun";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = {
                "Eko", "Kurniawan" ,"Kennedy"
        };

        long[] arrayLong = {
           10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugroho"},
                {"joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
