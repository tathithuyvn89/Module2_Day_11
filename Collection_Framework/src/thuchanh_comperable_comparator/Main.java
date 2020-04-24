package thuchanh_comperable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT" );
        Student student4 = new Student("Tung", 38, "HT" );
        List<Student> listSt= new ArrayList<Student>();
        listSt.add(student1);
        listSt.add(student2);
        listSt.add(student3);
        listSt.add(student4);
        Collections.sort(listSt);
        for (Student st:listSt){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(listSt,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st:listSt){
            System.out.println(st.toString());
        }
    }
}
