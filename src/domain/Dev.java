package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> subscribedContents = new LinkedHashSet<>();
    private Set<Conteudo> finishedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Conteudo> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Conteudo> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Conteudo> finishedContents) {
        this.finishedContents = finishedContents;
    }

    public void bootcampApply(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevelopers().add(this);
    }

    public void progress(){
        Optional<Conteudo> content = this.subscribedContents
                .stream().findFirst();
        if(content.isPresent()){
            this.finishedContents.add(content.get());
            this.subscribedContents.remove((content.get()));
        }
        else{
            System.err.println("Você não ta matriculado em nenhum conteúdo!");
        }
    }

    public double calcTotalXp(){
        return this.finishedContents
                .stream()
                .mapToDouble(Conteudo::calcXP).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, finishedContents);
    }
}
