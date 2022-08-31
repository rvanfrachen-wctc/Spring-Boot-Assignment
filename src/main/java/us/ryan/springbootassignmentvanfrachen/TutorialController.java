package us.ryan.springbootassignmentvanfrachen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorial")
public class TutorialController {
    @RequestMapping("/step-one")
    public String showPageOne(){ return "tutorial/step-one.html"; }

    @RequestMapping("/step-two")
    public String showPageTwo(){ return "tutorial/step-two.html"; }

    @RequestMapping("/step-three")
    public String showPageThree(){ return "tutorial/step-three.html"; }
}
