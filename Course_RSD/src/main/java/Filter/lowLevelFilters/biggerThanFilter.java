package Filter.lowLevelFilters;

public class biggerThanFilter implements filter<Integer>{

    private int min;
    private int value;

    @Override
    public Boolean executeFilter() {
        return value > min;
    }

    @Override
    public void setValue(Integer _value) {
        value = _value;
    }
}
