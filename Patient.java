public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String gender;
    // Add other relevant attributes such as contact info, medical history, etc.
 public void main(String args[]){

 
    // Constructor with all attributes
    public Patient(int patientId, String name, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        // Initialize other attributes as needed
    }

    // Empty constructor
    public Patient() {
        // Use this constructor to create a new patient with default values
    }

    // Getters and Setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
  
// Create a new patient object
Patient patient1 = new Patient();

// Set patient attributes using setters
patient1.setPatientId(1);
patient1.setName("John Doe");
patient1.setAge(35);
patient1.setGender("Male");

// Retrieve patient information using getters
System.out.println("Patient ID: " + patient1.getPatientId());
System.out.println("Patient Name: " + patient1.getName());
System.out.println("Patient Age: " + patient1.getAge());
System.out.println("Patient Gender: " + patient1.getGender());

    }
}
}