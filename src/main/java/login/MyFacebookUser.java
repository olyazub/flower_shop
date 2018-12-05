package login;

public class MyFacebookUser implements User {

    private FacebookUser fuser;

    public MyFacebookUser(FacebookUser fuser) {
        this.fuser = fuser;
    }

    public String getName() {
        return fuser.getUsername();
    }

    public String getEmail() {
        return fuser.getMail();
    }

    public String getPhone() {
        return fuser.getMobilePhone();
    }
}
