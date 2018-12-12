package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:55 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
