package dc.bmstu.behavioral.command.command

class ScanCommand : ICommand {
    override operator fun invoke() {
        println("Scanning document.")
    }
}
