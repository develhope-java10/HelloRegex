public class Student {
    private String name;
    private int vote;
    public Student(String name, int vote){
        this.name = name;
        this.vote = vote;
    }
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
