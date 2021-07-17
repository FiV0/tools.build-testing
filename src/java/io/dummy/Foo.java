package io.dummy;

import it.unimi.dsi.bits.BitVector;
import it.unimi.dsi.bits.BitVectors;

public class Foo {
    private int data;
    BitVector bv;

    public Foo(int data){
        this.data = data;
        this.bv = BitVectors.EMPTY_VECTOR;
    }

    public int getData() {
        return data;
    }
}
