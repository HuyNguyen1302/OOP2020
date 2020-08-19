package Task1;

public class Multiplication extends BinaryExpression {
    public Expression left;
    public Expression right;

    public Multiplication(Expression _l, Expression _r){
        this.left = _l;
        this.right = _r;
    }

    @Override
    public String toString(){
        String mul;
        if(left instanceof Numeral || left instanceof Square ||
                left instanceof Division || left instanceof Multiplication){
            mul = left.toString()+"*";
        } else {
            mul= "(" + left.toString() +")";
        }
        if(right instanceof Numeral|| right instanceof Square ||
                right instanceof Division || right instanceof Multiplication){
            mul = right.toString();
        } else {
            mul = ("("+ right.toString()+ ")");
        }
        return mul;
    }

    @Override
    public int evaluate(){
        return left.evaluate() * right.evaluate();
    }
}
