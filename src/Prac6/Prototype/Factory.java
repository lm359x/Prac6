package Prac6.Prototype;

public class Factory {
    private Project project;

    public Factory(Project project) {
        this.project = project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
