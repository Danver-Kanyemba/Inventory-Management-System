
package ict.inventory.ordinaryuser;


/**
 *
 * @author Danver
 */

class Employees  {
        private String employee_name, department_name;

        public Employees(String employee_name, String department_name)
        {
            this.employee_name = employee_name;
            this.department_name = department_name;
        }
        public String getDepartmentName(){
            return department_name;
        }       
        public String getEmployeeName(){
            return employee_name;
        }
}


    
