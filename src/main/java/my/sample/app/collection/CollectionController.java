package my.sample.app.collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class CollectionController {

    @ModelAttribute("collectionForm")
    public CollectionForm setUpForm() {
        return new CollectionForm();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String createForm() {
        return "collection/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String acceptForm(@Validated CollectionForm form, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "collection/form";
        }

        return "redirect:/";
    }

}
