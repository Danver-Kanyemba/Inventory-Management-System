/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.inventory.ordinaryuser;


/**
 *
 * @author Danver
 */

class productsAndClient  {
        private String product_serial_no, product_name, product_description, client_name, client_surname, client_national_id;

        public productsAndClient(String product_serial_no,String product_name, String product_description, String client_name, String client_surname, String client_national_id)
        {
            this.product_serial_no = product_serial_no; 
            this.product_name = product_name;
            this.product_description = product_description;
            this.client_name = client_name;
            this.client_surname = client_surname;
            this.client_national_id = client_national_id;
        }
        public String getProductSerialNo(){
        return product_serial_no;
        }
        public String getProductName(){
        return product_name;
        }
        public String getProductDescription(){
        return product_description;
        }        
        public String getClientName(){
        return client_name;
        }
        public String getClientSurname(){
        return client_surname;
        }
        public String getClientNationalId(){
        return client_national_id;
        }  
}


    
