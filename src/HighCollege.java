public class HighCollege implements ICollege, INameable {
    @Override
    public boolean canAccess(Student student) {
        return student.getVote() > 8;
    }

    @Override
    public boolean canBeAddedInQueue(Student student) {
        return student.getVote() > 6;
    }

    @Override
    public String getName() {
        return "High College Premium University";
    }

    @Override
    public String toString() {
        return getName();
    }
}
