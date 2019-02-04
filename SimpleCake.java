package week3;

public class SimpleCake implements Command {
	ClientOrder OrderCake;
    public SimpleCake(ClientOrder NewOrder){
	OrderCake = NewOrder;
    }
    public void execute() {
	OrderCake.SimpleCake();
    }
    public void undo() {
	OrderCake.CheeseCake();
	OrderCake.ChoclateCake();
    }
}
