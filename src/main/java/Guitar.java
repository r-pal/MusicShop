public class Guitar extends Instrument implements IPlay{
    public Guitar(String itemName, String brand, double tradePrice, double salePrince, String material, String colour, InstrumentType instrumentType, String model, boolean electric) {
        super(itemName, brand, tradePrice, salePrince, material, colour, instrumentType, model, electric);
    }

    @Override
    public String iPlay() {
        return "twang twang";
    }

    @Override
    public double calculateMarkUp() {
        return (salePrince - tradePrice);
    }
}
