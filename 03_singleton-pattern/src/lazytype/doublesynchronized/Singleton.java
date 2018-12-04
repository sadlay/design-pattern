package lazytype.doublesynchronized;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:56 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Singleton {

    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
