package Filter.lowLevelFilters;

public class rangeFilter implements filter<Double>{

    private int min;
    private int max;

    private double value;

    @Override
    public Boolean executeFilter() {
        return value >= min && value <= max;
    }

    @Override
    public rangeFilter setValue(Double _value) {
        value = _value;
        return null;
    }

    void setMin(int _min){min = _min;};
    void setMax(int _max){max = _max;};


}
