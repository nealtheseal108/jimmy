package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public class ScopeMain {
    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();

        System.out.println("**********************************************");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

    }
}

// in this case, there are two variables in different public classes called privateVar, but the access modifiers of both (private) allow them to coexist (and because they are in different classes)

