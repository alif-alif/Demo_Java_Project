
package StudentListInfo;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        // student linkelist
        
        LinkedList <StudentList> list = new LinkedList <StudentList> ();
        
        //creating student
        
        StudentList s1= new StudentList (101,"karim","alif");
        StudentList s2= new StudentList (102,"karim","alif");
        StudentList s3= new StudentList (103,"karim","alif");
        
        // adding student to the student list
        
        list.add (s1);
        list.add (s2);
        list.add (s3);
        
        //info display
        
        for (StudentList s : list) {
            System.out.println(s.id+" "+s.name+ " "+s.className);
        }
    }
    
}
