package design_pattern.build;

import java.util.ArrayList;

/**
 * 测试主类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 15:30
 */
public class BuildDemo {
    public static void main(String[] args) {
        ArrayList hands = new ArrayList<String>();
        hands.add("left");
        hands.add("right");
        ArrayList legs = new ArrayList<String>();
        legs.add("left");
        legs.add("right");
        Toy toy = new Toy.Builder().setBody("body").setHands(hands).setLegs(legs).setHead("head").build();
        System.out.println(toy.getBody());

    }
}
