import org.junit.Test;
import ru.job4j.start.ConsoleInput;
import ru.job4j.start.Input;
import ru.job4j.start.Item;
import ru.job4j.start.Tracker;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

/**
 * Created by Анна on 28.10.2017.
 */
public class StunInputTest {
//    @Test
//    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
//        Tracker tracker = new Tracker();     // создаём Tracker
//        Input input = new ConsoleInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
//        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
//        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
//    }
//
//    @Test
//    public void whenUpdateThenTrackerHasUpdatedValue() {
//        // создаём Tracker
//        Tracker tracker = new Tracker();
//        //Напрямую добавляем заявку
//        Item item = tracker.add(new Item());
//        //создаём StubInput с последовательностью действий
//        Input input = new StubInput(new String[]{"1", item.getId(), "test name", "desc", "6"});
//        // создаём StartUI и вызываем метод init()
//        new StartUI(input, tracker).init();
//        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
//        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
//    }
}
