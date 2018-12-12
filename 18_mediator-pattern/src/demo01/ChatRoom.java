package demo01;

import java.util.Date;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:55 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
