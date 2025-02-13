package Filter.lowLevelFilters;

public class biggerThanFilter implements filter<Double>{

    private double min;
    private double value;

    @Override
    public Boolean executeFilter() {
        return value > min;
    }



    public biggerThanFilter setMin(double min) {this.min = min;return this;}

    @Override
    public biggerThanFilter setValue(Double _value) {
        value = _value;
        return this;
    }
}
