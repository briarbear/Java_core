package design_pattern.build.demo2;

/**
 * 在Director中构建复杂对象，将Builder中定义的一个一个部件组装起来
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 15:44
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void getCarTogether(){
        builder.buildCarFrame();
        builder.buildEngine();
        builder.buildCarWheel();
        builder.buildSteeringWheel();
    }
}
