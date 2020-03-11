public class ControllerOne {

    private Model model;
    private View view;


    public ControllerOne(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public String getUserName() {
        return model.getUserName();
    }

    public void setUserName(String userName) {
        model.setUserName(userName);
    }

    public String getUserDept() {
        return model.getUserDept(null);
    }

    public void setUserDept(String userDept) {
        model.setUserDept(userDept);
    }

    public void updateView(){
        view.printUserDetails(model.getUserName(), model.getUserDept(null));
    }



}