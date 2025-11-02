package br.edu.satc.todolistcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskData(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    // padronizamos para "complete" porque o seu mock anterior usava esse nome
    val complete: Boolean = false
)
