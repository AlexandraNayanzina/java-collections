package org.naianzina.zaurcourse.collections.lambda;

import java.util.function.Function;

public class LambdaExample1 {

    public static void main(String [] args){


        abc(6, (String str)-> {return str.length();});


    }

    static void abc(int c, A a){
        System.out.println(a.check("Hello"));
        }

    }


interface A{
    int check(String s);
}

