package Task1;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public  String toString(){
        if (expression instanceof Numeral){
            return expression.toString() + "^2";
        }
        return "(" + expression.toString() + ")";
    }

    @Override
    public int evaluate(){
        return (int) Math.pow((double)expression.evaluate(), 2);
    }
}
