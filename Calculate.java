
public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate....");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        int minus = first - second;
        double del = (double)first/second;
        double stepen = Math.pow(first, 3);

        System.out.println("Sum  "+ summ);
        System.out.println("Sum  "+ minus);
        System.out.println("Sum  "+ del); 
        System.out.println("Sum  "+ stepen);
    }
}
