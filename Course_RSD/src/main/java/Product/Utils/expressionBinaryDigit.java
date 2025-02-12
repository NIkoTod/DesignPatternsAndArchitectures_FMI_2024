package Product.Utils;

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
    public boolean exec() {
        return false;
    }

    @Override
    public String toString() {
        return "We need " + lhs + " " + op + " " + rhs;
    }
}
