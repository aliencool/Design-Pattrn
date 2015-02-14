package chainofresponsibility;

public abstract class HandlerChain {
	protected HandlerChain handlerChain;
	protected void setHandlerChain(HandlerChain handlerChain)
	{
		this.handlerChain = handlerChain ;
	}
	abstract protected void Next(int n);
}
