public class ProjectTest {
    public static void main(String[] args){
        Project noInfoProj = new Project();
        Project noNameProj = new Project("Project Name");
        Project allInfoProj = new Project("Another Project Name", "A short project description");

        System.out.println(noInfoProj.elevatorPitch());
        System.out.println(noNameProj.elevatorPitch());
        System.out.println(allInfoProj.elevatorPitch());

        noInfoProj.setProjectName("Setter Project");
        System.out.println(noInfoProj.getProjectName());

    }
}
