package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.junit.Assert.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */



@RunWith(JUnit4.class)
public class JobTest {
    Job job1;
    Job job2;
    Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Before
    public void jobConstructor() {
        job1 = new Job();
        job2 = new Job();
    }

   // @Test
    //public void onlyContainsId(){
        //job object only contains if, return"oops! This job doesnt seem to exist.
       // assertTrue(job1.getId()!= 0);

      //assertEquals(null,job1.getName());
//      assertEquals("", job1.getEmployer().getValue());
//      assertEquals("", job1.getLocation().getValue());
//      assertEquals("", job1.getPositionType().getValue());
//      assertEquals("",job1.getCoreCompetency().getValue());

    //}
    @Test
    public void testSettingJobId(){

        assertEquals(false,job1.getId() == job2.getId());
        assertEquals(1, job2.getId()-job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester",job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence",job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job3.equals(job4));
    }

    @Test
    public void testToString(){


        String newLine = "\n";
        assertEquals(newLine.charAt(0),job3.toString().charAt(0));
        assertEquals(newLine.charAt(0),job3.toString().charAt(job3.toString().length()-1));

    }

    @Test
    public void testLabelField(){
        String jobString = "\nID: "+ job3.getId()+"\n"
                + "Name: "+ job3.getName()+ "\n"
                + "Employer: "+ job3.getEmployer().getValue()+"\n"
                + "Location: " +job3.getLocation().getValue()+"\n"
                + "Position Type: "+ job3.getPositionType().getValue()+ "\n"
                + "Core Competency: "+ job3.getCoreCompetency().getValue()+ "\n";
        String jobToString = job3.toString();

        assertEquals(jobString,jobToString);

    }

    @Test
    public void testEmptyField(){

        job3.getCoreCompetency().setValue("");
        String jobString = "\nID: "+job3.getId() + "\nName: " + job3.getName()+
                "\nEmployer: " + job3.getEmployer().getValue()+
                "\nLocation: " + job3.getLocation().getValue()+
                "\nPosition Type: " + job3.getPositionType().getValue()+
                "\nCore Competency: Data not available" +"\n";


        assertEquals(jobString, job3.toString());

    }





}
