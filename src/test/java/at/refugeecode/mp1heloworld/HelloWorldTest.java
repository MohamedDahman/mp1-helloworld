package at.refugeecode.mp1heloworld;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {

    HelloWorld helloWorld;

    @Test
    void sayHelloWordl() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello  World", helloWorld.SayHelloWordl());
    }
}