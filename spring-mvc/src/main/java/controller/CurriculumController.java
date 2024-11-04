package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 이 클래스는 Spring MVC의 컨트롤러임을 나타냅니다.
@RequestMapping("curriculum") // 이 컨트롤러는 "/curriculum" 경로 하위의 요청을 처리합니다.
public class CurriculumController {
    
    // "/curriculum/grade1" 경로에 대한 GET 요청을 처리하고, "curriculum/grade1" 뷰를 반환합니다.
    @RequestMapping(value="/grade1", method=RequestMethod.GET)
    public String grade1() {
        return "curriculum/grade1";
    }

    // "/curriculum/grade2" 경로에 대한 GET 요청을 처리하고, "curriculum/grade2" 뷰를 반환합니다.
    @RequestMapping(value="/grade2", method=RequestMethod.GET)
    public String grade2() {
        return "curriculum/grade2";
    }

    // "/curriculum/grade3" 경로에 대한 GET 요청을 처리하고, "curriculum/grade3" 뷰를 반환합니다.
    @RequestMapping(value="/grade3", method=RequestMethod.GET)
    public String grade3() {
        return "curriculum/grade3";
    }

    // "/curriculum/advanced" 경로에 대한 GET 요청을 처리하고, "curriculum/advanced" 뷰를 반환합니다.
    @RequestMapping(value="/advanced", method=RequestMethod.GET)
    public String advanced() {
        return "curriculum/advanced";
    }
}
