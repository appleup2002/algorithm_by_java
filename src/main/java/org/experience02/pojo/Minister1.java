package org.experience02.pojo;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Minister1 implements Comparable<Minister1> {
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal product;

    public Minister1(BigDecimal left, BigDecimal right){
        this.left = left;
        this.right = right;
        this.product = left.multiply(right);
    }

    public BigDecimal getLeft() {
        return left;
    }

    public BigDecimal getRight() {
        return right;
    }

    public BigDecimal getProduct() {
        return product;
    }


    @Override
    public int compareTo(@NotNull Minister1 other) {
        return this.product.compareTo(other.getProduct());
    }
}
