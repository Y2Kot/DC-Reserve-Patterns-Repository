package dc.bmstu.behavioral.command.command

class CopyCommand : ICommand {
    override operator fun invoke() {
        println("Copying document.")
    }
}
