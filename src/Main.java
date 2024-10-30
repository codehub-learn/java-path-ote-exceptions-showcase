import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("Hello world!");
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet);

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Java", "Programming Language");
        hashMap.put("Java", "Backend Technology");
        hashMap.put("C++", "Programming Language");
        hashMap.put("Git", "Version Control System");
        hashMap.put("JavaScript", "Programming Language");

        String value = hashMap.get("Java");
        System.out.println(value);

        System.out.println(hashMap);*/
        //divisionByZero();
        //indexOutOfBounds();
        tester();
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");



    }

    private static void tester() {
        try {
            /*
            * ...
            * */
            indexOutOfBounds(); // out of bounds exception
            nullPointer(); // null pointer exception
        /*} catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("error happened");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the array is very small in size");
        }*/
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("error happened");
        }
    }

    private static void readFromFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream("reports.csv");
        } catch (FileNotFoundException e) {
            System.out.println("The file you inserted does not exist.");
        }
    }

    private static void writeToFile(){
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("reports.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("The file you inserted does not exist.");
        }
    }

    private static void openDatabaseConnection(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codehub", "root", "root");
        } catch (SQLException e) {
            System.out.println("cannot connect to database");
        }
    }

    private static void divisionByZero() {
        int result = 5 / 0;
    }

    private static void indexOutOfBounds() {
        String[] stringsArray = new String[10];
        System.out.println(stringsArray[1500]);
    }

    private static void nullPointer() {
        String name = null;
        name.contains("a");
    }
}