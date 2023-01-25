public class Student implements INameable {
    private String name;
    private int vote;
    public Student(String name, int vote){
        this.name = name;
        this.vote = vote;
    }

    @Override
    public String getName(){
        return name;
    }

    public int getVote(){
        return vote;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setVote(int vote){
        this.vote = vote;
    }
}
