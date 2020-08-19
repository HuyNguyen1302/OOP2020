package Task1;

public class Addition extends BinaryExpression {

    public Addition(Expression _l, Expression _r){
        this.left = _l;
        this.right = _r;
    }

    @Override
    public String toString(){
        return left.toString() + "+" + right.toString();
    }

    @Override
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }
}
