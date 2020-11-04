/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:19 SA
 */

public class FOO extends StrategySolution {
    private int state = 1;

    @Override
    protected void start() {
        System.out.println("Start...");
    }

    @Override
    boolean nextTry() {
        System.out.println("NextTry-" + (state++) + " ");
        return true;
    }

    @Override
    boolean isSolution() {
        System.out.println("IsSolution-" + (state == 3) + " ");
        return (state == 3);
    }

    @Override
    protected void stop() {
        System.out.println("Stop...");
    }
}
