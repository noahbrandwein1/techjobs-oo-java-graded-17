package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



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
}
