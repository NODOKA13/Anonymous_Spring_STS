package kr.co.noh.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.noh.DTO.ArticleDTO;
import kr.co.noh.DTO.Criteria;
import kr.co.noh.DTO.PageMaker;
import kr.co.noh.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Inject
	private ArticleService articleservice;
	
	@RequestMapping(value = "", method=RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ArticleDTO dto){
		ResponseEntity<String> entity = null;
		try {
			articleservice.ArticleWrite(dto);
			entity = new ResponseEntity<String>("success", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}

	@RequestMapping(value = "/all/{board_ai_id}", method = RequestMethod.GET )
	public ResponseEntity<List<ArticleDTO>> list(
			@PathVariable("board_ai_id") int board_ai_id){
		ResponseEntity<List<ArticleDTO>> entity = null;
		try {
			entity = new ResponseEntity<>(
					articleservice.ArticleListAll(board_ai_id),HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	@RequestMapping(value = "/ai_id",
			method = { RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> update(
			@PathVariable("ai_id") int ai_id,
			@RequestBody ArticleDTO dto){
		
		ResponseEntity<String> entity = null;
		try {
			dto.setAi_id(ai_id);
			articleservice.ArticleUpdate(dto);
			
			entity = new ResponseEntity<String>("success", HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(
					e.getMessage(), HttpStatus.BAD_REQUEST);
					
		}
		return entity;
		
	}

	@RequestMapping(value = "/ai_id", method = RequestMethod.DELETE)
	public ResponseEntity<String> remove(
			@PathVariable("ai_id") int ai_id){
		ResponseEntity<String> entity = null;
		try {
			articleservice.ArticleDelete(ai_id);
			entity = new ResponseEntity<String>("success", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(
					e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value = "/{ai_id}/{page}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> listPage(
			@PathVariable("ai_id") int ai_id,
			@PathVariable("page")int page){
		ResponseEntity<Map<String, Object>> entity = null;
		
		try {
			Criteria cri = new Criteria();
			cri.setPage(page);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(cri);
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<ArticleDTO> list = articleservice.listartilePage(ai_id, cri);
			
			map.put("list", list);
			
			int artileCount = articleservice.count(ai_id);
			pageMaker.setTotalCount(artileCount);
			
			map.put("pageMaker", pageMaker);
			
			entity = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<Map<String,Object>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
