package com.may.java8.basics;

import java.util.ArrayList;
import java.util.List;

public class GenericsSample {


    public static void main(String[] args) {
        /*
         There are some limitations when using bounded wildcards:
         we can only get stuff from the covariant list, and we can only put stuff in the contravariant list.
         Actual rule is a bit more general since the parameterized class could be anything, not just a List-like container:
         we can only use the covariant type parameter as a return type, and we can only use the contravariant type parameter as an input type.
         https://dzone.com/articles/covariance-and-contravariance
         Java Variance Rules: https://briangordon.github.io/2014/09/covariance-and-contravariance.html
         */
        List<? extends Number> a = new ArrayList<>();
        List<? super Number> b = new ArrayList<>();
        // a.add(3);    // fails
        a.add(null); // works
        b.add(3);    // no problem

        Number ai = a.get(0); // no problem
        // Number bi = b.get(0); // fails
        Object o = b.get(0);  // works
    }
}


