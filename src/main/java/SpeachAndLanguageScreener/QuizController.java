package SpeachAndLanguageScreener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Petri Kainulainen
 */
@Controller
public class QuizController {

    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    public String renderQuizView(
            @RequestParam(value="name", required=false, defaultValue="World") String name,
            Model model) {
        model.addAttribute("name", name);
        return "quiz";
    }
}
