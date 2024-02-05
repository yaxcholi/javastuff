import java.io.*;

class CompoundIf {
    /* Illustrates the use of the COMPOUND if statement. */
    public static void main(String[] args) throws IOException {
        int a = -4;
        int b, c; 
     
        if (a < 0)
            a = -a;

        System.out.println("The value of a = " + a); 
        b = 3 * a - 5; 
        c = 4 * b - 7; 

        System.out.println("The value of b before if = " + b); 
        System.out.println("The value of c before if = " + c); 


        if (b > 0) {
            b = -b + c * 2;
            c = c + 1;
        } else { 
            b = b + c * 1;
            c = c - 1;
        }

        System.out.println("The value of b after if = " + b); 
        System.out.println("The value of c after if = " + c); 
    }
} 
