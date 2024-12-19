package dc.bmstu.behavioral.command

import dc.bmstu.behavioral.command.command.CopyCommand
import dc.bmstu.behavioral.command.command.PrintCommand
import dc.bmstu.behavioral.command.command.ScanCommand

fun main() {
    val copyCommand = CopyCommand()
    val scanCommand = ScanCommand()
    val printCommand = PrintCommand()

    val printer = Invoker(copyCommand)
    printer.execute()

    printer.command = scanCommand
    printer.execute()

    printer.command = printCommand
    printer.execute()
}

