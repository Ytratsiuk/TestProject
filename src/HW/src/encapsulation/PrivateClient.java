package HW.src.encapsulation;

 public class PrivateClient {
    private String name;
    private String ssn;

     PrivateClient(String name, String ssn) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        if (ssn != null && !ssn.isEmpty()) {
            this.ssn = ssn;
        }
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }
}
