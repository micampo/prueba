package com.co.konex.runner;

import com.co.konex.utils.BeforeSuite;
import lombok.SneakyThrows;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunnerPersonalizado  extends Runner {


    private Class<CucumberWithSerenity> classValue;
    private CucumberWithSerenity cucumberWithSerenity;

    @SneakyThrows
    public RunnerPersonalizado(Class<CucumberWithSerenity> classValue){
        this.classValue = classValue;
        cucumberWithSerenity = new CucumberWithSerenity(classValue);
    }




    @Override
    public Description getDescription() {
        return cucumberWithSerenity.getDescription();
    }


    @SneakyThrows
    private void runAnnotatedMethods(Class<?> annotation){
        if (!annotation.isAnnotation()){
            return;
        }
        Method[] methods = this.classValue.getMethods();
        for (Method method: methods){
            Annotation[] annotations = method.getAnnotations();
            for (Annotation item : annotations){
                if (item.annotationType().equals(annotation)){
                    method.invoke(null);
                    break;
                }
            }
        }
    }


    @Override
    @SneakyThrows
    public void run(RunNotifier notifier) {
      runAnnotatedMethods(BeforeSuite.class);
      cucumberWithSerenity = new CucumberWithSerenity(classValue);
      cucumberWithSerenity.run(notifier);
    }
}
