package com.telran.summary.summary19.translator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    private static Dictionary dictionary;

    @BeforeEach
    private void init() {
        TranslatorFileWriter writer = new TranslatorFileWriter();
        TranslatorFileReader reader = new TranslatorFileReader();
        dictionary = new Dictionary(writer, reader);
    }

    @Test
    public void testAddWordToDictionary() {
        String original = "Привет";
        String translate = "Hallo";
        String notTranslated = dictionary.getTranslate(Language.GERMAN, original);
        assertEquals(original, notTranslated);
        dictionary.update(original, translate, Language.GERMAN);
        String translated = dictionary.getTranslate(Language.GERMAN, original);
    }
}