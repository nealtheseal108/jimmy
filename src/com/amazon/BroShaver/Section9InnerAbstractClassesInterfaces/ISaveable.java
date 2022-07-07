package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
