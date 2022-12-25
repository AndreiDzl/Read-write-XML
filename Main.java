
package mainpackage;

public class Main {
    public static void main(String[] args) {
        XMLReadWrite xrw = new XMLReadWrite();
        Person p = new Person();
        p.setName("Andrei");
        p.setAge(35);
        
        
//        xrw.writeXML("person.xml", p);
        xrw.readXML("person.xml");
    }
    
    
    
   
    
    
    
    
}
