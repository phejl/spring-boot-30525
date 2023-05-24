# spring-boot-30525

1. Run `./gradlew nativeCompile && build/native/nativeCompile/demo`
2. 
```
com.oracle.svm.core.jdk.UnsupportedFeatureError: Runtime reflection is not supported for public java.lang.Object com.example.demo.EnsureIndexesAspect.ensureIndexes(org.aspectj.lang.ProceedingJoinPoint) throws java.lang.Throwable
at org.graalvm.nativeimage.builder/com.oracle.svm.core.util.VMError.unsupportedFeature(VMError.java:89) ~[na:na]
at java.base@17.0.7/java.lang.reflect.Method.acquireMethodAccessor(Method.java:76) ~[demo:na]
at java.base@17.0.7/java.lang.reflect.Method.invoke(Method.java:566) ~[demo:na]
at org.springframework.aop.aspectj.AbstractAspectJAdvice.invokeAdviceMethodWithGivenArgs(AbstractAspectJAdvice.java:637) ~[demo:6.0.9]
at org.springframework.aop.aspectj.AbstractAspectJAdvice.invokeAdviceMethod(AbstractAspectJAdvice.java:627) ~[demo:6.0.9]
at org.springframework.aop.aspectj.AspectJAroundAdvice.invoke(AspectJAroundAdvice.java:71) ~[na:na]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.9]
at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[na:na]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.9]
at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:223) ~[na:na]
at jdk.proxy4/jdk.proxy4.$Proxy49.findAllByUidAndStream(Unknown Source) ~[na:na]
at com.example.demo.ResetRunner.run(ResetRunner.java:28) ~[demo:na]
at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:761) ~[demo:3.1.0]
at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:751) ~[demo:3.1.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[demo:3.1.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1305) ~[demo:3.1.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1294) ~[demo:3.1.0]
at com.example.demo.DemoApplication.main(DemoApplication.java:10) ~[demo:na]

```