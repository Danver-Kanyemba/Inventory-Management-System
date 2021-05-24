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

class User {
        private String client_name, client_id, client_surname;

        public User(String client_id,String client_name, String client_surname)
        {
            this.client_id = client_id;
            this.client_name = client_name;
            this.client_surname = client_surname;
        }
        public String getclientid(){
        return client_id;
        }
        public String getclientname(){
        return client_name;
        }
        public String getclientsurname(){
        return client_surname;
        }        
}


    
