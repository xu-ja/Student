/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author J's tablet
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public String name;
    public String uselessVar;

    public String getUselessVar() {
        return uselessVar;
    }

    public void setUselessVar(String uselessVar) {
        this.uselessVar = uselessVar;
    }
    
    public Student() {
        this.name = "";
        
    }
    public Student(String nName) {
        this.name = nName;
    }
    public String getName() {
        
        return this.name;
    }
    public void setName(String nName) {
        this.name = nName;
    }

    
}
