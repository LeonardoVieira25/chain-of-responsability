public class Request {
    public String userName;
    public String password;
    public String userId;

    Request(String userId) {
        this.userId = userId;
    }

    Request(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
