class Student {
    String name;
    double grade;
    int stdnum;
    
    public boolean equals(Student s) {
        if(grade == s.grade) return true;
        else return false;
    }
}
