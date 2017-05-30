package ta

class Student {
    String name
    String login
    String githubLogin
    double finalGrade
    List evaluations

    static hasMany = [evaluations :  Evaluation]

    static mapping = {
        sort name : "asc"
    }

    static constraints = {
    }
}
