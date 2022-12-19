import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CopyTest {

    @Test
    @DisplayName("Check copying array")
    public void testCopyArray() {
        Integer[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayString = {"1", "2", "3", "4", "5"};
        for(int i=0;i<arrayInt.length;i++) {
            Assertions.assertEquals(arrayInt[i],new Copy().copyArray(arrayInt)[i]);
        }
        for(int i=0;i<arrayString.length;i++) {
            Assertions.assertEquals(arrayString[i],new Copy().copyArray(arrayString)[i]);
        }
    }

    @Test
    @DisplayName("Check multiply array")
    public void testMultiplyArrays(){
        Integer[] arrayInt1 = {1, 2, 3, 4, 5};
        Integer[] arrayInt2 = {1, 2, 3, 4, 5};
        Integer[] newArray = {1,4,10,20,35,44,46,40,25};

        for(int i=0;i<newArray.length;i++) {
            Assertions.assertEquals(newArray[i],new Copy().multiplyArrays(arrayInt1,arrayInt2)[i]);
        }

    }
}
