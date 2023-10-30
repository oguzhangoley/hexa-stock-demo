package com.oguz.stock.common.model;

public interface Event<T> {
    T toModel();
}
