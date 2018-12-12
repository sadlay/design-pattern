package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:37 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
