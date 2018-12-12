package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:37 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class OctalObserver  extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
