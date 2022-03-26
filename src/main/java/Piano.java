public class Piano extends Instrument implements IPlay {
    public Piano(String itemName, String brand, double tradePrice, double salePrince, String material, String colour, InstrumentType instrumentType, String model, boolean electric) {
        super(itemName, brand, tradePrice, salePrince, material, colour, instrumentType, model, electric);
    }

    @Override
    public String iPlay() {
        return "plink plonk";
    }

    @Override
    public double calculateMarkUp() {
        return (salePrince - tradePrice);
    }
}