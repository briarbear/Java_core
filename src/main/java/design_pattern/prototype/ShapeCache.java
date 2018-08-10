package design_pattern.prototype;

import lombok.var;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 形状缓存类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-10 15:27
 */
public class ShapeCache {

    private static HashMap<String,Shape> shapeMap = new HashMap<>();


    public static Shape getShape(String id) throws CloneNotSupportedException {
        Shape cache = shapeMap.get(id);
        return (Shape) cache.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        Square square = new Square();
        square.setId("2");

        shapeMap.put(rectangle.getId(),rectangle);
        shapeMap.put(square.getId(),square);


    }
}
