public class Student {
    //1.
    private String name;
    private String ID;
    private String group;
    private String email;
    //2.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    //3.
    // Them phuong thuc getInfo
    public void getInfo(){
        return (name + "-" + ID + "" + group + "" + email);
    }

    //4.
    // Constructor khong co tham so truyen vao
    public Student() {
        this.name = "Student";
        this.ID = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(Student s){
        this.name = s.name;
        this.ID = s.ID;
        this.group = s.group;
        this.email = s.email;
    }
    public Student (String name, String ID, String email){
        this.name = name;
        this.ID = ID;
        this.group = "K62CB";
        this.email = email;
    }

}
