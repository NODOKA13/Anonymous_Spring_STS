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
			model.addAttribute(boardservice.BoardDetail(ai_id));
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