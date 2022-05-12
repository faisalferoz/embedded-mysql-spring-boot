package io.github.liuyuyu.embedded.mysql.demo;

import java.util.Arrays;

import org.junit.Test;

import com.wix.mysql.distribution.Version;

public class SimpleJunitTest {
    @Test
    public void printMySQLVersion(){
        Arrays.stream(Version.values())
                .map(Enum::name)
                .forEach(System.out::println);
    }
}
