package SpringObserver;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationLister implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("spring容器初始化完成，你可以初始化你自己的数据啦");
    }
}
