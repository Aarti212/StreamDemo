package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNumber {
    private static final Logger LOGGER = LogManager.getLogger(StreamNumber.class);

    public static void main(String[] args) {
        LOGGER.info("Program starts");
        try {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(4);
            list.add(14);
            list.add(8);
            list.add(7);
            list.add(9);
            list.add(16);
            List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
            LOGGER.debug("even numbers using stream are: " + evenList);

            List<Integer> oddList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
            LOGGER.debug("odd numbers using stream are: " + oddList);
            List<Integer> primeList = list.stream().filter(StreamNumber::isPrime).collect(Collectors.toList());
            LOGGER.debug("odd numbers using stream are: " + primeList);
        }
        catch (Exception e){
            LOGGER.error("exception thrown: "+e);
            throw new RuntimeException();
        }
        finally {
            LOGGER.info("End of Program");
        }
    }
    public static boolean isPrime ( int number){
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

}
