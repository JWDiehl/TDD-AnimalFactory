package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
//@RunWith(Enclosed.class)
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testDogName() {

        Dog dog = new Dog();

        dog.setName("Paulie");
        assertEquals("Paulie", dog.getName());
    }

    // TODO - Create tests for `speak`

    @Test
    public void testDogSpeak() {

            Dog dog = new Dog();
            String actual = "bark!";
            String expected = dog.speak();
            assertEquals("bark!", dog.speak());
        }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testDogSetBirthDate() {
        Dog dog = new Dog();
        Date expectedBirthDate = new Date();
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();
        assertEquals(expectedBirthDate, actualBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testDogEat() {
        Dog dog = new Dog();
        dog.eat(new Food("Grub"));
        Integer expected = 1;
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testDogGetId() {
        Dog dog = new Dog();
        dog.getId();
        int expected = dog.getId();
        Assert.assertEquals(expected, 0);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);

    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
