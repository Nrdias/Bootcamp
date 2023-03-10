package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    public Mentoring(){

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + date +
                '}';
    }

    @Override
    public double xpCalculate() {
        return DEFAULT_XP + 20d;
    }
}
