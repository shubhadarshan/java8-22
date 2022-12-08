package features.streams.sequential;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * different ways of creating Stream object
 * Stream is an Interface we'll get ReferencePipeline as it's impl Object
 */

public class CreateSequentialStream {
    public static void main(String[] args) {

        //collectionObj.stream()
        List<Integer> integers = Arrays.asList(10, 20, 30, 450, 560);
        Stream<Integer> integerStream = integers.stream();
        System.out.println(integerStream); //java.util.stream.ReferencePipeline$Head@1d251891

        //Arrays.stream(arr);
        Integer[] integerArray = new Integer[]{10, 202, 0, 44};
        Stream<Integer> stream = Arrays.stream(integerArray);
        System.out.println(stream); //java.util.stream.ReferencePipeline$Head@48140564

        //Stream.of(T... t)  vagArgs
        Stream<Integer> integerStream1 = Stream.of(10, 3, 2, 32344, 555);
        System.out.println(integerStream1); //java.util.stream.ReferencePipeline$Head@48140564

        //Stream.of(T t)
        Stream<Integer> integerArray1 = Stream.of(integerArray);
        System.out.println(integerArray1); //java.util.stream.ReferencePipeline$Head@7c30a502

        //Stream.builder()
        Stream.Builder<Object> builder = Stream.builder();
        Stream<Object> build = builder.add("a").add("b").add("c").build();
        System.out.println(build); //java.util.stream.ReferencePipeline$Head@3b6eb2ec

        //Stream.empty() Creates Empty Streams
        Stream<Object> empty = Stream.empty();
        System.out.println(empty); //java.util.stream.ReferencePipeline$Head@1e643faf
    }
}
