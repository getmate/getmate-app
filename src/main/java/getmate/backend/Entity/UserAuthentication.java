package getmate.backend.Entity;

public class UserAuthentication {
    String uid, password;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAuthentication() {
    }
}
