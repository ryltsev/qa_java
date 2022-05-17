import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
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

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void exceptionLionGenderTest() throws Exception {

        exception.expect(Exception.class);
        exception.expectMessage(equalTo("Используйте допустимые значения пола животного - самец или самка"));
        Lion lion = new Lion("Пацан", feline);
    }
}
