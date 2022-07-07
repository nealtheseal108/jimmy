package com.amazon.BroShaver.Section11NamingConventionsStaticFinal.example;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
