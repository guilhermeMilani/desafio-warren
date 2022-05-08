public class Desafio1 {
    public static int inverter(int num) {
        int result = 0;
        while (num > 0 ) {
            result = 10*result+num%10;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if ((i+ inverter(i)) % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
