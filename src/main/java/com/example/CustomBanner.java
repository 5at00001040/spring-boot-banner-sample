package com.example;

import java.io.PrintStream;
import java.util.Random;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.env.Environment;

import com.github.ricksbrown.cowsay.Cowsay;

public class CustomBanner implements Banner {

    private static final String SEPARATOR = System.getProperty("line.separator");

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {

        String[] charList = Cowsay.say(new String[]{"-l"}).split(SEPARATOR);
        Random rand = new Random();
        int sayChar = rand.nextInt(charList.length);

        String version = SpringBootVersion.getVersion();
        String[] args = new String[]{"-f", charList[sayChar], "Spring Boot "  + version};
        String result = Cowsay.say(args);

        printStream.println(result);

    }

}
