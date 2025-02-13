package Product.Utils;

import Filter.lowLevelFilters.filter;

public abstract class expression{

    public abstract void setLhs(String lhs);
    public abstract String getLhs();
    public abstract boolean exec();
    public abstract filter getFilter();
    public abstract char type();

}
