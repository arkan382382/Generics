/**
 * Created by arkan on 03.05.2017.
 *
 * https://docs.oracle.com/javase/tutorial/java/generics/index.html
 */
public class GenericsTest {
    public static void main(String[] args){

        JavaMagicBox<Integer> jBox1 = new JavaMagicBox<Integer>();
        JavaMagicBox<String> jBox2 = new JavaMagicBox<String>();

        jBox1.box = 57;

        jBox2.box = "ada";
        jBox2.box2 = "papa";
        System.out.printf(jBox2.JoinString(jBox2.box, jBox2.box2));

    }
}

class JavaMagicBox<T> {
    public T box;
    public T box2;


    public String JoinString(T a, T b){
        return a.toString() + b.toString();
    }

    public <T> void print(T[] array){
        for(T element : array)
            System.out.println(element + " ");
    }
}
