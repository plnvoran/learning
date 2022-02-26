package com.learing;

import java.util.Objects;

public class TestC {

    int i;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestC testC = (TestC) o;
        return i == testC.i && name.equals(testC.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, name);
    }



    public TestC(int i) {
        this.i = i;
    }
}
