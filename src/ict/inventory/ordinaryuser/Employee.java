
package ict.inventory.ordinaryuser;
/**
 *
 * @author Danver
 */

class Employee {  
    private String employee_id,employee_name, employee_department_id;

    public Employee(String employee_id,String employee_name,
            String employee_department_id)
    {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_department_id = employee_department_id;
    }
    public String getEmployeeId(){
    return employee_id;
    }
    public String getEmployeeName(){
    return employee_name;
    } 
    public String getEmployeeDepartment_id(){
    return employee_department_id;
    }
}


    
