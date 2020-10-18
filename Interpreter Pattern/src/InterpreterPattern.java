public class InterpreterPattern {
    public static Expression getMaleExpression(){
        Expression ex1 = new TerminalExpression("Robert");
        Expression ex2 = new TerminalExpression("John");
        return new OrExpression(ex1,ex2);
    }
    public static Expression getMarriedExpression(){
        Expression ex1 = new TerminalExpression("Julie");
        Expression ex2 = new TerminalExpression("married");
        return new AndExpression(ex1, ex2);
    }
    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedExpression();
        System.out.println("Is John a single man ? " + isMale.interpret("Is John a single man ?"));
        System.out.println("Is Julie married ? " + isMarried.interpret("Is Julie married ?"));
    }
}
