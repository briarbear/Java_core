package design_pattern.adapter;

/**
 * 适配器，把220v电压变成5V
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 19:02
 */
public class V5PowerAdapter implements V5Power {

    /**
     * 组合的方式
     */
    private V220Power v220Power;


    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {

        int power = v220Power.provideV220Power();
        //power 经过各种操作 -> 5
        System.out.println("适配器：已完成电压的转换适配");
        return 5;

    }
}
