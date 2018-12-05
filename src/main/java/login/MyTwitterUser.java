package login;

public class MyTwitterUser implements User {

    private TwitterUser tuser;

    public MyTwitterUser(TwitterUser tuser) {
        this.tuser = tuser;
    }

    public String getName() {
        return tuser.getName() + tuser.getSurname();
    }

    public String getEmail() {
        return tuser.getAddress();
    }

    public String getPhone() {
        return tuser.getNumber();
    }
}
