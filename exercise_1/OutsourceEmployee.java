package heranca_sobreposicao.exercise.exercise_1;

public final class OutsourceEmployee extends Employee {

    private Double additionalCharge;

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee() {
        super();
    }

    @Override
    public final Double payment() {
        return super.payment() + (1.1 * getAdditionalCharge());
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public String toString() {
        return getName() + " - $ " + String.format("%.2f", payment());
    }
}