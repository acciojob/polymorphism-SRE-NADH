package com.driver;

public class Main {
    public static class product{

       public product(){}

        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
           return x*y;
        }
    }

    public static void main(String[] args) {
        product p = new product();
        int ans1 = p.product(10,20);
        int ans2 = p.product(10,20,30);
        double ans3 = p.product(10.5,6.8);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}