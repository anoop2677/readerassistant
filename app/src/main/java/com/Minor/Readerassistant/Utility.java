package com.Minor.Readerassistant;

/**
 * Created by mayank on 30/07/17.
 */
public class Utility {
    public static String DOCUMENT_CONTENT_MESSAGE = "document.content.message.intent";

    //public static String IP = "http://35.195.235.225";
    public static String IP = "http://104.236.240.59";

    public static String SEARCH_URL = "https://ancient-shore-88784.herokuapp.com/search/keyword?query=";
    public static String QUESTION_URL = IP + "/getquestion?text=";
    public static String CONVERT_PDF_URL = IP + "/convertpdf/html";
    public static String OCR_URL = IP + "/getRelatedConcepts/ocr";

    /**
     * Database Constants
     */
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "p2m.db";


    /**
     * FLASHCARDS DATABASE TABLE
     */
    public static final String FLASHCARDS_TABLE = "flashcards";
    public static final String FLASHCARD_ID = "id"; // we need to use _ID because ID is already used by the system.
    public static final String FLASHCARD_TITLE = "title";
    public static final String FLASHCARD_CONTENT = "content";
    public static final String FLASHCARD_ANSWER = "answer";
    public static final String FLASHCARD_CRCT = "answercrct";
}
