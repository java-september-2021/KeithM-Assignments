public class Project {
    private String name;
    private String description;


    public String elevatorPitch(){
        return (name + ": " + description);
    }

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Name

    //getter
    public String getProjectName(){
        return name;
    }

    //setter
    public void setProjectName(String name){
        this.name = name;
    }


    //Description

    //getter
    public String getProjectDescription(){
        return description;
    }

    //setter
    public void setProjectDescription(String description){
        this.description = description;
    }
}
