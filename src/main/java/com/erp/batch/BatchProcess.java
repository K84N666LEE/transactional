package com.erp.batch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;
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
     * @Scheduled(fixedRate = 5000) // 5초마다 실행 : 실행이 끝나지 않아도 연속 실행 ( process 가 종료되지 않아도 2개이상이 연속해서 실행 )
     * @Scheduled(fixedDelay = 5000) // 5초마다 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
     * @Scheduled(cron = "0 52 20 * * *") // 매일 20시 52분에 실행
     */

    @Scheduled(fixedDelay = 10000) // 2초마다 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
    public void scheduleFixedRateTask() 
    {
    	bbs_board board = new bbs_board();
        int total = boardService.board_total(board);
        
        // display screen
        logger.debug("time is     : " + System.currentTimeMillis() / 1000);
        logger.debug("board_total : " + total);
    }

    @Scheduled(fixedDelay = 100000) // 2초마다 실행 : 실행이 끝나면 다음 스케줄 실행 ( process 가 종료되어야 실행됨 )
    public void scheduleUpdate() 
    {
        bbs_board board = new bbs_board();
        board.setBbs_num(813);
        logger.debug("Fixed rate task - " + System.currentTimeMillis() / 1000);
    }
    
	@Test
	//@Scheduled(fixedDelay = 50000)
	public void whenReadWithBufferedReader_thenCorrect() throws IOException
	//public static void main( String[] args ) throws IOException
	{
		bbs_board bbs = new bbs_board();
		String file ="C:/Temp/sample.txt";
		  
		BufferedReader     reader = new BufferedReader(new FileReader(file));
		StringBuilder     builder = new StringBuilder();
		String        currentLine = reader.readLine();
		String []           PARAM = null;
		
		while (currentLine != null) 
		{
			System.out.println( "--> " + currentLine );
		    builder.append(currentLine);
		    builder.append("\\n");
		
		    currentLine = reader.readLine();
		    PARAM = currentLine.split("\\|");
		    
		    bbs.setBbs_code   ( PARAM[0] );
		    bbs.setBbs_subject( PARAM[1] );
		    bbs.setBbs_name   ( PARAM[2] );
		    System.out.println( "insert into ndm_file values('" + bbs.getBbs_code() + "','" + bbs.getBbs_subject() + "','" + bbs.getBbs_name() +"');" );

		    //boardService.insert_ndm_file(ndm);
		    //System.out.println( "===> " + PARAM[0] + " - " + PARAM[1] + " - " + PARAM[2] );
		}
		reader.close();
	}

	/**
	 * File Reader : memory leak 방지
	 */
	//@Scheduled (fixedRate = 10000) 
	@Test 
	public void testSchedulerTask()
	{
		String FilePath = "C:/Temp/CPU_RANK.txt";
		File f = new File(FilePath);
		
		if( f.exists() )
		{
			FileReader     fr = null;
			BufferedReader br = null;
			String [] data;
			StringBuilder rs = new StringBuilder(); 

			try
			{
				fr = new FileReader(FilePath);
				br = new BufferedReader(fr);
				//Stack lines = new Stack();
				String line;
				int fcnt = 0;
				bbs_board bbs = new bbs_board();

				while( (line = br.readLine()) != null )
				{
					data = line.split("\\/"); 
					logger.debug( "["+fcnt+"]------------------------------------");
	
					for( String dt : data )
					{
						rs.append(dt);
						rs.append(",");
						bbs.setBbs_subject(dt);
						logger.debug("=> " + dt );
					}
					fcnt++;
				}
				br.close();
			}
			catch (FileNotFoundException e)
			{
				logger.debug("FileNotFoundException-");
			}
			catch (IOException e)
			{
				logger.debug("IOException-1");
			}
			finally
			{
				if( br != null )
				{
					try                   { br.close();                    } 
					catch (IOException e) { logger.debug("IOException-2"); }
				}
	
				if( fr != null )
				{
					try                   { fr.close();                    } 
					catch (IOException e) { logger.debug("IOException-3"); }				
				}
			}
		}
	}
}



