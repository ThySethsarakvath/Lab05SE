public class subject {
    private String name;
    private int credits;
    public subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    @Override
    public String toString() {
        return "Subject{" +
                "name =" + name + '\'' +
                ", credits =" + credits +
                '}';
    }
}