package kr.co.noh.Controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.DTO.PageMaker;
import kr.co.noh.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardservice;

	// C GET 게시글 등록하는 페이지로 이동
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void BoardWriteGET() {

		logger.info("board/write get ............");
	}

	// C POST 게시글 등록, p210 RedirectAttributes로 데이터 전송 숨기기
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String BoardWritePOST(BoardDTO dto, Model model, RedirectAttributes rttr) throws Exception {

		logger.info("board/write post ............");
		logger.info(dto.toString());

		boardservice.BoardWrite(dto);

		rttr.addFlashAttribute("msg", "success");

		// return "/board/success";
		return "redirect:/board/listPage";
	}

	// R 게시글 전체 조회
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {

		logger.info("show all list ...................");
		model.addAttribute("list", boardservice.boardListAll());
	}

	// R 게시글 상세 조회
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("ai_id") int ai_id, Model model) throws Exception {

		// 상세조회시 viewcount의 값에 +1
		BoardDTO dto = boardservice.BoardDetail(ai_id);
		dto.setViewcount(dto.getViewcount() + 1);
		boardservice.BoardUpdate(dto);

		// 그냥 넣으면 boardDTO로 앞자리가 소문자로 넣어짐!!
		model.addAttribute(boardservice.BoardDetail(ai_id));
	}

	// U GET 게시글 수정
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateget(int ai_id, Model model) throws Exception {

		model.addAttribute(boardservice.BoardDetail(ai_id));
	}

	// U POST 게시글 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatepost(BoardDTO dto, RedirectAttributes rttr) throws Exception {

		logger.info("board/update POST...............");

		boardservice.BoardUpdate(dto);
		rttr.addFlashAttribute("msg", "sucess");

		return "redirect:/board/listPage";
	}

	// D 게시글 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("ai_id") int ai_id, RedirectAttributes rttr) throws Exception {

		boardservice.BoardDelete(ai_id);

		rttr.addFlashAttribute("msg", "success");

		return "redirect:/board/listPage";
	}

	// 페이징
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public void listAll(Criteria cri, Model model) throws Exception {

		logger.info("show list page with criteria............................");

		model.addAttribute("list", boardservice.listCriteria(cri));
	}

	// 페이징
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		logger.info(cri.toString());

		model.addAttribute("list", boardservice.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		// pageMaker.setTotalCount(131);

		pageMaker.setTotalCount(boardservice.listCountCriteria(cri));

		model.addAttribute("pageMaker", pageMaker);
	}
}
