


import lesson_6.ArrayCheck;
import org.junit.Assert;
import org.junit.Test;

public class TestDigitSearch {
    @Test
    public void test4_1(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{1,4,1,2,3};
        Assert.assertArrayEquals(new int[]{1,2,3}, arrayCheck.find4(inputArray));
    }

    @Test
    public void test4_2(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{4,1,1,2,3};
        Assert.assertArrayEquals(new int[]{1,1,2,3}, arrayCheck.find4(inputArray));
    }

    @Test(expected = RuntimeException.class)
    public void test4_3() throws RuntimeException {
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{1,5,1,2,3};
        Assert.assertArrayEquals(new int[]{}, arrayCheck.find4(inputArray));
    }

    @Test
    public void test41_1(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{1,1,1,1,4};
        Assert.assertEquals(true, arrayCheck.find1and4(inputArray));
    }

    @Test
    public void test41_2(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{1,4,4,4,4};
        Assert.assertEquals(true, arrayCheck.find1and4(inputArray));
    }

    @Test
    public void test41_3(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{1,1,1,1,1};
        Assert.assertEquals(false, arrayCheck.find1and4(inputArray));
    }

    @Test
    public void test41_4(){
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{4,4,4,4,4};
        Assert.assertEquals(false, arrayCheck.find1and4(inputArray));
    }

    @Test(expected = RuntimeException.class)
    public void test41_5() throws RuntimeException
    {
        ArrayCheck arrayCheck = new ArrayCheck();
        int[] inputArray = new int[]{5,4,4,4,4};
        arrayCheck.find1and4(inputArray);
    }
}
