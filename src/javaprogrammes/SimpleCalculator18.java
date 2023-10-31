package javaprogrammes;

public class SimpleCalculator18 {
    double firstnumber;
    double secondnumber;

    public double getFirstnumber(){
        return firstnumber;
    }
    public double getSecondnumber(){
        return secondnumber;
    }
    public void setFirstnumber(double firstnumber){
        this.firstnumber = firstnumber;
    }
    public void setSecondnumber(double secondnumber){
        this.secondnumber = secondnumber;
    }
    public double getAdditionResult(){
        return firstnumber + secondnumber;
    }
    public double getSubtractionResult(){
        return firstnumber - secondnumber;
    }
    public double getMultiplicationResult(){
        return firstnumber * secondnumber;
    }
    public double getDivisionResult() {
        if (secondnumber == 0) {
            return 0;
        }
        return  firstnumber / secondnumber;
    }

    public static void main(String[] args) {
        SimpleCalculator18 s = new SimpleCalculator18();
        s.setFirstnumber(5.0);
        s.setSecondnumber(4);

        System.out.println("add= " + s.getAdditionResult());
        System.out.println("sub= " + s.getSubtractionResult());

        s.setFirstnumber(5.25);
        s.setSecondnumber(0);

        System.out.println("multiply= " + s.getMultiplicationResult());
        System.out.println("divide= " + s.getDivisionResult());
    }
}
