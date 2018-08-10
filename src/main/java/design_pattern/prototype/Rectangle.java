package design_pattern.prototype;

import lombok.Setter;

/**
 * 矩形
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-10 15:19
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Ractangle->draw()...");
    }
}
