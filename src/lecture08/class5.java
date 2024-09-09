
package lecture08;


public class class5 {
    void m(){
        System.out.println("method ís invoked");
    }
    void n(){
        this.m();
    }
    void p(){
        n();
    }
    public static void main(String[] args) {
        S s1= new S();
        s1.p();
    }
}
