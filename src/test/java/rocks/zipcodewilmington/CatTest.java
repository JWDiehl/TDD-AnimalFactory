package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`

    @Test
    public void testSetName() {

        Cat cat = new Cat();

        cat.setName("Ava");
        assertEquals("Ava", cat.getName());
    }


    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {

        Cat cat = new Cat();
        String actual = "meow!";
        String expected = cat.speak();
        assertEquals("meow!", cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat();
        Date expectedBirthDate = new Date();
        cat.setBirthDate(expectedBirthDate);
        Date actualBirthDate = cat.getBirthDate();
        assertEquals(expectedBirthDate, actualBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat () {
        Cat cat = new Cat();
        cat.eat(new Food("Friskies"));
        Integer expected = 1;
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testGetId() {
        Cat cat = new Cat();
        cat.getId();
        int expected = cat.getId();
        Assert.assertEquals(expected, 0);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat();
        assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat();
        assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}
