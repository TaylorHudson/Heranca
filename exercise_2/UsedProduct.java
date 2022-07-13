package heranca_sobreposicao.exercise.exercise_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

    SimpleDateFormat spdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    @Override
    public final String priceTag(){
        return getName() + "(used) $ " + getPrice() + " (Manufacture date: " + spdf.format(getManufactureDate()) + ")";
    }

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    } 
    
}
