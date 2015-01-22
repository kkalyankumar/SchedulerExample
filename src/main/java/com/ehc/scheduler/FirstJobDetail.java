package com.ehc.scheduler;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstJobDetail extends QuartzJobBean {
  private static Logger logger = Logger.getLogger(FirstJobDetail.class);
  private ISchedulerService schedulerService;
  private JobExecutionContext jobExecutionContext;

  protected void executeInternal(JobExecutionContext jobExecContext) throws JobExecutionException {
    setJobExecutionContext(jobExecContext);
//    getSchedulerService().getFirstTask().execute();
  }

  public ISchedulerService getSchedulerService() {
    return schedulerService;
  }

  public void setSchedulerService(ISchedulerService schedulerService) {
    this.schedulerService = schedulerService;
  }

  public JobExecutionContext getJobExecutionContext() {
    return jobExecutionContext;
  }

  public void setJobExecutionContext(JobExecutionContext jobExecutionContext) {
    this.jobExecutionContext = jobExecutionContext;
  }
}
