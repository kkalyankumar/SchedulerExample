package com.ehc.scheduler;

import org.apache.log4j.Logger;

public class FirstTask {

  private static Logger log = Logger.getLogger(FirstTask.class);

  public void execute() {
    log.debug("FirstTask runs successfully...");
  }
}
