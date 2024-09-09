
package lecture08;


public class Studentt {
    int id;
    String name;
    void display(){System.out.println(id+""+name);}
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        Studentt s2 = new Studentt();
        s1.display();
        s2.display();
    }
    
    }

