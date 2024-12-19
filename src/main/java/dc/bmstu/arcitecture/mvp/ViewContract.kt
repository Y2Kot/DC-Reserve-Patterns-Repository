package dc.bmstu.arcitecture.mvp

interface ViewContract {
    fun requestStudents()
    fun showMessage(text: String)
    fun showStudents(students: List<Student>)
    fun showSeparator()
}

