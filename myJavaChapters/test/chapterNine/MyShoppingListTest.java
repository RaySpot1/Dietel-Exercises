package chapterNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyShoppingListTest {
    MyShoppingList list;
    @BeforeEach
    public void setup(){
         list = new MyShoppingList(0);
    }


    @Test
    public void addToList(){
        list.canAddToList("Bread");
        assertArrayEquals(new String[]{"Bread", null, null, null},list.getProductName());
    }

    @Test
    public void listSizeTest(){
        list.canAddToList("Bread");
        list.canAddToList("Beans");
        list.canAddToList("Eggs");
        list.canAddToList("Tea");
        assertEquals(4, list.getSize());
    }

    @Test
    public void checkListCapacityTest(){
        list.canAddToList("Bread");
        list.canAddToList("Beans");
        list.canAddToList("Eggs");
        list.canAddToList("Tea");
        list.canAddToList("mango");
        list.canAddToList("Pawpaw");
        list.canAddToList("Cashew");
        list.canAddToList("mango");
        list.canAddToList("Pawpaw");
        list.canAddToList("Cashew");
        assertEquals(10, list.getSize());
    }

    @Test
    public void removeFromListTest(){

    }

}

