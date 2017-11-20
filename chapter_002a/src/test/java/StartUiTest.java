import ru.job4j.start.Input;
import ru.job4j.start.StartUi;
import ru.job4j.start.StubInput;

/**
 * Created by Анна on 09.11.2017.
 */
public class StartUiTest {
    public static void main(String[] args) {
        Input input = new StubInput(new String[]{"create stub task"});
        new StartUi(input).init();
    }
}
