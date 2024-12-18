package Filter.lowLevelFilters;


public interface filter<V>{

    public Boolean executeFilter();
    public void setValue(V value);
}
