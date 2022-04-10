import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFoodFelineTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualEatMeat = feline.eatMeat();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(actualEatMeat, expectedEatMeat);
    }

    @Test
    public void getFamilyFelineTest() {
        Feline feline = new Feline();

        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(actualFamily, expectedFamily);
    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();

        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(actualKittensCount, expectedKittensCount);
    }
}
