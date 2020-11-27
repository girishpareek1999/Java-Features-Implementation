// The main method call from obj1 will print 4 and 4.2
public class Main {

    public static void main(String[] args) {
	
        Sub obj1 = new Sub();
        System.out.println(obj1.returnNumber(2));
        System.out.println(obj1.returnNumber(2.1));
	}
   
}

public class Super {
    public int returnNumber(int number){
        return number+2;
    }
}

public class Sub extends Super {

    public double returnNumber(double number){
	
        return number+2.1;
    }
}
