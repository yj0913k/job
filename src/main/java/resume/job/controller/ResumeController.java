package resume.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import resume.job.domain.Resume;
import resume.job.domain.ResumeDTO;
import resume.job.repository.ResumeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    //이력서 작성페이지로 이동
    @GetMapping("/resume")
    public String resume(Model model) {
        model.addAttribute("form", new ResumeDTO());
        return "resume";
    }

    //이력서 작성 내용 전송
    @RequestMapping("/resume/register")
    public String save(ResumeDTO dto, HttpServletRequest request) throws ServletException, IOException {
        Resume resume = resumeService.registerResume(dto);
        Collection<Part> parts = request.getParts();


        return "redirect:/";
    }
}
