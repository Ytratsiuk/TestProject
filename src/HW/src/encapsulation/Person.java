package HW.src.encapsulation;
class Person {
    private String firstname;
    private String lastname;
    private String birthmonth;
    private String birthday;
    private int birthyear;
    private String ssn;
    Person (String firstname, String lastname, String birthmonth, String birthday, int birthyear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getBirthmonth(){
        return birthmonth;
    }
    public String getBirthday(){
        return birthday;
    }
    public int getBirthyear(){
        return birthyear;
    }
    public String getSsn(){
        return ssn;
    }
    public void formatBirthday(){
        System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
    }
}