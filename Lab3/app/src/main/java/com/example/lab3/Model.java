package com.example.lab3;

public class Model {
    private int first;
    private int second;
    private int third;

    public Model(int rgb1, int rgb2, int rgb3){
        setFirst(rgb1);
        setSecond(rgb2);
        setThird(rgb3);
    }

    public void setFirst(int red) {
        if (red < 0){
            first = 0;
        }
        else if (red > 255){
            first = 255;
        }
        else{
            first = red;
        }
    }

    public int getFirst (){
        return first;
    }

    public void setSecond (int green){
        if (green < 0){
            second = 0;
        }
        else if (green < 0){
            second = 0;
        }
        else if (green > 255){
            second = 255;
        }
        else{
            second = green;
        }
    }

    public int getSecond(){
        return second;
    }

    public void setThird(int blue){
        if(blue < 0){
            third = 0;
        }
        else if (blue > 255){
            third = 255;
        }
        else{
            third = blue;
        }
    }

    public int getThird() {
        return third;
    }
}
