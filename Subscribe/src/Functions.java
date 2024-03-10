public class Functions {
    public static void main(String[] args) {
        // factorial
//        int f = fact(5);
//        System.out.println(f);
        // SumOfDigit
//        sumOfDigit(25);
        // hcf
//        int h = hcf(18,36);
//        System.out.println(h);
        // lcm
//         lcm(12,16);
        // prime
        prime(8);
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
        int lcm = (n1*n2)/hcf(n1,n2);
        System.out.println("lcm: "+lcm);
    }

    public static int hcf(int n1, int n2) {
        int hcf = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if(n1%i==0 && n2%i==0)
                hcf = i;
        }
        System.out.println("HCF: "+hcf);
        return hcf;
    }

    public static void prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+" is composite number");
                return;
            }
        }
        System.out.println(n+" is a prime number");
    }
}
