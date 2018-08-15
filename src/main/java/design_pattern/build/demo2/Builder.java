package design_pattern.build.demo2;

/**
 * 构造接口
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 15:41
 */
public interface Builder {
    void buildCarWheel(); //车轮
    void buildSteeringWheel(); //方向盘
    void buildEngine();   //发动机
    void buildCarFrame(); //车架

    Car getCar();
}
