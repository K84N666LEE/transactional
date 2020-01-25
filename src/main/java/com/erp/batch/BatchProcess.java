package com.erp.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.erp.board.BoardController;
import com.erp.board.BoardService;
import com.erp.vo.bbs_board;

@Configuration
@EnableScheduling
public class BatchProcess
{
	@Autowired private BoardService   boardService;
    private static final Logger  logger = LoggerFactory.getLogger(BoardController.class);

    /*
     * @Scheduled(fixedRate = 5000) // 5초마자 실행 : 실행이 끝나지 않아도 연속 실행 ( process 가 종료되지 않아도 2개이상이 연속해서 실행 )
     * @Scheduled(fixedDelay = 5000) // 5초마자 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
     * @Scheduled(cron = "0 52 20 * * *") // 매일 20시 52분에 실행
     */

    @Scheduled(fixedDelay = 100000) // 2초마자 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
    public void scheduleFixedRateTask() 
    {
    	bbs_board board = new bbs_board();
        int total = boardService.board_total(board);
        
        // display screen
        logger.debug("time is     : " + System.currentTimeMillis() / 1000);
        logger.debug("board_total : " + total);
    }

    @Scheduled(fixedDelay = 100000) // 2초마자 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
    public void scheduleUpdate() 
    {
        bbs_board board = new bbs_board();
        board.setBbs_num(813);
        logger.debug("Fixed rate task - " + System.currentTimeMillis() / 1000);
    }
}