package ru.job4j.loop;


public class Board {
    String paint(int width, int height){
        StringBuilder builder = new StringBuilder();
        for(int black=0; black<width; black++){
            for (int white = 0; white<height; white++){
                if ((white+black)%2==0){
                    builder.append("x");
                } else {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
