public class Instrument extends StockItem {

    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private String model;

    public Instrument(String itemName, String brand, double tradePrice, double salePrince, String material, String colour, InstrumentType instrumentType, String model) {
        super(itemName, brand, tradePrice, salePrince);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.model = model;
    }
}
