package dc.bmstu.arcitecture.mvp

fun main() {
    // Инициализация зависимостей
    val localDataSource = LocalDataSource()
    val remoteDataSource = RemoteDataSource()
    val model = Model(localDataSource, remoteDataSource)

    val presenter = Presenter(model)
    val view = View(presenter)

    // Прикрепление отображения к presenter
    presenter.attachView(view)

    // Отображение списка локальных пользователей
    view.requestStudents()

    // Отделение отображения от presenter
    presenter.detachView()

}
