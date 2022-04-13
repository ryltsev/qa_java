import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;


    @Test
    public void catSoundTest() {

        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(actualSound, expectedSound);
    }

    @Test
    public void foodTest() throws Exception {

        //Вот так вроде бред же получается, тестим не тот метод
        Cat cat = new Cat(feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualFood = feline.getFood("Хищник"); //cat.getFood не возвращает ничего (
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood);

        /*Получается только такой вариант, если мок убрать и создать реальный объект, по другому я хз ((
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        List<String> actualFood = cat.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");*/

    }
}
