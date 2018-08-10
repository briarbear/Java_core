package design_pattern.prototype;

/**
 * 测试主类
 *  http://www.runoob.com/design-pattern/prototype-pattern.html
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-10 15:45
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        shape.draw();
    }
}
