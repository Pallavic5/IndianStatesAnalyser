package com.bridgelabz.censusanalyser;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CodeAnalyzerTest {
	private static final String WRONG_FILE_TYPE_PATH = "src//static//IndianStateCensus";
	private static final String WRONG_DELIMITER_FILE_PATH = "src//static//IndianStateCensus";
	private static final String WITHOUT_HEADER_FILE_PATH = "src//static//IndianStateCensus";
	private static final String WRONG_CSV_FILE_PATH = "src//static//IndianStateCensus";
	private static final String INDIA_CODE_CSV_FILE_PATH = "src//static//IndianStateCensus";

	//TC 1.1
    @Test
    public void given_IndianCodeCSVFile_ReturnsCorrectRecords() {
        try {
        	 CodeAnalyzer codeAnalyser = new CodeAnalyzer();
            int numOfRecords = codeAnalyser.loadIndiaCodeData(INDIA_CODE_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CodeAnalyserException e) { }
    }

    //TC 1.2
    @Test
    public void given_IndiaCodeData_WithWrongFilePath_ShouldThrowException() {
        try {
        	 CodeAnalyzer codeAnalyser = new CodeAnalyzer();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CodeAnalyserException.class);
            codeAnalyser.loadIndiaCodeData(WRONG_CSV_FILE_PATH);
        } catch (CodeAnalyserException e) {
            Assert.assertEquals(CodeAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    //TC 1.3
    @Test
    public void given_IndiaCodeData_WithWrongFileType_ShouldThrowException() {
        try {
            CodeAnalyzer codeAnalyser = new CodeAnalyzer();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CodeAnalyserException.class);
            codeAnalyser.loadIndiaCodeData(WRONG_FILE_TYPE_PATH);
        } catch (CodeAnalyserException e) {
            Assert.assertEquals(CodeAnalyserException.ExceptionType.WRONG_FILE_TYPE, e.type);
        }
    }

    //TC 1.4
    @Test
    public void given_IndiaCodeData_WithWrongFileDelimiter_ShouldThrowException() {
        try {
            CodeAnalyzer codeAnalyser = new CodeAnalyzer();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CodeAnalyserException.class);
            codeAnalyser.loadIndiaCodeData(WRONG_DELIMITER_FILE_PATH);
        } catch (CodeAnalyserException e) {
            Assert.assertEquals(CodeAnalyserException.ExceptionType.INCORRECT_DELIMITER_OR_HEADER, e.type);
        }
    }

    //TC 1.5
    @Test
    public void given_IndiaCodeData_WithoutHeader_ShouldThrowException() {
        try {
        	 CodeAnalyzer codeAnalyser = new CodeAnalyzer();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CodeAnalyserException.class);
            codeAnalyser.loadIndiaCodeData(WITHOUT_HEADER_FILE_PATH);
        } catch (CodeAnalyserException e) {
            Assert.assertEquals(CodeAnalyserException.ExceptionType.INCORRECT_DELIMITER_OR_HEADER, e.type);
        }
    }
}
