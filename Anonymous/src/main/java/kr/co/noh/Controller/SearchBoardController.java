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
import kr.co.noh.DTO.PageMaker;
import kr.co.noh.DTO.SearchCriteria;
import kr.co.noh.service.BoardService;

@Controller
@RequestMapping("/sboard/*")
public class SearchBoardController {
		private static final Logger logger = LoggerFactory.getLogger(SearchBoardController.class);
		
		@Inject
		private BoardService boardservice;
		
		//R 게시글 전체보기
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
			System.out.println("리스트");
			logger.info(cri.toString());
			
			//model.addAttribute("list", boardservice.listCriteria(cri));
			model.addAttribute("list", boardservice.listSearchCriteria(cri));
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			
			//pageMaker.setTotalCount(boardservice.listCountCriteria(cri));
			pageMaker.setTotalCount(boardservice.listSearchCount(cri));
			
			model.addAttribute("pageMaker", pageMaker);
		}
		
		//R 게시글 상세보기
		@RequestMapping(value = "/detailPage", method = RequestMethod.GET)
		public void read(@RequestParam("ai_id") int ai_id, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
			System.out.println("디테일");
			logger.info(cri.toString());
			// 상세조회시 viewcount의 값에 +1 (조회수 증가)
			BoardDTO dto = boardservice.BoardDetail(ai_id);
			dto.setViewcount(dto.getViewcount() + 1);
			boardservice.BoardUpdate(dto);
			
			model.addAttribute(boardservice.BoardDetail(ai_id));
		}
		
		//U 게시글 수정 GET
		@RequestMapping(value = "/updatePage", method = RequestMethod.GET)
		public void updatePageGET(int ai_id, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
			System.out.println("업데이트 GET");
			logger.info(cri.toString());
			model.addAttribute(boardservice.BoardDetail(ai_id));
		}
		
		//U 게시글 수정 POST
		@RequestMapping(value = "/updatePage", method = RequestMethod.POST)
		public String updatePagePOST(BoardDTO dto, SearchCriteria cri, RedirectAttributes rttr) throws Exception{
			System.out.println("업데이트 POST");
			logger.info(cri.toString());
			boardservice.BoardUpdate(dto);
			
			System.out.println(cri.getKeyword());
			System.out.println(cri.getKeyword().getClass().getName());
			
			if(cri.getKeyword() != "" || cri.getKeyword() == "") {
				System.out.println("널만나러가");
				rttr.addAttribute("page", cri.getPage());
				rttr.addAttribute("perPageNum", cri.getPerPageNum());
				rttr.addAttribute("searchType", cri.getSearchType());
				rttr.addAttribute("keyword", cri.getKeyword());
			}
			
			rttr.addFlashAttribute("msg", "success");
			
			logger.info(rttr.toString());
			
			return "redirect:/sboard/list";
		}
		
		//D 게시글 삭제
		@RequestMapping(value = "/deletePage", method = RequestMethod.POST)
		public String remove(@RequestParam("ai_id") int ai_id, SearchCriteria cri, RedirectAttributes rttr) throws Exception {
			
			boardservice.BoardDelete(ai_id);
			
			rttr.addAttribute("page",cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			rttr.addAttribute("searchType", cri.getSearchType());
			rttr.addAttribute("keyword", cri.getKeyword());
			
			rttr.addFlashAttribute("msg", "success");
			
			return "redirect:/sboard/list";
		}
		
}