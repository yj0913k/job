package resume.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import resume.job.domain.Resume;
import resume.job.domain.ResumeDTO;

@Controller
public class ResumeController {

    //이력서 작성페이지로 이동
    @GetMapping("/resume")
    public String resume(Model model) {
        model.addAttribute("form", new ResumeDTO());
        return "resume";
    }

    //이력서 작성 내용 전송
    @RequestMapping("/resume/register")
    public String save(ResumeDTO dto) {

        Resume resume = new Resume();
        resume.setName(dto.getName());

        return "redirect:/";
    }
}
