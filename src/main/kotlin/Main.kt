import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.mikepenz.markdown.Markdown

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }


    val markdown = """
/pi        
$\ \ ({e}^{i\pi }+1=0\\)
 $ { ' $ ' } \   \  ({e}^{i\pi }+1=0\\)
\\ ({e}^{i\pi }+1=0\\)
"$"\ ({e}^{i\pi }+1=0\\)
\\({e}^{i\pi }+1=0\\)
/alpha
/ alpha 
/ alpha
//alpha
\alpha
\\alpha
\ alpha 

#pi
##pi
####Test
# pi
\\ pi

""".trimIndent()

//LaTeXAtom().createBox(TeXEnvironment( style = 1,TeXFont = TeXFont.NO_FONT))
    Column(modifier = Modifier.fillMaxSize()) {



        Markdown(
            modifier = Modifier.fillMaxHeight(0.7f),
            content = markdown
        )

        MaterialTheme {
            Button(onClick = {
                text = "Hello, Desktop!"
            }) {
                Text(text)
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        icon = painterResource("ic_function.png")
    ) {
        App()
    }
}
