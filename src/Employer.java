public class Employer {
    private String employer;

    public Employer(String employer)
    {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return this.employer;
    }

    public String getEmployer() {
        return employer;
    }
}
