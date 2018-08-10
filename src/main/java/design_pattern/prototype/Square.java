package design_pattern.prototype;

import lombok.Setter;

/**
 * 正方形
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-10 15:25
 */
@Setter
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square->draw()...");
    }

    public Square() {
        type = "Square";
    }
}
