
package lecture08;


public class Calculation06 {
    void sum(int a, long b){System.out.println("a method invoker");}
    void sum(long a,int b){System.out.println("a method invoker");}
    public static void main(String[] args) {
        Calculation06 obj= new Calculation06();
        obj.sum(20,20);
    }
}
