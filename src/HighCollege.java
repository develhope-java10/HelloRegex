public class HighCollege implements ICollege {
    @Override
    public boolean canAccess(Student student) {
        return student.getVote() > 8;
    }

    @Override
    public boolean canBeAddedInQueue(Student student) {
        return student.getVote() > 6;
    }
}
