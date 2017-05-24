package DynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代
 * 理，cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖
 * 其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。 
 * @author littleevil
 *
 */
public class SearcherProxy implements MethodInterceptor  {
	private Object target;
	
	private void searchBefore() {
		System.out.println("searchBefore");
	}

	private void searchAfter() {
		System.out.println("searchAfter");
	}

	 /** 
     * 创建代理对象 
     * @param target 
     * @return 
     */  
    public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();  
    }  
  
    @Override  
    // 回调方法  
    public Object intercept(Object obj, Method method, Object[] args,  
            MethodProxy proxy) throws Throwable {  
    	searchBefore();
        proxy.invokeSuper(obj, args);  
        searchAfter();
        return null;  
    }  
	
}
