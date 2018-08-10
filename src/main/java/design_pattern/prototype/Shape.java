package design_pattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * Shape抽象类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-10 14:55
 */
public abstract class Shape implements Cloneable{


    @Getter
    @Setter
    private String id;

    abstract void draw();

    @Getter
    protected String type;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        clone = super.clone();

        return clone;
    }
}
