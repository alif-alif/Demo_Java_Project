
package AnimalInfo;

import java.util.LinkedList;


public class AnimalListDemo {
    public static void main(String[] args) {
        LinkedList <AnimalList> list = new LinkedList <AnimalList> ();
        
        // creating datainfo
        
        AnimalList a1= new AnimalList (101,"cow","white");
        AnimalList a2= new AnimalList (101,"cow","white");
        AnimalList a3= new AnimalList (101,"cow","white");
        
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        for ( AnimalList a : list ) {
            System.out.println(a.id+" "+a.color+ " "+a.name);
        }
    }
    
}
