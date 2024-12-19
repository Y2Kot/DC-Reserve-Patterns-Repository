package dc.bmstu.arcitecture.mvp

import kotlin.random.Random

class Model(
    private val local: LocalDataSource,
    private val remote: RemoteDataSource,
) {
    private fun getLocalStudents(): List<Student> = local.getStudents()

    private fun getRemoteStudents(): List<Student> = remote.getStudents()

    fun getStudents(): List<Student> = if (Random.Default.nextBoolean()) {
        getLocalStudents()
    } else {
        getRemoteStudents()
    }
}
