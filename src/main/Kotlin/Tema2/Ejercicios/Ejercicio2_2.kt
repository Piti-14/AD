package Tema2.Ejercicios

import Tema2.Ejemplos.END
import javax.swing.*
import java.awt.*
import java.io.FileInputStream

class Screen : JFrame() {

    val fileLabel = JLabel("File: ")
    val file = JTextField(25)
    val open = JButton("Open")
    val save = JButton("Save")
    val dataLabel = JLabel("Content: ")
    val area = JTextArea(10, 50)
    val scrollPane = JScrollPane(area)

    // en iniciar posem un contenidor per als elements anteriors
    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        layout = GridLayout(2, 1)
        title = "Editor de text"

        val parentPanel1 = JPanel(GridLayout(0, 1))
        val filePanel = JPanel(FlowLayout())
        parentPanel1.add(filePanel)
        filePanel.add(fileLabel)
        filePanel.add(file)

        val contentPanel = JPanel(FlowLayout())
        parentPanel1.add(contentPanel)
        contentPanel.add(open)
        contentPanel.add(save)
        val parentPanel2 = JPanel(GridLayout(0, 1))
        parentPanel2.add(scrollPane)
        area.isEditable = true

        add(parentPanel1)
        add(parentPanel2)
        pack()

        open.addActionListener {
            // Instruccions per a volcar el contingut del fitxer en el JTextArea
            var f = FileInputStream(file.text)
            var buffer = ByteArray(100)
            var bytes = f.read(buffer)

            while (bytes != END) {
                print()
            }
        }

        save.addActionListener {
            // Instruccions per a guardar el contingut del JTextArea al fitxer.

        }
    }
}

private fun createShowWindow() {

    val frame = Screen()
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::createShowWindow)
}