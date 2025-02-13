package Filter.lowLevelFilters;

public class equalsFilter implements filter<String> {

    public String value;
    public String rhs;

    @Override
    public Boolean executeFilter() {
        return rhs.equalsIgnoreCase(value);
    }

    public filter<String> setRhs(String rhs) {
        this.rhs = rhs;
        return this;
    }

    @Override
    public filter<String> setValue(String value) {
        this.value = value;
        return this;
    }
}
