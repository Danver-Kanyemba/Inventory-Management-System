/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.inventory.admin;





/**
 *
 * @author Danver
 */

class User {
        private String user_id, username, password, role, created_at, added_by;

        public User(String user_id,String username, String password, 
                String role,String created_at, String added_by)
        {
            this.user_id = user_id;
            this.username = username;
            this.password = password;
            this.role = role;
            this.created_at = created_at;
            this.added_by = added_by;
             
        }
        public String getUser_id(){
        return user_id;
        }
        public String getUsername(){
        return username;
        }
        public String getPassword(){
        return password;
        }
        public String getRole(){
        return role;
        }
        public String getCreatedAt(){
        return created_at;
        }
        public String getAddedBy(){
        return added_by;
        }        
}


    
