public class MethodVariableArgument {
    static void main() {

        int[] values = {88, 58, 58, 88};
    sayCongrats("Alvin", values );
    
    sayCongrats("Budi", 88, 98, 76, 88);
    }

    private static void sayCongrats(String budi, int i, int i1, int i2, int i3) {

    }

    static void sayCongrats(String name, int [] values){
        var total = 0;
        for (var value : values){
           total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("selamat " + name + ",Anda Lulus");
        } else {
            System.out.println("Maaf " + name+ ",Anda Tidak Lulus");
        }
    }
}
