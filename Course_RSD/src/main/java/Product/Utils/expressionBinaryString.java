package Product.Utils;

import Filter.lowLevelFilters.equalsFilter;
import Filter.lowLevelFilters.filter;

public class expressionBinaryString extends expression{

    String lhs;//actually should be another expression
    char op;
    String rhs;

    public expressionBinaryString(String lhs,char op ,String rhs) {
        this.lhs = lhs;
        this.op = op;
        this.rhs = rhs;
    }

    @Override
    public void setLhs(String lhs) {

    }

    @Override
    public String getLhs(){return lhs;}

    @Override
    public filter getFilter() {
        if(op == '=')return new equalsFilter().setRhs(rhs);
        return null;
    }

    @Override
    public char type() {
        return 'b';//string
    }

    @Override
    public boolean exec() {
        //other logic for trees
        return true;
    }

    @Override
    public String toString() {
        return "We need " + lhs + " " + op + " " + rhs;
    }
}
