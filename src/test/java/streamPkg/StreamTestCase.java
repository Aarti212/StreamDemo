package streamPkg;

import org.apache.logging.log4j.core.util.Assert;
import org.example.StreamNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Test.*;
import java.util.List;
import java.util.ArrayList;

public class StreamTestCase {

    @Test
    public void test(){
        StreamNumber streamTestObj=new StreamNumber();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(13);
        list.add(8);
        list.add(9);
        List<Integer> actualEvenList=streamTestObj.findEven(list);
        List<Integer> expectedEvenList=new ArrayList<Integer>();
        expectedEvenList.add(4);
        expectedEvenList.add(8);
        Assertions.assertEquals(expectedEvenList,actualEvenList);

        List<Integer> actualOddList=streamTestObj.findOdd(list);
        List<Integer> expectedOddList=new ArrayList<Integer>();
        expectedOddList.add(13);
        expectedOddList.add(9);
        Assertions.assertEquals(expectedOddList,actualOddList);

        List<Integer> actualPrimeList=streamTestObj.findPrime(list);
        List<Integer> expectedPrimeList=new ArrayList<Integer>();
        expectedPrimeList.add(13);
        Assertions.assertEquals(expectedPrimeList,actualPrimeList);


    }
}
