package Enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class RunEnum {
    public static void main(String[] args){
        Level level = Level.HIGH;


        if(  level == level.HIGH) {
            System.out.println("Seu nível é alto");
        } else if( level == Level.MEDIUM) {
            System.out.println("Seu nível é médio");
        } else if( level == level.LOW) {
            System.out.println("Seu nível é baixo");
        }

        switch (level){
            case HIGH:  System.out.println("Seu nível é alto");
                        break;
            case MEDIUM: System.out.println("Seu nível é médio");
                        break;
            case LOW:   System.out.println("Seu nível é baixo");
                        break;

        }

        for(Level level1 : Level.values()){
            System.out.println(level1);
        }

        String levelHighText = Level.HIGH.toString();

        Level level2 = Level.valueOf("HIGH");

        System.out.println(level.getLevelCode());

        EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);

        EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.HIGH  , "High level");
        enumMap.put(Level.MEDIUM, "Medium level");
        enumMap.put(Level.LOW   , "Low level");

        String levelValue = enumMap.get(Level.HIGH);
    }
}
