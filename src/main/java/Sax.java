public class Sax extends Instrument{

    private SaxType saxType;

    public Sax(String itemName, String brand, double tradePrice, double salePrince, String material, String colour, InstrumentType instrumentType, String model, SaxType saxType) {
        super(itemName, brand, tradePrice, salePrince, material, colour, instrumentType, model);
        this.saxType = saxType;
    }

    public SaxType getSaxType() {
        return saxType;
    }

    public void setSaxType(SaxType saxType) {
        this.saxType = saxType;
    }
}
