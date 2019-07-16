import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class Job1 implements Job{
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException{
		
		System.out.println("Hey, Job1 is running");
		System.out.println(new Date());
	}

}
