package lazytype.synchronizedmethod;

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
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
