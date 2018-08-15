package design_pattern.build.demo2;

/**
 * 客户端测试类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 16:15
 */
public class Client {

    public static void main(String[] args) {
        BenzBuilder benzBuilder = new BenzBuilder();
        BMWBuilder bmwBuilder = new BMWBuilder();

        Director benzDirector = new Director(benzBuilder);
        benzDirector.getCarTogether();

        Car benz = benzBuilder.getCar();
        benz.run();

        System.out.println("------------------");
        Director bmwDirector = new Director(bmwBuilder);
        bmwDirector.getCarTogether();

        Car bmw = bmwBuilder.getCar();
        bmw.run();
    }
}
