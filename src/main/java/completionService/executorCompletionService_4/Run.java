package completionService.executorCompletionService_4;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 11:29 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo();
            MyRunable myRunable = new MyRunable(userInfo);

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService completionService = new ExecutorCompletionService(executorService);

            Future<UserInfo> future = completionService.submit(myRunable, userInfo);

            System.out.println(future.get().getUsername() + "  " + future.get().getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
