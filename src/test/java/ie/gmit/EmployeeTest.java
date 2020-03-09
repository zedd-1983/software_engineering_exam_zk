/*
    Employee class unit test
    Author: Zdenek Krousky
    g00267758

 */

package ie.gmit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    Employee emp;

    @BeforeAll
    public static void startTest() {
        System.out.println("Starting Employee class test");
    }

    @AfterAll
    public static void endTest() {
        System.out.println("Employee class test ended");
    }

    @BeforeEach
    public void init() {
        emp = new Employee("zdenek","12345678","12345",37);
    }

    @DisplayName("Default constructor test")
    @Test
    public void testDefaultConstructor() {
        assertThrows(IllegalArgumentException.class, ()-> {new Employee();});
    }

    @DisplayName("Parametric constructor test")
    @Test
    public void testParamConstructorValid() {
        assertEquals("zdenek", emp.getName());
        assertEquals("12345678", emp.getPhone());
        assertEquals("12345", emp.getId());
        assertEquals(37, emp.getAge());
    }

    @DisplayName("Parametric constructor test 2")
    @Test
    public void testParamConstructorInvalid() {
        assertThrows(IllegalArgumentException.class, ()-> { new Employee("","12", "111",15);});
    }

    @DisplayName("Name setter VALID test")
    @Test
    public void testNameSetterValid() {
        emp.setName("Jason");
        assertEquals("Jason", emp.getName());
    }

    @DisplayName("Name setter INVALID test 1 (less than 3)")
    @Test
    public void testNameSetterInvalid() {
        StringIndexOutOfBoundsException sioobe =
                assertThrows(StringIndexOutOfBoundsException.class, ()-> {emp.setName("aaa");});
        assertEquals("Name must be between 3 and 25 characters long", sioobe.getMessage());
    }

    @DisplayName("Name setter INVALID test 2 (longer than 25)")
    @Test
    public void testNameSetterInvalid2() {
        StringIndexOutOfBoundsException sioobe =
                assertThrows(StringIndexOutOfBoundsException.class, ()-> {emp.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");});
        assertEquals("Name must be between 3 and 25 characters long", sioobe.getMessage());
    }

    @DisplayName("Phone setter VALID test")
    @Test
    public void testPhoneSetterValid() {
        emp.setPhone("12345678");
        assertEquals("12345678", emp.getPhone());
    }

    @DisplayName("Phone setter INVALID test (not 8 characters)")
    @Test
    public void testPhoneSetterInvalid() {
        IllegalArgumentException iae =
                assertThrows(IllegalArgumentException.class, ()-> {emp.setPhone("123456789");});
        assertEquals("Phone number must be 8 digits long", iae.getMessage());
    }

    @DisplayName("Id setter VALID test")
    @Test
    public void testIdSetterValid() {
        emp.setId("12345");
        assertEquals("12345", emp.getId());
    }

    @DisplayName("Id setter INVALID test")
    @Test
    public void testIdSetterInvalid() {
        IllegalArgumentException iae =
                assertThrows(IllegalArgumentException.class, ()->{emp.setId("123456");});
        assertEquals("Id must be 5 digits long", iae.getMessage());
    }

    @DisplayName("Age setter VALID test")
    @Test
    public void testAgeSetterValid() {
        emp.setAge(20);
        assertEquals(20, emp.getAge());
    }

    @DisplayName("Age setter INVALID test")
    @Test
    public void testAgeSetterInvalid() {
        IllegalArgumentException iae =
                assertThrows(IllegalArgumentException.class, ()->{emp.setAge(10);});
        assertEquals("Must be over 16", iae.getMessage());
    }

}
