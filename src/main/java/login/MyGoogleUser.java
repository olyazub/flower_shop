package login;

public class MyGoogleUser implements User{

    private GoogleUser guser;

    public MyGoogleUser(GoogleUser guser) {
        this.guser = guser;
    }

    public String getName() {
        return guser.getUsername();
    }

    public String getEmail() {
        return guser.getEmail();
    }

    public String getPhone() {
        return guser.getPhone();
    }
}
