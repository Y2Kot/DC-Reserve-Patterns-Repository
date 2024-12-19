package dc.bmstu.arcitecture.mvp

class View(private val presenter: Presenter) : ViewContract {

    override fun requestStudents() {
        presenter.loadStudents()
    }
    override fun showStudents(students: List<Student>) {
        students.forEach(System.out::println)
    }

    override fun showSeparator() {
        println("----")
    }

    override fun showMessage(text: String) {
        println(text)
    }
}
