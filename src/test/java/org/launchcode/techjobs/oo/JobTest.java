package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;


public class JobTest {
    //TODO: Create your unit tests here

    private Job job1;
    private Job job2;

    @Before
    public void setup() {
        job1 = new Job("Software Developer", new Employer("ABC Corp"), new Location("New York"), new PositionType("Full Time"), new CoreCompetency("Java"));

        job2 = new Job("Software Developer", new Employer("XYZ Inc"), new Location("San Francisco"), new PositionType("Full Time"), new CoreCompetency("Java"));
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Software Developer", job1.getName());
        assertEquals("ABC Corp", job1.getEmployer().getValue());
        assertEquals("New York", job1.getLocation().getValue());
        assertEquals("Full Time", job1.getPositionType().getValue());
        assertEquals("Java", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String job1ToString = job1.toString();
        assertTrue(job1ToString.startsWith("\n"));
        assertTrue(job1ToString.endsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String job1ToString = job1.toString();

        assertTrue(job1ToString.contains("ID: " + job1.getId()));
        assertTrue(job1ToString.contains("Name: " + job1.getName()));
        assertTrue(job1ToString.contains("Employer: " + job1.getEmployer()));
        assertTrue(job1ToString.contains("Location: " + job1.getLocation()));
        assertTrue(job1ToString.contains("Position Type: " + job1.getPositionType()));
        assertTrue(job1ToString.contains("Core Competency: " + job1.getCoreCompetency()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String jobToString = job1.toString();
        assertTrue(jobToString.startsWith(System.lineSeparator()));
        assertTrue(jobToString.endsWith(System.lineSeparator()));
    }
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

}
