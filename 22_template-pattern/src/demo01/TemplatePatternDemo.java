package demo01;

import demo01.template.Game;
import demo01.template.impl.Cricket;
import demo01.template.impl.Football;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:11 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
