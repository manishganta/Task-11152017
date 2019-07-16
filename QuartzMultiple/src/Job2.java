import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class Job2 implements Job {
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException{
		
		System.out.println("Hey, Job2 is running");
		System.out.println(new Date());
	}

}
