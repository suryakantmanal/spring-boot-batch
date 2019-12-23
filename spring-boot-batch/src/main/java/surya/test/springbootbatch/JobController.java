package surya.test.springbootbatch;

import java.util.HashMap;
import java.util.Map;

import javax.batch.runtime.BatchStatus;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class JobController {
	
	@Autowired
	JobLauncher launcher;
	
	@Autowired
	Job job;
	
	@GetMapping("/job")
	public void getJob() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException
	{
		
	Map<String, JobParameter> maps = new HashMap<>();
	JobParameters jobParameters = new JobParameters(maps);
	JobExecution execution = launcher.run(job, jobParameters);
	
	while(execution.getStatus().equals(BatchStatus.COMPLETED))
	{
		System.out.println("JOB COMPLETED");
	}
	
	
	}

}
