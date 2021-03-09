package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Clock {
    /**
     * 建立一对多的关系
     */
    private List<AbstractAction> list = new ArrayList<AbstractAction>();

    /**
     * 通知的对象有哪些
     * @param action
     */
    public void add(AbstractAction action){
        list.add(action);
    }

    /**
     * 时间到了通知各个对象
     */
    public void notice(){
        for (AbstractAction action : list) {
            action.action();
        }
    }

}
