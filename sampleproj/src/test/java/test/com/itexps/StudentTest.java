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
    public void testFirstName() throws InterruptedException {
        stu.setFirst("tom");
        assertEquals("tom", stu.getFirst());
        Thread.sleep(30000);
    }
    
    @Test
    public void testLastName() throws InterruptedException {
        stu.setLast("smith");
        assertEquals("smith", stu.getLast());
        Thread.sleep(30000);
    }
    
    @Test
    public void testFirstName1() throws InterruptedException {
        stu.setFirst("tommy");
        assertEquals("tommy", stu.getFirst());
        Thread.sleep(30000);
    }
    @Test
    public void testLastName1() throws InterruptedException {
        stu.setLast("jones");
        assertEquals("jones", stu.getLast());
        Thread.sleep(30000);
    }
}
