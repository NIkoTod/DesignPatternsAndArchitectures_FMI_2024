package Product.Utils;

import Filter.lowLevelFilters.biggerThanFilter;
import Filter.lowLevelFilters.filter;
import Filter.lowLevelFilters.lessThenFilter;

public class expressionBinaryDigit extends expression {
    String lhs;
    char op;
    double rhs;

    public expressionBinaryDigit(String lhs, char op, double rhs) {
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
        if(op == '>') return (new biggerThanFilter().setMin(rhs));
        if(op == '<') return (new lessThenFilter().setMax(rhs));
        return null;
    }

    @Override
    public char type() {
        return 'a';//digit
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
