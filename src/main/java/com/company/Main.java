package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        raj r=new raj();
        r.rajeewa();
        r.sample();
        r.suma();
	// write your code here
    }
     static class raj {
        public void rajeewa() {

            System.out.println("hey how r u!");
        }

        public void sample (){

            System.out.println("meeting you!!");
        }
        public void suma (){

            int x=5;
            int y=9;
            int z=x*y;
            System.out.println("answer is= " +z);
        }
    }
}
