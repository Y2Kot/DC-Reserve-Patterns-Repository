package dc.bmstu.arcitecture.mvp

// Аналог базы данных
class LocalDataSource {
    private val localPool: List<Student> = listOf(
        Student(0, "Ivan Ivanov", "First class"),
        Student(1, "Ivan Sverlov", "First class"),
        Student(2, "Ivan Petrov", "First class"),
        Student(3, "Ivan Bezdrov", "First class"),
        Student(4, "Ivan Vsekov", "First class"),
    )

    fun getStudents(count: Int = 5): List<Student> = localPool
        .shuffled()
        .take(count)
}

// Аналог удалённого сервера
class RemoteDataSource {
    private val remotePool = listOf(
        Student(5, "Petr Ivanov", "Second class"),
        Student(6, "Petr Sverlov", "Second class"),
        Student(7, "Petr Petrov", "Second class"),
        Student(8, "Petr Bezdrov", "Second class"),
        Student(9, "Petr Vsekov", "Second class"),
    )

    fun getStudents(count: Int = 5): List<Student> {
        Thread.sleep(500)
        return remotePool
            .shuffled()
            .take(count)
    }
}
