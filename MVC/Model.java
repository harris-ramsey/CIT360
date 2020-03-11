public class Model {

    private String userName;
    private String userDept;

    public Model(String userName) {
        this.userName = userName;
    }

    public Model() {
        userName = null;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDept(String userDept) {
        return this.userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    /*@Override
    public String toString() {
        return String.format("")
    }
    */
}