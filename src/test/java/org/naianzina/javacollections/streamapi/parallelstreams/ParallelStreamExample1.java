package org.naianzina.javacollections.streamapi.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample1 {

    /*
      ******Parallel Streams****
      Split the data into multiple parts, allowing different parts of the collection to be processed
      simultaneously, giving us a boost in performance on multicore systems.
            */

     public static void main(String [] args){
         List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 8, 5, 4, 3, 2, 9);

         System.out.println(numbers);

         numbers.stream()
                 .parallel()
                 .forEach(System.out::print);
     }
}


