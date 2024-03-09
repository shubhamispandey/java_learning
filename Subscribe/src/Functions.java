public class Functions {
    public static void main(String[] args) {
        // factorial
//        int f = fact(5);
//        System.out.println(f);
        // SumOfDigit
//        sumOfDigit(25);
    }
    public static int fact(int n){
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }

    public static void sumOfDigit(int n){
        int sum = 0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }

    public static void lcm(int n1, int n2) {

    }
}
