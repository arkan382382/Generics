import java.util.ArrayList;
import java.util.List;

/**
 * Created by a1 on 2017-05-05.
 */
public class BoundedTest {
    public static void main(String[] args){
        List<Integer> colection = new ArrayList<Integer>();
        colection.add(10);
      //  colection.add("abba");

        List colection2 = new ArrayList();
        colection2.add(2);
        colection2.add("as");                       // <= sense of collections

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setT(20);
        integerBox.inspect(24);
        integerBox.donald("abba");

    }
}

class Box<T>{
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
        System.out.println(u);                                  // u as Number
    }
    public <U extends String> void donald(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
        System.out.println(u);                                  // u as String
    }
}