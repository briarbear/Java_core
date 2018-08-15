package design_pattern.build.demo2;

/**
 * 奔驰构造器
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 15:48
 */
public class BenzBuilder implements Builder {
    private Benz benz;

    public BenzBuilder() {
        benz = new Benz();
    }

    @Override
    public void buildCarWheel() {
        System.out.println("Benz add Wheel");
    }

    @Override
    public void buildSteeringWheel() {
        System.out.println("Benz add SteeringWheel");
    }

    @Override
    public void buildEngine() {
        System.out.println("Benz add engine");
    }

    @Override
    public void buildCarFrame() {
        System.out.println("Benz add frame");
    }

    @Override
    public Car getCar() {
        return benz;
    }
}