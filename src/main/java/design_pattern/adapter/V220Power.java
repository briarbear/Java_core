package design_pattern.adapter;

/**
 * 家用220V交流电
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 18:57
 */
public class V220Power {

    /**
     * 提供220V电压
     */
    public int provideV220Power(){
        System.out.println("我提供220V的交流电");
        return 220;
    }
}
