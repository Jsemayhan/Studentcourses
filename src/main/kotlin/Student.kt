import java.util.*

class Student {
    private val firstName: String
    private val lastName: String
    private val gradeYear: Int
    private var studentID: String? = null
    private var courses = ""
    private var balance = 0
    private val costOfCourse = 600

    init {
        val `in` = Scanner(System.`in`)
        println("Enter student first name:")
        firstName = `in`.nextLine()
        println("Enter student last name:")
        lastName = `in`.nextLine()
        println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level:")
        gradeYear = `in`.nextInt()
        setStudentID()
        println("$firstName $lastName $gradeYear $studentID")
    }

    private fun setStudentID() {
        id++
        studentID = gradeYear.toString() + "" + id
    }

    fun enroll() {
        do {
            println("Enter course to enroll(Q to quit): ")
            val `in` = Scanner(System.`in`)
            val course = `in`.nextLine()
            if (course != "Q") {
                courses = """
                    $courses
                    $course
                    """.trimIndent()
                balance += costOfCourse
            } else {
                break
            }
        } while (true)
        println("Enrolled in:$courses")
        println("Balance:$balance")
    }

    private fun viewBalance() {
        println("Your balance is: $$balance")
    }

    fun payTuition() {
        println("Enter your payment: $")
        val `in` = Scanner(System.`in`)
        val payment = `in`.nextInt()
        balance -= payment
        println("Thank you for your payment of $$payment")
        viewBalance()
    }

    override fun toString(): String =
        "Name:$firstName $lastName\nGrade Level:$gradeYear\nStudent ID:$studentID\nCourses Enrolled:$courses\nBalance: $$balance"

    companion object {
        private var id = 1000
    }
}
