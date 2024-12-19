package dc.bmstu.behavioral.command.command

class PrintCommand : ICommand {
    override operator fun invoke() {
        println("Printing document.")
    }
}
