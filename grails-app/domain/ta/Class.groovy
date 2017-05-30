package ta

class Class {
    List<Student> students
    List<Goal> goals
    String description

    static hasMany = [students: Student, goals: Goal]

    static constraints = {
        students nullable : true
        goals nullable : true
    }
}
