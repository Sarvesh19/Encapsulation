/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mpatel6
 */
public class Employer {
    
    private Employee employee;
    private String cubeID;

    public Employer(String firstName,String lastName,String ssn) {
        employee =new Employee(firstName, lastName, ssn);
    }



    public void setCubeID() {
        this.cubeID = "A10000";
    }
    
    
    
      
    public void startProcess(){
        employee.setCubeId(cubeID);
        employee.startProcess();
        
    }
    
    public String getStatus(){
        return employee.getStatus();
    }
    
}
