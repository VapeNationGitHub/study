import java.util.function.Function;

public class test {
    public static void main(String args[])
    {
        System.out.println(integral(x->Math.sin(x),0D,1D,10000));
    }
    public static double integral(Function<Double,Double> func,Double a,Double b, int n)
    {
        Double sum = 0D;
        Double s=(b-a)/n;
        for(int i=0;i<n;i++)
        {
            sum += func.apply(i*s);
        }
        return (sum*(b-a))/n;
    }

}

