package kr.co.two.board.controller;



import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.two.board.dto.InformDTO;
import kr.co.two.board.service.InformService;

@Controller
public class InformController {
	
	@Autowired InformService service;

	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@GetMapping(value = "informWrite.go")
	public String informWrite() {
		
		return "informWrite";
	}
	
	   @PostMapping(value = "/informWrite.do")
	   public ModelAndView infromWriteDo(InformDTO dto) {
	      logger.info(dto.getSubject()+"/"+dto.getMember_id());
	      logger.info("content size : "+dto.getContent().length());
	      return service.informWriteDo(dto);
	   }
	
	@GetMapping(value = "/informList.go")
	public String informList() {
		
		return "informList";
	}
	
//	@GetMapping(value = "/informList.do")
//	public ModelAndView informListDo() {
//		
//		return service.informList();
//	}
	
	   @GetMapping(value = "/informDetail.do")
	   public ModelAndView detail(@RequestParam String board_id) {
	      return service.informDetail(board_id);
	   }
	   
	   @GetMapping(value = "/informUpdate.go")
	   public ModelAndView informUpdate(String board_id) {

		   return service.informUpdate(board_id);
	   }
	   
	   @PostMapping(value = "/informUpdate.do")
	   public String informUpdateDo(@RequestParam HashMap<String, Object> params) {
		   logger.info("params : "+params);
		   return service.informUpdateDo(params);
	   }
	   
	   @GetMapping(value = "/informDel.do")
	   public ModelAndView delete(String board_id, RedirectAttributes ratt) {
		   return service.delete(board_id, ratt);
	   }
	   
	   @GetMapping(value = "/informDel.ajax")
	   @ResponseBody
	   public HashMap<String, Object> informDel(@RequestParam(value="delList[]") ArrayList<String> delList){
		   
		   logger.info("왜 안돼? :"+delList);
		   return service.informDel(delList);
	   }
	   
	   @PostMapping(value = "informList.ajax")
	   @ResponseBody
	   public HashMap<String, Object> listCall(@RequestParam String page, @RequestParam String cnt,
				 @RequestParam String opt,@RequestParam String keyword){
			
			return service.listCall(Integer.parseInt(page),Integer.parseInt(cnt),opt,keyword);
	   }
	   }

