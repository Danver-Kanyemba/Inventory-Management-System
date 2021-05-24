
package ict.inventory.ordinaryuser;


/**
 *
 * @author Danver
 */

class EmployeeAndProducts  {
        private String product_serial_no, model, product_name, product_description, 
                category, employee_name, products_location, date_issued, issued_by;

        public EmployeeAndProducts( String product_serial_no, String model,String product_name, 
                String product_description, String category,  
                String products_location, String employee_name, String date_issued, String issued_by)
        {
//product_serial_no, product_name, description, location, office
            
            this.product_serial_no = product_serial_no;
            this.model = model;
            this.product_name = product_name;
            this.product_description = product_description;
            this.category = category;
            this.employee_name = employee_name;
            this.products_location = products_location;
            this.date_issued = date_issued;
            this.issued_by = issued_by;
            
        }
        public String getProductSerialNo(){
        return product_serial_no;
        }
        public String getModel(){
        return model;
        }        
        public String getProductName(){
        return product_name;
        }
        public String getProductDescription(){
        return product_description;
        } 
        public String getCategory(){
        return category;
        }           
        public String getEmployeeName(){
        return employee_name;
        }

        public String getProductsLocation(){
        return products_location;
        }     
        public String getDateIssued(){
        return date_issued;
        } 
        public String getIssuedBy(){
        return issued_by;
        }       
}


    
