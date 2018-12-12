package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:55 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
