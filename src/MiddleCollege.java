public class MiddleCollege implements ICollege {
    @Override
    public boolean canAccess(Student student) {
        return student.getVote() > 6;
    }

    @Override
    public boolean canBeAddedInQueue(Student student) {
        return student.getVote() > 4;
    }
}
