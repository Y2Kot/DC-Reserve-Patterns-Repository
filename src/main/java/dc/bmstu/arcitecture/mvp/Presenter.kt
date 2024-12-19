package dc.bmstu.arcitecture.mvp

class Presenter(private val model: Model) {
    private var viewContract: ViewContract? = null

    fun attachView(viewContract: ViewContract) {
        this.viewContract = viewContract
    }

    fun loadStudents() {
        viewContract?.showMessage("Loading data...")
        viewContract?.showStudents(model.getStudents())
        viewContract?.showSeparator()
    }

    fun detachView() {
        this.viewContract = null
    }
}
