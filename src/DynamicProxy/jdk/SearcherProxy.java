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
        //ȡ�ô������ ������Ҫ�󶨽ӿ�(����һ��ȱ�ݣ�cglib�ֲ�����һȱ��)  
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
