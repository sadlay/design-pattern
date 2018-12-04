package hungrytype;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:42 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Singleton {
    private static Singleton instance=new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

}
