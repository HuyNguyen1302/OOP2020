package Task1;

public class Division extends BinaryExpression {
    public Division(Expression _l, Expression _r){
        this.left = _l;
        this.right = _r;
    }

    @Override
    public String toString(){
        String div;
        if (left instanceof Square || left instanceof Division
                || left instanceof Numeral || left instanceof Multiplication){
            div = left.toString() + "/";
        } else {
            div = "(" + left.toString() + ")";
        }
        if (right instanceof Numeral || right instanceof Square || right instanceof Multiplication){
            div += right.toString();
        } else {
            div += ("("+ right.toString() + ")");
        }
        return div;
    }

    @Override
    public int evaluate(){
        return left.evaluate()/right.evaluate();
    }
}
