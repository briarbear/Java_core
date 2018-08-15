package design_pattern.adapter;

/**
 * 测试客户类
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-14 19:07
 */
public class Client {

    /**
     * 适配器模式:
     * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
     * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
     * 如题目，手机充电器一般都是5V左右吧，咱天朝的家用交流电压220V，所以手机充电需要一个适配器（降压器）
     */
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());

        mobile.inputPower(v5Power);
    }
}
