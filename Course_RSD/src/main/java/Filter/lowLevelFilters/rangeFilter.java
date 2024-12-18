package Filter.lowLevelFilters;

public class rangeFilter implements filter<Integer>{

    private int min;
    private int max;

    private int value;

    @Override
    public Boolean executeFilter() {
        return value >= min && value <= max;
    }

    @Override
    public void setValue(Integer _value) {
        value = _value;
    }
    void setMin(int _min){min = _min;};
    void setMax(int _max){max = _max;};


}
