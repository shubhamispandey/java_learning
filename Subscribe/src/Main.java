import java.util.*;

public  class Main {
    public static void main(String[] args) {
        multiply(2);
    }
    public static void multiply(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}