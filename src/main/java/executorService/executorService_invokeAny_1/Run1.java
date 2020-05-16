package executorService.executorService_invokeAny_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @date 2020/05/16
 * @time 15:42
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList<>();
            callables.add(new MyCallableA());
            callables.add(new MyCallableB1());

            ExecutorService executorService = Executors.newCachedThreadPool();
            String getValue = (String) executorService.invokeAny(callables);
            System.out.println(">>>>>>>> " + getValue);
            System.out.println(">>>>>>>>>>>>>>>>>>");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
