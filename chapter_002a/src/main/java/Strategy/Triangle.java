package Strategy;

/**
 * Created by Анна on 30.10.2017.
 */
public class Triangle implements Shape {
    @Override
    public String pic() {
        StringBuilder pic = new StringBuilder();
        pic.append("+");
        pic.append("++");
        pic.append("+++");
        pic.append("++++");
        return pic.toString();
    }
}
