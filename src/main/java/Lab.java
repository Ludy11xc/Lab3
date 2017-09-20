
import java.io.IOException;

import java.net.URL;

import java.util.Scanner;


/** Comment.
 * Lab 3
 *
 */
public class Lab {

/**
 *
 * @param input input to retrieve contents
 * @return number of words
 */
    public static int wordCount(final String input) {

        String[] words = input.trim().split("\\s+");

        return words.length;
    }


    /**

     * Retrieve contents from a URL and return them as a string.

     *

     * @param url url to retrieve contents from

     * @return the contents from the url as a string, or an empty string on error

     */



    public static String urlToString(final String url) {

        Scanner urlScanner;

        try {

            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");

        } catch (IOException e) {

            return "";

        }

        String contents = urlScanner.useDelimiter("\\A").next();

        urlScanner.close();

        return contents;

    }
/** Comment.
 * @param args []
 */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        System.out.println(wordCount(urlToString("http://erdani.com/tdpl/hamlet.txt")));

    }

}
