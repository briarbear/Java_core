package design_pattern.build;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * 玩具类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 15:23
 */
@Setter
@Getter
public class Toy {

    private String head;
    private String body;
    private ArrayList<String> legs;
    private ArrayList<String> hands;


    //静态类
    static class Builder {
        private Toy toy;

        public Builder() {
            toy = new Toy();
        }

        public Builder setHead(String head) {
            toy.setHead(head);
            return this;
        }

        public Builder setBody(String body) {
            toy.setBody(body);
            return this;
        }

        public Builder setHands(ArrayList<String> hands) {
            toy.setHands(hands);
            return this;
        }

        public Builder setLegs(ArrayList<String> legs) {
            toy.setLegs(legs);
            return this;
        }

        public Toy build(){
            return toy;
        }
    }
}
