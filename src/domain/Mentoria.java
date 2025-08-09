package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate date;

    public Mentoria() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXP() {
        return XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }


}
