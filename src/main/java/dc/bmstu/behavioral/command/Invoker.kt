package dc.bmstu.behavioral.command

import dc.bmstu.behavioral.command.command.ICommand

class Invoker(var command: ICommand) {
    fun execute() {
        println("Executing...")
        command()
    }
}

