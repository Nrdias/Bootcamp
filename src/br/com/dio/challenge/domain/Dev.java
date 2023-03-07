package br.com.dio.challenge.domain;

//Vou utilizar LinkedHashSet, pois não haverão conteúdos repetidos.
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents  = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void bootcampSubscribe(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubiscribedDevs().add(this);

    }
    public void progress(){
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()){
            this.finishedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else{
            System.out.println("Você não está inscrito em nenhum curso");
        }
    }
    public double xpCalculateTotal(){
    return this.finishedContents.stream().mapToDouble(Content::xpCalculate).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return name.equals(dev.name) && subscribedContents.equals(dev.subscribedContents) && finishedContents.equals(dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, finishedContents);
    }
}
