public class MainMVCDemo {
    public static void main(String[] args){

        Model model = retrieveUserFromDatabase();

        View view = new View();

        ControllerOne controller = new ControllerOne(model, view);

        controller.updateView();


        controller.setUserName("John");

        controller.updateView();
    }

    private static Model retrieveUserFromDatabase() {
        Model user = new Model();
        user.setUserName("Robert");
        user.setUserDept("Admin");
        return user;
    }
}