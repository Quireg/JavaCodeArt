import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilTest {
    @Test
    public void testFindMax(){
        int[] inTest = {1,2,53,23,12};
        int inTestMax = 53;
        int result =  ArrayUtil.findMax(inTest);
        Assert.assertEquals(inTestMax, result);
    }
    @Test
    public void testFindMin(){

    }
}
