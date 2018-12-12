package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:38 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
