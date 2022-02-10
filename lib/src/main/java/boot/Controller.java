package boot;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@RequestMapping("/visitor")
    public String getVisitorPath() {
        return "Hello Visitor!";
    }

    @RequestMapping("/admin")
    public String getAdminPath() {
        return "Hello Admin!";
    }

}
