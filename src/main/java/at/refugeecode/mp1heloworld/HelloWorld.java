package at.refugeecode.mp1heloworld;

import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

@Component
public class HelloWorld {
    public HelloWorld() {
    }

    public String SayHelloWordl(){
        return "Hello  World";

    }
}
