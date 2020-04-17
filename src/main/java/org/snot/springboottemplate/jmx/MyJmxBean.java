package org.snot.springboottemplate.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class MyJmxBean {

    private int i = 0;

    @ManagedAttribute
    public int get() {
        return i;
    }

    @ManagedOperation
    public void reset() {
        i = 0;
    }

    @ManagedOperation
    public int display() {
        return i;
    }

    @ManagedOperation
    public void increment() {
        i++;
    }
}
