package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 이 클래스는 Spring MVC의 컨트롤러임을 나타냅니다.
@RequestMapping("department") // 이 컨트롤러는 "/department" 경로 하위의 요청을 처리합니다.
public class DepartmentController {
    
    // "/department/introduction" 경로에 대한 GET 요청을 처리하고, "department/introduction" 뷰를 반환합니다.
    @RequestMapping(value="/introduction", method=RequestMethod.GET)
    public String intro() {
        return "department/introduction";
    }
    
    // "/department/history" 경로에 대한 GET 요청을 처리하고, "department/history" 뷰를 반환합니다.
    @RequestMapping(value="/history", method=RequestMethod.GET)
    public String history() {
        return "department/history";
    }
}
