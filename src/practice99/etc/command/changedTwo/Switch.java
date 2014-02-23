package practice99.etc.command.changedTwo;

import java.util.Stack;

/*the Invoker class*/
public class Switch {
	private Command flipUpCommand;
	private Command flipDownCommand;
	private Stack undo = new Stack();

	public Switch(Command flipUpCmd, Command flipDownCmd) {
		this.flipUpCommand = flipUpCmd;
		this.flipDownCommand = flipDownCmd;
	}

	public void flipUp() {
		flipUpCommand.execute();
		undo.push(flipUpCommand);
	}

	public void flipDown() {
		flipDownCommand.execute();
		undo.push(flipDownCommand);
	}

	public void undo() {
		((Command) undo.pop()).undo();
	}
}
