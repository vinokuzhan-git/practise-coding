package com.system.design.low.level.design.pattern.singletonpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ExecutorService executorService = Executors.newFixedThreadPool(10);  
	      /*  executorService.execute(new Runnable() {  
	              
	            @Override  
	            public void run() {  
	                System.out.println(Thread.currentThread().getName() + " : ExecutorService");  
	                  
	            }  
	        }); */ 
		 for(int i=0;i<10;i++)
			 executorService.execute(() -> {
				 Employee emp = Employee.getInstance();
				 emp.setName(emp.getName()+1);
				 emp.setId(emp.getId()+1);
				 System.out.println(Thread.currentThread().getName() + " Name : "+emp.getName()+" Id : "+emp.getId());
			 });
			 
	        executorService.shutdown();

	}

}
