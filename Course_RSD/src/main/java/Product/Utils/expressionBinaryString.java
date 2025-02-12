package Product.Utils;

public class expressionBinaryString extends expression{
    String rhs;
    char op;
    String lhs;

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
    public boolean exec() {
        return false;
    }

    @Override
    public String toString() {
        return "We need " + lhs + " " + op + " " + rhs;
    }
}
