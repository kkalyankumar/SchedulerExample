package com.ehc.scheduler;

import org.apache.log4j.Logger;

public class SecondTask {
  private static Logger log = Logger.getLogger(SecondTask.class);

  public void execute() {
    log.debug("SecondTask runs successfully...");
  }
}
