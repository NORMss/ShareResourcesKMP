import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import myshareresourceskmp.composeapp.generated.resources.Res
import myshareresourceskmp.composeapp.generated.resources.compose_multiplatform
import myshareresourceskmp.composeapp.generated.resources.hello_world
import myshareresourceskmp.composeapp.generated.resources.smile_circle_svgrepo_com
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(Res.drawable.smile_circle_svgrepo_com), null)
            Text(
                text = stringResource(Res.string.hello_world)
            )
        }
    }
}