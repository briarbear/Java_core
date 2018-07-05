package design_pattern.factroy.abstract_factory;

public class HairAirConditioner implements AirConditioner
{
    public void changeTemperature()
    {
        System.out.println("海尔空调温度改变中......");
    }
}