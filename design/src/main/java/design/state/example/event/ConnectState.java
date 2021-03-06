package design.state.example.event;

/**
 * <h3>概要:</h3><p>ConnectState</p>
 * <h3>功能:</h3><p>ConnectState</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class ConnectState implements State {
    @Override
    public void pre(Context c) {
        c.setState(new UnconnectState());
    }

    @Override
    public void next(Context c) {
        c.setState(new RegistingState());
    }

    @Override
	public void disconnect(Context c) {
    	c.setState(new UnconnectState());
	}
    
    @Override
    public String getCurState() {
        return EventEnum.CONNECT.toString();
    }

}