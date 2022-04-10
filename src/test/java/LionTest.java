import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actualKittensCount = lion.getKittens();
        int expectedKittenCount = 0;
        assertEquals(actualKittensCount, expectedKittenCount);
    }

    @Test
    public void doesHaveManeLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());

    }

    @Test
    public void doesntHaveManeLionTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
    }

    @Test
    public void exceptionLionGenderTest() throws Exception {

        try {Lion lion = new Lion("Пацан", feline);} catch (Exception exception) {
            assertEquals(exception.getMessage(), "Используйте допустимые значения пола животного - самец или самка");
        }

    }
}
