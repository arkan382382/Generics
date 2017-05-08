import com.sun.deploy.util.ArrayUtil;

/**
 * Created by arkan on 03.05.2017.
 *
 * https://docs.oracle.com/javase/tutorial/java/generics/index.html
 *
 * Typy generyczne:
 * http://ggoralski.pl/?p=1892
 
 CHECK: http://www.geeksforgeeks.org/wrapper-classes-java/         very good explain
 */
public class GenericsTest {
    public static void main(String[] args){

 /**       JavaMagicBox<Integer> jBox1 = new JavaMagicBox<Integer>();
        JavaMagicBox<String> jBox2 = new JavaMagicBox<String>();

        jBox1.box = 57;
        jBox2.box = "ada";
        jBox2.box2 = "papa";
        System.out.printf(jBox2.JoinString(jBox2.box, jBox2.box2));
*/
        //Typy generyczne pozwalają uogólnić typy używane w klasach i metodach, fe:      [ 1 ]
        //Zastosowanie metody generycznej:
        String[] imiona = {"ada", "ala", "ola"};
        Integer[] liczby = {2, 31, 42};
        Boolean[] odpowiedzi = {false, true, true};

        Generyczne temp_one = new Generyczne();
        temp_one.drukuj(imiona);
        temp_one.drukuj(liczby);
        temp_one.drukuj(odpowiedzi);
      //  temp_one.printOnlyInteger(odpowiedzi); // error because function is prepared only for integer type

        temp_one.printOnlyInteger(liczby);
        int[] values = {2, 2, 2};

        Integer[] valval = new Integer[values.length];  // autoboxing from obj[] <= primitive[]
        int ii=0;
        for(int value : values){
            valval[ii++] = Integer.valueOf(value);
        }                                               // end

        temp_one.printOnlyInteger(valval);

        Integer i = new Integer(12);
        int a = i;                          // unboxing!!   primitive <- Obj

        int b = 25;
        Integer ttt = b;                    // autoboxing!! Obj <- primitive

        String e1 = "cat";                                                          //  [ 2 ]
        String e2 = "dog";
        Integer e3 = 123;

        Double e4 = 23.4;
        Double e5 = 22.5;
        Boolean e6 = true;

        GenericClass gc1 = new GenericClass(e1, e2, e3);
        GenericClass gc2 = new GenericClass(e4, e5, e6);
        gc1.print();
        gc2.print();
    }
}
class Generyczne{                                                   // [ 1 ]
    public <T> void drukuj(T[] tablica){
        System.out.println("Klasa: " + tablica.getClass());
        for(T element : tablica){
            System.out.println("Element: " + element);
        }
    }
    public <T extends Integer> void printOnlyInteger(T[] tab){
        System.out.println("Class: " + tab.getClass());
        for(T elem : tab){
            System.out.println("element: " + elem);
            }
    }
}

class GenericClass<T, S>{                                           // [ 2 ]
    T element1, element2;
    S element3;
    public GenericClass(T element1, T element2, S element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }
    public void print(){
        System.out.println("Element1: " + element1 + "kllasa: " + element1.getClass());
        System.out.println("Element1: " + element2 + "kllasa: " + element2.getClass());
        System.out.println("Element1: " + element3 + "kllasa: " + element3.getClass());
    }
}
/** class JavaMagicBox<T> {
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
*/
