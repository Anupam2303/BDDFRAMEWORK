package org.anupam.bddframework.bddframework.StepDefinition;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration(
        classes = {Application.class}
)
@SpringBootTest(
        classes = {Application.class}
)
@RunWith(SpringJUnit4ClassRunner.class)
public @interface BddStepDefinition {

}
