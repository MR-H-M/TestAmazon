package com.MavenTest;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangHrm {
  @Test
  public void f() {
	  System.out.println("harsh");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("my name");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("my age ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("it's 4");
  }

}
