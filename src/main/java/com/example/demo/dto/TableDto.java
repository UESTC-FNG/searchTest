package com.example.demo.dto;

import com.example.demo.bo.CCons;

import java.util.List;

public class TableDto {
   private int count;

   private List<CCons> cCons;

    public TableDto(int count, List<CCons> cCons) {
        this.count = count;
        this.cCons = cCons;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CCons> getcCons() {
        return cCons;
    }

    public void setcCons(List<CCons> cCons) {
        this.cCons = cCons;
    }

    @Override
    public String toString() {
        return "TableDto{" +
                "count=" + count +
                ", cCons=" + cCons +
                '}';
    }
}

