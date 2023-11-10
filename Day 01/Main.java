/**
 * 
 */
class Car {
    /*
     * public - anywhere
     * private - self
     * protected - self & child
     * default - pkg
     */
    private int n;
    private String name;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Car(int a, String name){
        n = a;
        this.name = name;
    }

    Car(Car c){
        this.n = c.getN();
        this.name = c.getName();
    }
    
}


class Math {
    int n1,n2;

    public Math() {
        n1 = 0;
        n2 = 0;
    }

    public Math(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Math(Math m){
        this.n1 = m.n1;
        this.n2 = m.n2;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void print(){
        System.out.println("hello");
    }
    
}

/**
 * Main
 */
public class Main {

    public static void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        String s = "hello";
        //Car c = new Car();
        Math.print();
        sayHello();
    }
    
}