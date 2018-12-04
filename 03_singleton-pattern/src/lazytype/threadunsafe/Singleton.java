package lazytype.threadunsafe;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 11:10 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Singleton {

    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }


}
