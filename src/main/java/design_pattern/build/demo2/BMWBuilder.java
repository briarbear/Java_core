package design_pattern.build.demo2;

/**
 * 宝马构造器
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 16:12
 */
public class BMWBuilder implements Builder {
    private BMW bmw ;

    public BMWBuilder(){
        bmw = new BMW() ;
    }

    @Override
    public void buildCarWheel() {
        System.out.println("BMW add CarWheel");
    }


    @Override
    public void buildSteeringWheel() {
        System.out.println("BMW add SteeringWheel");
    }


    @Override
    public void buildEngine() {
        System.out.println("BMW add Engine");
    }


    @Override
    public void buildCarFrame() {
        System.out.println("BMW add Frame");
    }


    @Override
    public Car getCar() {
        return bmw;
    }

}
