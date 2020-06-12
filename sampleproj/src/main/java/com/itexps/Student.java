/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

/**
 *
 * @author 16309
 */
public class Student {
    private String first;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Student(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Student{" + "first=" + first + ", last=" + last + '}';
    }

    public Student() {
    }
    
}
