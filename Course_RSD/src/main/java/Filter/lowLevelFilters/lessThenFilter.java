package Filter.lowLevelFilters;

public class lessThenFilter implements filter<Integer>{

    private int max;
    private int value;

    @Override
    public Boolean executeFilter() {
        return value < max;
    }

    public void setMax(int _max) {max = _max;};
    public void setValue(Integer _value) {value = _value;};


}
