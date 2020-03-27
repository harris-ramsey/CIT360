import java.util.HashMap;

public class Controller {
    private HashMap<String, Handler> handleMap = new HashMap();

    public void handleReq(String command, HashMap<String, Object> data) {
        Handler commHandle = handleMap.get(command);
        
        if (commHandle != null) {
            commHandle.handleIt(data);
        }
    }

    public void mapCommand(String commOne, Handler aHandler) {
        handleMap.put(commOne, aHandler);
    }

}