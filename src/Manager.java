/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofia
 */
public class Manager extends Employee {
    
    public double bonus;

    public Manager(Person p, double salary, double bonus) {
        super(p, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double salary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public double bonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
