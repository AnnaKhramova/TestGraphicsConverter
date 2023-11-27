package ru.netology.graphics.image;

public class IntCharConverter implements TextColorSchema {
    //Почему-то в консоли получается инверсивная картинка по сравнению с сервером
//    private final char[] SYMBOLS = new char[] {'\'', '-', '+', '*', '%', '@', '$', '#'};
    private final char[] SYMBOLS = new char[] {'#', '$', '@', '%', '*', '+', '-', '\''};
    @Override
    public char convert(int color) {
        return SYMBOLS[color / 32];
    }
}
