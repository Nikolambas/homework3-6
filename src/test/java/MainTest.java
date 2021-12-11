import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MainTest {

    @CsvSource({
            "12356,23412356",
            "356,457234356",
            "6,235123546"
    })


    @ParameterizedTest
    public void masGetArr(String one,String two){
        int[]result = Main.gotArr(one);
        int[]arr = Main.gotArr(two);
        Assertions.assertArrayEquals(result,Main.returnArr(arr));
    }


    @Test
    public void getArr() {
        Assertions.assertArrayEquals(new  int[]{1, 2, 3, 5, 6,}, Main.returnArr(new int[]{2,3,4,1,2,3,5,6}));
    }

    @Test
    public void getArr1() {
        Assertions.assertThrows(RuntimeException.class,()->{
            Main.returnArr(new int[]{2,3,1,2,3,5,6});
        });
    }

    @Test
    public void getArr2() {
        Assertions.assertArrayEquals(new int[0],Main.returnArr(new int[]{2,3,1,2,3,5,6,4}));
    }

    @Test
    public void getArr3() {
        Assertions.assertTrue(Main.isOneAndFour(new int[]{1,1,1,4,4,1,1,4}));
    }

    @Test
    public void getArr4() {
        Assertions.assertFalse(Main.isOneAndFour(new int[]{1,1,1,4,4,8,1,1,4}));
    }

    @Test
    public void getArr5() {
        Assertions.assertFalse(Main.isOneAndFour(new int[]{4,4,4,4}));
    }

}