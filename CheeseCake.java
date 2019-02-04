package week3;

public class CheeseCake implements Command {
	ClientOrder OrderCake;
    public CheeseCake(ClientOrder NewOrder){
	OrderCake = NewOrder;
    }
    public void execute() {
	OrderCake.CheeseCake();
    }
    public void undo() {
	OrderCake.SimpleCake();
    }
}
