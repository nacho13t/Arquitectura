
package frontcontroller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;


public class registerCommand extends FrontCommand{

    @Override
    public void process() {
        try {
            forward("/manageRegister");
        } catch (ServletException | IOException ex) {
            Logger.getLogger(loginCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
