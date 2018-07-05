package design_pattern.factroy.abstract_factory;

public class TCLFactory implements Factory
{
    public Television produceTelevision()
    {
        return new TCLTelevision();
    }

    public AirConditioner produceAirConditioner()
    {
        return new TCLAirConditioner();
    }
}
