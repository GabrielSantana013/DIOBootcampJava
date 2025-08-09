package domain;

public class Curso extends Conteudo{

    private int workLoad;

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }

    @Override
    public double calcXP() {
        return XP * workLoad;
    }
}
