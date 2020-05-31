package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import static org.junit.Assert.*;


public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test_job = new Job();
        Job test_job2 = new Job();
    assertFalse(test_job.getId() == test_job2.getId());
    assertTrue(test_job2.getId() - test_job.getId() == 1);

        //TODONE: TEST EMPTY CONSTRUCTOR
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      assertTrue(test_job.getName() == "Product tester");
      assertTrue(test_job.getEmployer().getValue() == "ACME");
      assertTrue(test_job.getLocation().getValue()=="Desert");
      assertTrue(test_job.getPositionType().getValue() == "Quality control");
      assertTrue(test_job.getCoreCompetency().getValue() == "Persistence");
      assertTrue(test_job.getEmployer() instanceof Employer);
      assertTrue(test_job.getLocation() instanceof Location);
      assertTrue(test_job.getPositionType() instanceof PositionType);
      assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);

        //TODONE: TEST FULL CONSTRUCTOR
    }
    @Test
    public void testJobsForEquality(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertFalse(test_job.equals(test_job2));
    //TODONE: TEST EQUALS METHOD
    }
@Test
public void testJobsToString(){
 Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
  assertTrue(test_job.toString().endsWith("\n"));
  assertTrue(test_job.toString().startsWith("\n"));
}

@Test
    public void testJobsToString2(){
    Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String[] someStrings1 = test_job.toString().split("\n");
   assertTrue( someStrings1[1].contains("ID: "));
   assertTrue( someStrings1[2].contains("Name: "));
   assertTrue( someStrings1[3].contains("Employer: "));
   assertTrue(someStrings1[4].contains("Location: "));
   assertTrue(someStrings1[5].contains("Position Type: "));
   assertTrue(someStrings1[6].contains("Core Competency: "));
}

@Test
    public void testJobsToString3(){
    Job test_job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.toString().contains("Data not available"));
}
}

