/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:37 SA
 */

public class Client {
    private static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main(String[] args) {
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm: algorithms) {
            execute(algorithm);
        }
    }
}
