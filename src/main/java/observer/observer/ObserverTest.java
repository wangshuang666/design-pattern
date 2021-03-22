package observer.observer;

/**
 * 12点到了闹钟通知
 * 老师下课
 * 学生吃饭
 * 阿姨去卖饭
 */
public class ObserverTest {
    public static void main(String[] args) {
        Clock clock = new Clock();

        Teacher teacher = new Teacher();
        Student student = new Student();
        Aunt aunt = new Aunt();

        clock.add(teacher);
        clock.add(student);
        clock.add(aunt);

        clock.notice();
    }


}
