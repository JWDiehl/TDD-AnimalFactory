package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        AnimalFactory animalFactoryDog = new AnimalFactory();
        Dog dog = new Dog();
        Date birthdateForTony = new Date();

        String name = "Tony";

        Dog tony = animalFactoryDog.createDog(name, birthdateForTony);

        assertEquals(name, tony.getName());
        assertEquals(birthdateForTony, tony.getBirthDate());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateCat() {

        AnimalFactory animalFactoryCat = new AnimalFactory();
        Cat cat = new Cat();
        Date birthdateForSassie = new Date();

        String name = "Sassie";

        Cat sassie = animalFactoryCat.createCat(name, birthdateForSassie);

        assertEquals(name, sassie.getName());
        assertEquals(birthdateForSassie, sassie.getBirthDate());

    }
}
