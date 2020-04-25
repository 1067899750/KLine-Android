package com.github.tifezh.kchart.view;

/**
 * @author puyantao
 * @description :
 * @date 2020/4/25
 */
public class PieChartData {
    private int color;
    private String name;
    private float num;
    private String unit;

    public PieChartData(int color, String name, float num, String unit) {
        this.color = color;
        this.name = name;
        this.num = num;
        this.unit = unit;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}


