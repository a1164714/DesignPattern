package DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SearcherProxy implements InvocationHandler {
	private Object target;
	
	private void searchBefore() {
		System.out.println("searchBefore");
	}

	private void searchAfter() {
		System.out.println("searchAfter");
	}
	public Object bind(Object target) {  
        this.target = target;  
        //取得代理对象 ，但是要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  
                target.getClass().getInterfaces(), this);
    }  
  
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		searchBefore();
		Object result = method.invoke(target, args);
		searchAfter();
		return result;
	}
}
