import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


public class QuartzMultipleMain {

	/**
	 * @param args
	 * @throws SchedulerException 
	 */
	public static void main(String[] args) throws SchedulerException {
		// TODO Auto-generated method stub
		
		JobDetail job1 = JobBuilder.newJob(Job1.class).build();
		
		Trigger t1 = TriggerBuilder.newTrigger().withIdentity("Job1 trigger").startNow().build();
		
		Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
		
		sc.start();
		sc.scheduleJob(job1, t1);
		
		JobDetail job2 = JobBuilder.newJob(Job2.class).build();
		
		Trigger t2 = TriggerBuilder.newTrigger().withIdentity("Job2 Trigger").startNow().build();
		
		Scheduler sc2 = StdSchedulerFactory.getDefaultScheduler();
		
		sc2.start();
		sc2.scheduleJob(job2, t2);
		
		JobDetail job3 = JobBuilder.newJob(Job3.class).build();
		
		Trigger t3 = TriggerBuilder.newTrigger().withIdentity("Job3 Trigger").startNow().build();
		
		Scheduler sc3 = StdSchedulerFactory.getDefaultScheduler();
		
		sc3.start();
		sc3.scheduleJob(job3, t3);

	}
	
	
	
	

}
