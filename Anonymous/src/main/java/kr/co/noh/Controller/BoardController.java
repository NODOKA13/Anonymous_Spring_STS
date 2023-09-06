package kr.co.noh.Controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardservice;
	
	//�Խñ� ����ϴ� �������� �̵�
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void BoardWriteGET() {

		logger.info("board/write get ............");
	}
	
	//�Խñ� ���, p210 RedirectAttributes�� ������ ���� �����
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String BoardWritePOST(BoardDTO dto, Model model, RedirectAttributes rttr) {

		logger.info("board/write post ............");
		logger.info(dto.toString());
		
		boardservice.BoardWrite(dto);

		rttr.addFlashAttribute("result", "success");

		//return "/board/success";
		return "redirect:/board/listAll";
	}
	
	//�Խñ� ��ü ��ȸ
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) {
		
		logger.info("show all list ...................");
		model.addAttribute("list",boardservice.boardListAll());
	}
<<<<<<< HEAD
	
	//R �Խñ� �� ��ȸ
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("ai_id") int ai_id, Model model) {
		
		//�׳� ������ boardDTO�� ���ڸ��� �ҹ��ڷ� �־���!!
		model.addAttribute(boardservice.BoardDetail(ai_id));
	}
	
	//D �Խñ� ����
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("ai_id") int ai_id, RedirectAttributes rttr) {
		
		boardservice.BoardDelete(ai_id);
		
		rttr.addFlashAttribute("result","success");
		
		return "redirect:/board/listAll";
	}
=======
>>>>>>> parent of 43906c4 (보드컨트롤러 수정, 게시글 상세보기 추가)
}
