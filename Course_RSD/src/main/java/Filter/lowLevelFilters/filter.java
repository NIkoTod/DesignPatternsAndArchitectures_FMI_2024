package Filter.lowLevelFilters;


public interface filter<V>{



    public Boolean executeFilter();
    public filter<V> setValue(V value);
}
