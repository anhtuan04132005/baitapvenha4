
package lecture08;


public class Overloadingg {
    void sum(int a, long b){System.out.println(a+b);}
    void sum(int a,int b, int c){System.out.println(a+b+c);}
    public static void main(String[] args) {
        Overloadingg obj= new Overloadingg();
        obj.sum(20,20);
        obj.sum(20,20,20);
    }
            
}
