package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testAddCatHouse() {
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 1;
        assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveID() {
        Cat cat = new Cat();
        CatHouse.add(cat);
        CatHouse.remove(cat.getId());
        Integer expected = 0;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCatHouse() {
        Cat cat = new Cat();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 0;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatByID() {
        Cat cat = new Cat();
        CatHouse.getCatById(0);
        Integer expected = 0;
        Assert.assertEquals(expected, cat.getId());
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        Cat cat = new Cat();
        CatHouse.getNumberOfCats();
        Integer expected = 0;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
}
