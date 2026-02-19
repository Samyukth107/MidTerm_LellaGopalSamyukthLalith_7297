package midterm.SamyukthLalithLellaGopal.model;

public class Employment {

    private String fullname;
    private String contactNumber;
    private String email;
    private String dateAvailable;
    private String salary;

    public Employment() {
    }

    public Employment(String fullname, String contactNumber, String email,
                      String dateAvailable, String salary) {
        this.fullname = fullname;
        this.contactNumber = contactNumber;
        this.email = email;
        this.dateAvailable = dateAvailable;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
