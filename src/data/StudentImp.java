package data;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImp {
    public static void main(String[] args) {

        StudentImp obj = new StudentImp();

        Set<Student> students = obj.createSet();
        obj.display(students);
        boolean response = obj.removeByFirstCharacter(students);
        if (response){
            System.out.println("Student deleted");
        }else {
            System.out.println("student not found");
        }
        obj.display(students);
    }


    public Set<Student> createSet(){
        Set<Student> students = new HashSet<>();
        students.add(new Student("Vaibhav",101,100.0));
        students.add(new Student("Anuj",102,80.0));
        students.add(new Student("Suresh",20,70.0));
        students.add(new Student("Ramesh",25,76.0));
        students.add(new Student("Jatin",22,71.0));

        return students;
    }

    public void display(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    public boolean removeByFirstCharacter(Set<Student> students){
        boolean response = false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student temp = iterator.next();
            if(temp.getName().charAt(0) == 'A' || temp.getName().charAt(0) == 'J'){
                iterator.remove();
                response = true;
            }
        }

        return response;
    }
}
