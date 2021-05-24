
package ict.inventory.ordinaryuser;


/**
 *
 * @author Danver
 */

class Stock  {
        private String serial_no, model, prod_name, 
                description, location, category, date_added_in_stock;

        public Stock(String serial_no, String model,String prod_name, 
                String description, String location, 
                String category, String date_added_in_stock)
        {
            this.serial_no = serial_no;  
            this.model = model;
            this.prod_name = prod_name;
            this.description = description;
            this.location = location;
            this.category= category;
            this.date_added_in_stock = date_added_in_stock;
        }
        public String getProductSerialNo(){
        return serial_no;
        }
        public String getProductModel(){
        return model;
        }
        public String getProductName(){
        return prod_name;
        }        
        public String getDescription(){
        return description;
        }
        public String getLocation(){
        return location;
        }
        public String getCategory(){
        return category;
        }  
        public String getDateAddedInStock(){
        return date_added_in_stock;
        }          
}


    
