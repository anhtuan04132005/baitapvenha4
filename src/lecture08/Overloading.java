
package lecture08;


public class Overloading {
    public static void main(int a) {
        System.out.println(a);
        
    }
    public static void main(String[] args) {
        System.out.println("main(method invoker");
        main(10);
    }
    }

