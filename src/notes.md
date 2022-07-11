1. First JVM gets loaded Main method gets executed  
1. ApplicationContext is loaded  
1. ApplicationContext reads xml configuration file  
1. ApplicationContext pre-loads one object for each bean in the config file  
                               if the bean is not marked as lazy-init= "true"  
1. lazy-init="true" This informs springContainer not to pre-load object for   
            this bean By default Spring early  loads objects in memory.  
1. For lazy-init beans object is created only when the getBean() method is called.   
1. For pre-init beans getBean() returns the reference of the pre-loaded object  
1. By default only one object for every bean is created (singleton)  
1. singleton: Atleast one object for every class but not more than one object   
1. Spring for lazy-init beanscreates a singleton object on firstcall of getBeans () method  
   and then uses that object for future getBean() method calls  

---  

##  Prototype  

Prototype beans are by default lazy-init    
Prototype are not singleton    
A new object is created for prototype when getBean() is called everytime  
  
```xml
	<bean id="c2" class ="com.chainsys.projectA.beans.Actor"  scope="prototype" ></bean>  
```

---

## Bean with parameterize constructor

```xml
		<bean id="film" class ="com.chainsys.projectA.beans.Movie" >
		<constructor-arg type="java.lang.String" value="Batman" /> 	
		<constructor-arg type="java.lang.String" value="Matt Reeves" />	
```

---  

## Factory Method

```xml
	
```