public class Patient {
    private String name, DOB, doctorName;

    public Patient(String name, String DOB, String doctorName) {
        this.name = name;
        this.DOB = DOB;
        this.doctorName = doctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
