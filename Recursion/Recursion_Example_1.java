package Recursion;

// here the output comes to 3 2 1 1 2 3 ie because the function once called prints the first print statement and waits for the function call made after it and once the function call is completed only then the next print statement executes and at that time the value of n will be 1 so 1 2 3 is printed later

public class Recursion_Example_1 {

    static void fun(int n){
        if (n==0)
            return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        fun(3);
    }

}
