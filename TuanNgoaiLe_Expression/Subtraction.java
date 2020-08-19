package Task1;

public class Subtraction extends BinaryExpression {
    public Expression left;
    public Expression right;

    public Subtraction(Expression _l, Expression _r){
        this.left = _l;
        this.right = _r;
    }

    @Override
    public String toString(){
        return left.toString() + "-" + right.toString();
    }

    @Override
    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }
}
