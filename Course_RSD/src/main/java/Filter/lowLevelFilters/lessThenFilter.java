package Filter.lowLevelFilters;

public class lessThenFilter implements filter<Double>{

    private double max;
    private double value;

    @Override
    public Boolean executeFilter() {
        return value < max;
    }


    public lessThenFilter setMax(double max) {this.max = max; return this;}

    @Override
    public lessThenFilter setValue(Double value) {
        this.value = value;
        return this;
    }



}
