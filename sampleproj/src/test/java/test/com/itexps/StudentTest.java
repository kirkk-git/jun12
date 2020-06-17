/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 16309
 */
public class StudentTest {

    Student stu;

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stu = new Student();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFirstName() {
        stu.setFirst("tom");
        assertEquals("tom", stu.getFirst());
    }
    
    @Test
    public void testLastName() {
        stu.setLast("smith");
        assertEquals("smith", stu.getLast());
    }
    
    @Test
    public void testFirstName1() {
        stu.setFirst("tommmy");
        assertEquals("tom", stu.getFirst());
    }
    @Test
    public void testLastName1() {
        stu.setLast("jones");
        assertEquals("jones", stu.getLast());
    }
}
