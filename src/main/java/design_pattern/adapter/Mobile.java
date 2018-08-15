package design_pattern.adapter;

/**
 * 手机类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 17:12
 */
public class Mobile {

    /**
     * 充电
     */
    public void inputPower(V5Power power){
        /**
         * 可以看出收集依赖一个提供5V电压的接口
         */
        int providerV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在的电压是--->" + providerV5Power + "V");

    }

}
