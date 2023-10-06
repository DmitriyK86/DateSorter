package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> test = new ArrayList<>();
        test.add(LocalDate.of(2004,07,01));
        test.add(LocalDate.of(2005,01,02));
        test.add(LocalDate.of(2007,02,01));
        test.add(LocalDate.of(2032,05,03));
        test.add(LocalDate.of(2038,06,03));
        DateSorter dateSorter = new DateSorter();
        System.out.println(dateSorter.sortDates(test));
    }
}