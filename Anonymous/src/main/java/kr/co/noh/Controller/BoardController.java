package kr.co.noh.Controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import kr.co.noh.DTO.BoardDTO;
import kr.co.noh.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardservice;
	
	//�Խñ� ����ϴ� �������� �̵�
	@RequestMapping(value = "/boardwrite", method = RequestMethod.GET)
	public void BoardWriteGET(BoardDTO boarddto, Model model) {

		logger.info("regist get ............");
	}
	
	//�Խñ� ���
	@RequestMapping(value = "/boardwrite", method = RequestMethod.POST)
	public String BoardWritePOSt(BoardDTO dto, Model model) {

		logger.info("regist post ............");
		logger.info(dto.toString());
		
		boardservice.BoardWrite(dto);

		model.addAttribute("result", "success");

		return "/board/boardsuccess";
	}
}
