package com.erp.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.erp.vo.bbs_board;
import com.erp.vo.mem_admin;

@Controller
@RequestMapping
public class BoardController 
{
	@Autowired private BoardService   boardService;

    private static final Logger  logger = LoggerFactory.getLogger(BoardController.class);

	// transaction + myBatis
    @RequestMapping(value="/", method={RequestMethod.POST,RequestMethod.GET})
    public String tran
    (
		  ModelMap  model
		, bbs_board board
		, mem_admin admin
    )
    throws Exception 
    {
    	logger.info("●●●●●●●●●●●●●●●●●●●●●●●●●●●●● 트랜잭션 ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");

        try 
        {
        	logger.info("●●●●●● 시작 ●●●●●");
            boardService.testTransaction(admin, board);

        } catch (Exception se) {
        	logger.info("●●●●●● Exception ●●●●●" + se.getMessage());
        } finally {
        	logger.info("●●●●●● finally ●●●●●");
        }
        model.addAttribute("rrr", "myBatis~");
        return "/include/index";
    }

}
