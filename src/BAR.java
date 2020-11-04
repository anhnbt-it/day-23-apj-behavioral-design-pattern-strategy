/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:26 SA
 */

public class BAR extends StrategySearch {
    private int state = 1;

    @Override
    void preProcess() {
        System.out.println("PreProcess...");
    }

    @Override
    boolean search() {
        System.out.println("Search-" + (state++));
        return (state == 3) ? true : false;
    }

    @Override
    void postProcess() {
        System.out.println("PostProcess...");
    }
}
