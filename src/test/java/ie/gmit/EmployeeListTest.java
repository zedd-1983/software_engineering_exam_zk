/*
    EmployeeList class unit test
    Author: Zdenek Krousky
    g00267758

 */
package ie.gmit;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeListTest {

    ArrayList<Employee> list;
    EmployeeList empList;

    @BeforeAll
    public static void startTest() {
        System.out.println("Starting EmployeeList test");
    }

    @AfterAll
    public static void endTest() {
        System.out.println("EmployeeList test ended");
    }

    @BeforeEach
    public void init() {
        empList = new EmployeeList(list);
    }

    @DisplayName("Default constructor test")
    @Test
    public void testDefaultConstructor() {
        IllegalArgumentException iae =
                assertThrows(IllegalArgumentException.class, ()-> {new EmployeeList();});
        assertEquals("Need to provide parameters to create employee list", iae.getMessage());
    }

    @DisplayName("Parametric constructor VALID test")
    @Test
    public void testParamConstructorValid() {
        assertEquals(0, empList.getListSize());
    }

    @DisplayName("Parametric constructor INVALID test")
    @Test
    public void testParamConstructorInvalid() {
        IllegalArgumentException iae =
                assertThrows(IllegalArgumentException.class, ()-> { new EmployeeList();});
        assertEquals("Need to provide EmployeeList as parameter", iae.getMessage());
    }


}
