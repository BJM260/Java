package threadpool;

import java.util.concurrent.ThreadPoolExecutor;

public interface RejectedExecutionHandler {
    void rejectedExecution(Runnable r, ThreadPoolExecutor executor);

    public static class CallerRunsPolicy implements RejectedExecutionHandler{
        public CallerRunsPolicy(){

        }

        public void rejectedExecution(Runnable r, ThreadPoolExecutor e){
            if(!e.isShutdown())
                r.run();
        }
    }
}
