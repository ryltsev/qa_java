import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void catSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(actualSound, expectedSound);
    }

    @Test
    public void foodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        List<String> actualFood = cat.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

    }
}
