package com.kunal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        primeNumber obj1 = new primeNumber();
//        obj1.prime();
//
//        temperature obj2 = new temperature();
//        obj2.temp();

//        fibbonaci obj3 = new fibbonaci();
//        obj3.fibbo();

//        checkCount obj4 = new checkCount();
//        obj4.check();

//        ReverseNum obj5 = new ReverseNum();
//        obj5.rev();

        calculator obj6 = new calculator();
        obj6.cal();
    }
}


class primeNumber{
    void prime(){
        int c =2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<=1){
            System.out.println("not prime , not composite");
            return;
        }
        while (c*c <= n){
            if(n%c == 0){
                System.out.println("not prime");
                return;
            }

            c = c +1;
        }
        if (c * c > n ){
            System.out.println(" Prime no.");
            return;
        }
    }
}

class temperature{
    void temp() {

        System.out.println("enter temp in celsius : ");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();

        float f = (c * 9/5)+ 32;
        System.out.println("temp in fahrenheit : "+f);


    }
}

class fibbonaci{
    void fibbo(){
        System.out.println("enter the ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(" 0,1,");
         int count =2;
        while (count <=n ){    // 0,1,1,2,3,5
            int temp = a;
            a = b;
            b = temp + a;
            System.out.print(b + ",");
            count++;
        }
    }
}

class checkCount{
    void check(){
        int count = 0;
        System.out.println("enter the number n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the check number c =  ");
        int c = sc.nextInt();
        while(n>0){
            if (n % 10 == c){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

class ReverseNum{
    void rev(){
        int n = 753354;
        int ans = 0;
        while (n>0){
            int rem = n%10;
            n /= 10;

            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}

class calculator{
    void cal(){
        int res = 0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("enter the operator : ");
            char n = sc.next().trim().charAt(0);

            if (n=='+' || n=='-' || n=='*' || n=='/' || n=='%' ){
                System.out.println("enter two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(n == '+'){
                    res = num1 + num2;
                }
                if(n == '-'){
                    res = num1 - num2;
                }
                if(n == '*'){
                    res = num1 * num2;
                }
                if(n == '%'){
                    res = num1 % num2;
                }
                if(n == '/'){
                    if (num2 != 0){
                    res = num1 / num2;}
                }
                System.out.println(res);
            }
            else if (n == 'x' || n == 'X'){
                break;
            }
            else
                System.out.println("invalid operation..");

        }

    }
}



