package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import beans.Freeboard;
import database.FreeboardMapper;

@Controller
@RequestMapping("community") // 이 컨트롤러는 "/community" 경로 하위의 요청을 처리합니다.
public class CommunityController {
	
    @Autowired
    FreeboardMapper freeboardMapper; // FreeboardMapper 빈을 자동으로 주입합니다.
	
    // 공지사항 페이지를 반환합니다.
    @RequestMapping(value="/announcements", method=RequestMethod.GET)
    public String intro() {
        return "community/announcements";
    }

    // FAQ 페이지를 반환합니다.
    @RequestMapping(value="/faq", method=RequestMethod.GET)
    public String showFAQList() {
        return "community/faq";
    }

    // 게시판 전체 목록을 조회하여 모델에 추가하고, 게시판 페이지를 반환합니다.
    @RequestMapping(value="/freeboard", method=RequestMethod.GET)
    public String showFreeboardList(Model model) {
        List<Freeboard> freeboardList = freeboardMapper.selectAll(); // 모든 게시물을 조회합니다.
        model.addAttribute("freeboardList", freeboardList); // 모델에 게시물 목록을 추가합니다.
        return "community/freeboard";
    }

    // 요청된 ID에 해당하는 게시물 정보를 조회하여 모델에 추가하고, 게시물 상세 페이지를 반환합니다.
    @RequestMapping(value="/freeboard/{id}", method=RequestMethod.GET)
    public String showFreeboardDetail(@PathVariable("id") String id, Model model) {
        Freeboard freeboard = freeboardMapper.select(id); // ID에 해당하는 게시물을 조회합니다.
        model.addAttribute("freeboard", freeboard); // 모델에 게시물 정보를 추가합니다.
        return "community/freeboardDetail";
    }
	
    // 요청된 ID에 해당하는 게시물 정보를 조회하여 모델에 추가하고, 게시물 수정 폼 페이지를 반환합니다.
    @RequestMapping(value="/freeboard/{id}/modify", method=RequestMethod.GET)
    public String showModifyFreeboardForm(@PathVariable("id") String id, Model model) {
        Freeboard freeboard = freeboardMapper.select(id); // ID에 해당하는 게시물을 조회합니다.
        model.addAttribute("freeboard", freeboard); // 모델에 게시물 정보를 추가합니다.
        return "community/freeboardModifyForm";
    }
	
    // 게시물 수정 요청을 처리하고, 수정된 게시물 상세 페이지로 리다이렉트합니다.
    @RequestMapping(value="/freeboard/{id}/modify", method=RequestMethod.POST)
    public String updateFreeboard(@PathVariable("id") String id, Freeboard freeboard) {
        freeboardMapper.update(freeboard); // 게시물을 수정합니다.
        return "redirect:/community/freeboard/" + id; // 수정된 게시물 상세 페이지로 리다이렉트합니다.
    }

    // 게시물 생성 폼 페이지를 반환합니다.
    @RequestMapping(value="/freeboard/create", method=RequestMethod.GET)
    public String showFreeboardForm() {
        return "community/freeboardForm";
    }
	
    // 게시물 생성 요청을 처리하고, 게시물 목록 페이지로 리다이렉트합니다.
    @RequestMapping(value="/freeboard/create", method=RequestMethod.POST)
    public String createFreeboard(Freeboard freeboard) {
        freeboardMapper.insert(freeboard); // 새로운 게시물을 생성합니다.
        return "redirect:/community/freeboard"; // 게시물 목록 페이지로 리다이렉트합니다.
    }
}
