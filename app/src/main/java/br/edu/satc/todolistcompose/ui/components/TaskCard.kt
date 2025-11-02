package br.edu.satc.todolistcompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.edu.satc.todolistcompose.data.TaskData

/**
 * TaskCard agora recebe onTaskCheckedChange: (TaskData) -> Unit
 * para que ao mudar o checkbox nós enviemos a TaskData atualizada ao ViewModel.
 */
@Composable
fun TaskCard(
    taskData: TaskData,
    onTaskCheckedChange: (TaskData) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = taskData.title, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = taskData.description, style = MaterialTheme.typography.bodyMedium)
            }

            Checkbox(
                checked = taskData.complete, // usa "complete"
                onCheckedChange = { checked ->
                    // quando o checkbox muda, retornamos a TaskData atualizada
                    onTaskCheckedChange(taskData.copy(complete = checked))
                }
            )
        }
    }
}
