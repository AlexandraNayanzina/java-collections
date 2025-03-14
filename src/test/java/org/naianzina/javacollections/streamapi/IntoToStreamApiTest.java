package org.naianzina.javacollections.streamapi;

public class IntoToStreamApiTest {

    /*
    WHAT IS STREAM?

    - A Stream is not a dta structure but a sequence of elements that can be processed
     in parallel or sequentially. It provides a way to worrk with collections in a functional
     programming style.

     - The Stream does NOT modify the original collection. Instead, it processes the data in a pipeline of
     operations, transforming it without affecting the underlying data structure.

     - Streams allow to express complex data processing in a declarative way, which means you specify
     what you want to do, rather than how to do it. This leads to more readable and concise code.

   WHY USE STREAM?

    - Concise and Readable Code: Stream allow you to perform complex operations with fewer lines of code,
    improving readability.
    - Functional programming: The Stream API encourages a functional programming style, allowing you to pass
    behavior like lambda to methods.
    - Parallel Processing: Stream can be processed in parallel, leveraging multi-core processing to boost performance.

    - Non-modifying: Operations performed on streams do not modify the original collection,
    maintaining data integrity

    HOW STREAM WORK?
    A Stream pipeline consists of 3 parts:

    1. Source: The collection of data source from which the stream is created. List, Set, or Map can serve
    as source for the stream.

    2. Intermediate Operations: These are operations that transform the stream such as:
    filter(); map(); sorted()
    Intermediate operations are lazy, means they do not execute until a terminal operation is called

    3. Terminal operations: The final operation in the pipeline, which triggers the execution of the entire stream.
    Terminal operations are:
    forEach(); collect(); reduce()

    */
}
