package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String title;
    private String description;
    private final LocalDate INICIALDATE = LocalDate.now();

    private final LocalDate FINALDATE = INICIALDATE.plusDays(45);

    private Set<Dev> subiscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getINICIALDATE() {
        return INICIALDATE;
    }

    public LocalDate getFINALDATE() {
        return FINALDATE;
    }

    public Set<Dev> getSubiscribedDevs() {
        return subiscribedDevs;
    }

    public void setSubiscribedDevs(Set<Dev> subiscribedDevs) {
        this.subiscribedDevs = subiscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(title, bootcamp.title) && Objects.equals(description, bootcamp.description) && Objects.equals(INICIALDATE, bootcamp.INICIALDATE) && Objects.equals(FINALDATE, bootcamp.FINALDATE) && Objects.equals(subiscribedDevs, bootcamp.subiscribedDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, INICIALDATE, FINALDATE, subiscribedDevs, contents);
    }
}
