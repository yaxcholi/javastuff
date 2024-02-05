public class variables {
    public static void main(String[] args) {

        int p = 7;
 
        int q = -4;

        int r = 3 * p + 4 * q;

        int s = 5 * p + 6 * r;

        int t; 

    
        if (r > s) {
            t = p + q + r;
        } else {
            t = p + q + s;
        }

        System.out.println("Final value of p: " + p);
        System.out.println("Final value of q: " + q);
        System.out.println("Final value of r: " + r);
        System.out.println("Final value of s: " + s);
        System.out.println("Final value of t: " + t);
    }
}
