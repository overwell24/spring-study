package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 이 클래스는 Spring MVC의 컨트롤러임을 나타냅니다.
@RequestMapping("") // 이 컨트롤러는 루트 경로에 대한 요청을 처리합니다.
public class RootController {
    
    // 루트 경로에 대한 GET 요청을 처리하고, "root/root" 뷰를 반환합니다.
    @RequestMapping(value="", method=RequestMethod.GET)
    public String root() {
        return "root/root";
    }
    
    // "/directions" 경로에 대한 GET 요청을 처리하고, "root/directions" 뷰를 반환합니다.
    @RequestMapping(value="/directions", method=RequestMethod.GET)
    public String direction() {
        return "root/directions";
    }
}
