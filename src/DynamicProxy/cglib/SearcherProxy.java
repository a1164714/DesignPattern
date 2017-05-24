package DynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * JDK�Ķ�̬�������ֻ�ܴ���ʵ���˽ӿڵ��࣬������ʵ�ֽӿڵ���Ͳ���ʵ��JDK�Ķ�̬��
 * ��cglib���������ʵ�ִ���ģ�����ԭ���Ƕ�ָ����Ŀ��������һ�����࣬������
 * ���з���ʵ����ǿ������Ϊ���õ��Ǽ̳У����Բ��ܶ�final���ε�����д��� 
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
     * ����������� 
     * @param target 
     * @return 
     */  
    public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // �ص�����  
        enhancer.setCallback(this);  
        // �����������  
        return enhancer.create();  
    }  
  
    @Override  
    // �ص�����  
    public Object intercept(Object obj, Method method, Object[] args,  
            MethodProxy proxy) throws Throwable {  
    	searchBefore();
        proxy.invokeSuper(obj, args);  
        searchAfter();
        return null;  
    }  
	
}
