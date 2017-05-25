import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void debeDevolverUnoParaUnaSecuenciaDeUno() throws Exception {
        int input = 1;
        String[] expected = {"1"};
        String[] result = FizzBuzz.fizzbuzzSecuencia(input);
        assertEquals(expected, result);
    }

    @Test
    public void debeDevolverHastaDos() {
        int input = 2;
        String[] expected = {"1", "2"};
        String[] result = FizzBuzz.fizzbuzzSecuencia(input);
        assertEquals(expected, result);
    }

    @Test
    public void debeDevolverHastaFizz() throws Exception {
        int input = 3;
        String[] expected = {"1", "2", "Fizz"};
        String[] result = FizzBuzz.fizzbuzzSecuencia(input);
        assertEquals("Se esperaba 1, 2, Fizz ", expected, result);
    }

    @Test
    public void debeDevolverHastaBuzz() throws Exception {
        int input = 5;
        String[] expected = {"1", "2", "Fizz", "4", "Buzz"};
        String[] result = FizzBuzz.fizzbuzzSecuencia(input);
        assertEquals("Se esperaba 1, 2, Fizz, 4, Buzz ", expected, result);
    }

    @Test
    public void debeDevolverHastaFizzBuzz() throws Exception {
        int input = 15;
        String[] expected = {
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"};

        String[] result = FizzBuzz.fizzbuzzSecuencia(input);
        assertEquals("Se esperaba una secuencia hasta FizzBuzz ", expected, result);
    }
}
