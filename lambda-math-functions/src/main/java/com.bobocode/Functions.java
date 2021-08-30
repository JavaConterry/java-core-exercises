package com.bobocode;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sgn, increment, decrement, square)

        intFunctionMap.addFunction("increment", a -> a+1);
        intFunctionMap.addFunction("decrement", a -> a-1);
        intFunctionMap.addFunction("square", a -> a*a);
        intFunctionMap.addFunction("abs", a -> Math.abs(a));
        intFunctionMap.addFunction("sgn", a -> sgn(a));

        return intFunctionMap;
    }

    private static int sgn(int value){

        if(value<0){
            return -1;
        }
        else if(value==0){
            return 0;
        }
        else{
            return 1;
        }

    }
}
