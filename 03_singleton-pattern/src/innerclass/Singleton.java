package innerclass;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 11:17 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Singleton {
    private Singleton(){

    }
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
}
