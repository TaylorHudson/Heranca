package heranca_sobreposicao.exercise.exercise_2;

public final class ImportedProduct extends Product{

    private Double customsFee;

    
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {
        super();
    }

    @Override
    public final String priceTag() {
        return getName() + " $ " + totalPrice() + " (Customs fee: $ " + getCustomsFee() + ")";        
    }

    public Double totalPrice(){
        Double total = getPrice() +  getCustomsFee();
        return total;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
