package individualProject;

import java.security.Key;
import javax.crypto.KeyGenerator;
import sun.security.provider.MD5;

public class User {

//variables=====================================================================
    private String username;
    private String password;
    private Key key;

//constructors==================================================================
    public User(){}
    public User(String username, String password){
        this.username=username;
        this.password=password;
        
    }

//setters & getters=============================================================

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Key getKey() {
        return key;
    }

//methods=======================================================================


//main==========================================================================



}//~class
