public class MiddleCollege implements ICollege, INameable {
    @Override
    public boolean canAccess(Student student) {
        return student.getVote() > 6;
    }

    @Override
    public boolean canBeAddedInQueue(Student student) {
        return student.getVote() > 4;
    }

    @Override
    public String getName() {
        return "Middle College University";
    }

    @Override
    public String toString() {
        return getName();
    }
}
