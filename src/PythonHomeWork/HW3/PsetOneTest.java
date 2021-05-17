package PythonHomeWork.HW3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PsetOneTest {

    @ParameterizedTest
    @CsvSource({
            "Fiction, 10",
            "Nonfiction, 12.75",
            "Historical, 5.95",
            "Technical, 25.00",
            "Other, 6.00"
    })
    void calculateChargeCorrectValueSingleBook(String type, double price) {
        assertEquals(price, PsetOne.calculateCharge(1, type));
    }

    // test empty string
    @Test
    void calculateChargeEmptyString() {
        assertEquals(0, PsetOne.calculateCharge(1, ""));
    }
    // test null String
    @Test
    void calculateChargeNullString() {
        assertEquals(0, PsetOne.calculateCharge(1, null));
    }

    // test negative books
    @Test
    void calculateChargeNegativeBooks() {
        assertEquals(0, PsetOne.calculateCharge(-2, "Fiction"));
    }

    // FictionBook Test
    @ParameterizedTest
    @CsvSource({
            "2, 20.00",
            "5, 50.00",
            "100, 1000"
    })
    void calculateFictonBookCost(int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, "Fiction"));
    }
// non fiction test
    @ParameterizedTest
    @CsvSource({
            "2, 25.50",
            "5, 63.75",
            "25, 318.75"
    })
    void calculateNonFictonBookCost(int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, "Nonfiction"));
    }
// historical book test multiple items
    @ParameterizedTest
    @CsvSource({
            "2, 11.9",
            "5, 29.75",
            "25, 148.75"
    })
    void calculateHistoricalBookCost(int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, "Historical"));
    }

    // test technical books
    @ParameterizedTest
    @CsvSource({
            "2, 50",
            "5, 125",
            "25, 625"
    })
    void calculateTechnicalBookCost(int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, "Technical"));
    }
// Test other types of books single name
    @ParameterizedTest
    @CsvSource({
            "2, 12",
            "5, 30",
            "25, 150"
    })
    void calculateOtherBookCost(int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, "Random"));
    }

    // test other types of books random book name
    @ParameterizedTest
    @ValueSource(strings = {"Other", "NotABook", "Hello", "romance"})
    void calculateOtherBookCost(String bookType) {
        assertEquals(6, PsetOne.calculateCharge(1, bookType));
    }

    // test of all caps name
    @ParameterizedTest
    @CsvSource({
            "NONFICTION, 12.75",
            "FICTION, 10",
            "HISTORICAL, 5.95",
            "TECHNICAL, 25.00",
            "OTHER, 6"
    })
    void calculateChargeUpperCaseType(String type, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(1, type));
    }

    // calculate charge, multiple books and book types
    @ParameterizedTest
    @CsvSource({
            "fiction, 2, 20",
            "fiction, 3, 30",
            "nonfiction, 4, 51",
            "historical, 3, 17.85",
            "technical, 6, 150",
            "nonfiction, 3, 38.25",
            "fiction, 1, 10",
            "technical, 10, 250",
            "historical, 4, 23.80"
    })
    void calculatePurchaseCharge(String type, int qty, double expected) {
        assertEquals(expected, PsetOne.calculateCharge(qty, type));
    }

    // calculate Total charge
    @Test
    void claculateChargeFromFile() {
        assertEquals(590.90, PsetOne.calculateChargeFromFile("src/PythonHomeWork/HW3/books.txt"));
    }

    // test to check if file write to good source

    // test to check if given a bad option in one input effect on other inputs negtive qty

    // test checking one bad option when reading data null string

    @Test
    void testNullEntryInSet() {
        assertEquals(580.90, PsetOne.calculateChargeFromFile("src/PythonHomeWork/HW3/books.txt"));
    }



}