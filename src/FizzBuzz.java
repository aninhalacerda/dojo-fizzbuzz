
public class FizzBuzz {
    public static String fizzbuzz(int input) {
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (output.isEmpty()) {
            output = String.valueOf(input);
        }
        return output;
    }

    public static String[] fizzbuzzSecuencia(int input) {
        String[] output = new String[input];
        for (int i = 1; i <= input; i++) {
            output[i-1] = fizzbuzz(i);
        }
        return  output;
    }
}
