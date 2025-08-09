package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

    private Set<Dev> registeredDevelopers = new HashSet<>();
    private Set<Conteudo> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getRegisteredDevelopers() {
        return registeredDevelopers;
    }

    public void setRegisteredDevelopers(Set<Dev> registeredDevelopers) {
        this.registeredDevelopers = registeredDevelopers;
    }

    public Set<Conteudo> getContents() {
        return contents;
    }

    public void setContents(Set<Conteudo> contents) {
        this.contents = contents;
    }
}
