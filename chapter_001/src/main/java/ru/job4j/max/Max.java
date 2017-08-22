package ru.job4j.max;




public class Max {
    public int max(int first, int second){
       int maximum = (first >= second) ? first : second;
        return maximum;
    }

    public int max(int first, int second, int third){
        return (Math.max(max(first, second),third));
    }
}
