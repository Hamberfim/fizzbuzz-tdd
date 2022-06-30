import org.example.FizzBuzzCheck;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    // first assumption - return a string
    // Test 1, need a String array of known size or an ArrayList of unknown size
    @Test
    public void fizzBuzzIsStringTest() {
        FizzBuzzCheck fizzBuzz = new FizzBuzzCheck();

        // first index of an assumed String array of int/numbers
        Assert.assertEquals("1", fizzBuzz.FizzBuzzChecker(1));
    }

    // Test 2, is it divisible by 3?
    @Test
    public void fizzBuzzIsDivByThreeTest() {
        FizzBuzzCheck fizzBuzz = new FizzBuzzCheck();

        // if true, return "Fizz", if false, return the number
        Assert.assertEquals("Fizz", fizzBuzz.FizzBuzzChecker(3));
    }

    // Test 3, is it divisible by 5?
    // if true, return "Buzz", if false, return the number
    @Test
    public void fizzBuzzIsDivByFiveTest() {
        FizzBuzzCheck fizzBuzz = new FizzBuzzCheck();

        // if true, return "Buzz", if false, return the number
        Assert.assertEquals("Buzz", fizzBuzz.FizzBuzzChecker(5));
    }

    // Test 4, is it divisible by 3 and 5?
    @Test
    public void fizzBuzzDivByThreeAndFiveTest() {
        FizzBuzzCheck fizzBuzz = new FizzBuzzCheck();

        // if true, return "FizzBuzz", if false, return the number
        Assert.assertEquals("FizzBuzz", fizzBuzz.FizzBuzzChecker(15));
    }

    // loop through length of fixed length array - and a refactor to ArrayList

}
