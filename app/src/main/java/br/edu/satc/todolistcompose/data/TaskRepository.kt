package br.edu.satc.todolistcompose.data

class TaskRepository(private val dao: TaskDao) {
    suspend fun getAllTasks() = dao.getAllTasks()
    suspend fun insertTask(task: TaskData) = dao.insertTask(task)
    suspend fun updateTask(task: TaskData) = dao.updateTask(task)
    suspend fun deleteTask(task: TaskData) = dao.deleteTask(task)
}
