import org.junit.Assert;
import org.junit.Test;
import ru.job4j.start.*;

/**
 * Created by Анна on 28.10.2017.
 */
public class StubInputTest {

   @Test
   public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
       Tracker tracker = new Tracker();     // создаём Tracker
       Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
       new StartUi(input).init();     //   создаём StartUI и вызываем метод init()
       //Assert.assertThat(tracker.findAll()[0].getName(), is("test name"));      // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
   }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Task item = tracker.add(new Task());
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"1", item.getId(), "test name", "desc", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUi(input).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
       // Assert.assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }


}
