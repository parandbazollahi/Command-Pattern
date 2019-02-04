package week3;

public class ChoclateCake implements Command {
	ClientOrder OrderCake;
    public ChoclateCake(ClientOrder NewOrder){
    	OrderCake = NewOrder;
    }
    public void execute() {
    	OrderCake.ChoclateCake();
    }
    // Do the opposite of execute()
    public void undo() {
    	OrderCake.SimpleCake();
    }
}
