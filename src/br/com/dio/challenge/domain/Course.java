package br.com.dio.challenge.domain;

public class Course extends Content{

    private Integer workload;

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public double calculateXP(){
        return 0;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double xpCalculate() {
        return DEFAULT_XP * workload;
    }
}
