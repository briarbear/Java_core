package design_pattern.factroy.abstract_factory;

public class HaierFactory implements Factory
{
    public Television produceTelevision()
    {
        return new HaierTelevision();
    }

    public AirConditioner produceAirConditioner()
    {
        return new HairAirConditioner();
    }
}