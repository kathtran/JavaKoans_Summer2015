package java7;

import com.sandwich.koan.Koan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutDiamondOperator {

    @Koan
    public void diamondOperator () {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //Generic type of array list inferred - empty <> operator
        List<String> animalsList = new ArrayList<String>(Arrays.asList(animals));
        ArrayList<String> actual = new ArrayList<String>();
        actual.add("Dog");
        actual.add("Cat");
        actual.add("Tiger");
        actual.add("Elephant");
        actual.add("Zebra");
        assertEquals(animalsList, actual);
    }

    @Koan
    public void diamondOperatorInMethodCall () {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //type of new ArrayList<>() inferred from method parameter
        List<String> animalsList = fill(new ArrayList<String>());
        ArrayList<String> actual = new ArrayList<String>();
        actual.add("Dog");
        actual.add("Cat");
        actual.add("Tiger");
        actual.add("Elephant");
        actual.add("Zebra");
        assertEquals(animalsList, actual);
    }

    private List<String> fill(List<String> list){
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        list.addAll(Arrays.asList(animals));
        return list;
    }

}
