package com.bridgelabz.censusanalyser;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CodeAnalyzer {
	static int numberOfEntries = 0;
//    public int loadIndiaCodeData(String csvFilePath) throws CodeAnalyserException {
//        try {
//            Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
//            CsvToBeanBuilder csvToBeanBuilder = new CsvToBeanBuilder();
//            csvToBeanBuilder.withType(IndiaCodeCSV.class);
//            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
//            CsvToBean csvToBean = csvToBeanBuilder.build();
//            Iterator<IndiaCodeCSV> codeCSVIterator = csvToBean.iterator();;
//            while (codeCSVIterator.hasNext()) {
//                numberOfEntries++;
//                IndiaCodeCSV codeData = codeCSVIterator.next();
//            }
//            return numberOfEntries;
//        }
//        catch (NoSuchFileException e) {
//            if(!csvFilePath.contains(".csv")) {
//                throw new CodeAnalyserException(e.getMessage(), CodeAnalyserException.ExceptionType.WRONG_FILE_TYPE);
//            }
//        }
//        catch (IOException e) {
//            throw new CodeAnalyserException(e.getMessage(),
//                    CodeAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
//        }
//        catch (RuntimeException e) {
//            throw new CodeAnalyserException(e.getMessage(), CodeAnalyserException.ExceptionType.INCORRECT_DELIMITER_OR_HEADER);
//        }
//        return numberOfEntries;
//    }
	
}
