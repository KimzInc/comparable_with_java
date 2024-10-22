import java.util.Arrays;
class Student implements Comparable<Student> {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o1) {
        return name.compareTo(o1.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0,4, 5,15,-10,0,-4,-2,6};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five
            ,(val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }
        System.out.println();
        String banana = "banana";
        String[] fruits = {"apple", "pear", "banana", "BANANA"};

        for (String s : fruits) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }
        System.out.println();
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println();

        System.out.println("A:" + (int)'A' + " " + "a:" + (int)'a');
        System.out.println("B:" + (int)'B' + " " + "b:" + (int)'b');
        System.out.println("P:" + (int)'P' + " " + "p:" + (int)'p');

        // the output is
        /*
        * banana > apple: compareTo=1
        * banana < pear: compareTo=-14
        * banana == banana: compareTo=0
        * banana > BANANA: compareTo=32
        * */
        /*
        * A:65 a:97
        * B:66 b:98
        * P:80 p:112
        * */
        /* 98-98 = 0
        *  112 - 80 = 32
        *  98 - 112 = -14
        *
        * NB: Chars are stored in memory as integer values
        *
        * */

        Student kim = new Student("Kim");
        Student[] students = {
                new Student("Jane"),
                new Student("Bob"),
                new Student("Jack"),
                new Student("Rogers"),
                new Student("Ian")
        };

        //Student class has to implement Comparable interface
        // to avoid raising exception classCastException
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //Error compare student object with string
        //System.out.println("result = " + kim.compareTo("Anna"));

        System.out.println("result = " + kim.compareTo(students[3]));
    }
}