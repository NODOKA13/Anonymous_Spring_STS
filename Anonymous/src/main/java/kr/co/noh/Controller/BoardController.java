package kr.co.noh.Controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardservice;
	
	//게시글 등록하는 페이지로 이동
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void BoardWriteGET() {

		logger.info("board/write get ............");
	}
	
	//게시글 등록, p210 RedirectAttributes로 데이터 전송 숨기기
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String BoardWritePOST(BoardDTO dto, Model model, RedirectAttributes rttr) {

		logger.info("board/write post ............");
		logger.info(dto.toString());
		
		boardservice.BoardWrite(dto);

		rttr.addFlashAttribute("result", "success");

		//return "/board/success";
		return "redirect:/board/listAll";
	}
	
	//게시글 전체 조회
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) {
		
		logger.info("show all list ...................");
		model.addAttribute("list",boardservice.boardListAll());
	}
	
	//R 게시글 상세 조회
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("ai_id") int ai_id, Model model) {
		
		//그냥 넣으면 boardDTO로 앞자리가 소문자로 넣어짐!!
		model.addAttribute(boardservice.BoardDetail(ai_id));
	}
	
	//D 게시글 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("ai_id") int ai_id, RedirectAttributes rttr) {
		
		boardservice.BoardDelete(ai_id);
		
		rttr.addFlashAttribute("result","success");
		
		return "redirect:/board/listAll";
	}
}
