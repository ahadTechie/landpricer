package com.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

@SuppressWarnings("deprecation")
public class GoogleSheetsUtility {

    private static final String APPLICATION_NAME = "Google Sheets Integration";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String CREDENTIALS_FILE_PATH = "/Users/abdulahad/eclipse-workspace/seleniumAutomation/cosmic-palace-427009-h8-6bac3278d8dd.json";

    // Utility Method to Read and Increment Count from Google Sheets
    public  int getCountAndIncrement(String spreadsheetId, String range) {
        int currentCount = 0;
        int newCount = 0;

        try {
            // Build a new authorized API client service
            Sheets service = getSheetsService();

            // Get the current value from the specified range
            ValueRange response = service.spreadsheets().values()
                    .get(spreadsheetId, range)
                    .execute();
            List<List<Object>> values = response.getValues();

            if (values != null && !values.isEmpty() && !values.get(0).isEmpty()) {
                currentCount = Integer.parseInt(values.get(0).get(0).toString());
            }

            // Increment the value
            newCount = currentCount + 1;

            // Write the updated value back to the sheet
            ValueRange body = new ValueRange()
                    .setValues(Collections.singletonList(Collections.singletonList(newCount)));
            service.spreadsheets().values()
                    .update(spreadsheetId, range, body)
                    .setValueInputOption("RAW")
                    .execute();

            System.out.println("Updated count saved to Google Sheet: " + newCount);
        } catch (IOException | GeneralSecurityException | NumberFormatException e) {
            System.out.println("Error handling Google Sheet: " + e.getMessage());
        }

        return currentCount;
    }

    // Method to initialize Google Sheets API client
    private Sheets getSheetsService() throws IOException, GeneralSecurityException {
        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(CREDENTIALS_FILE_PATH))
                .createScoped(Collections.singletonList(SheetsScopes.SPREADSHEETS));
        return new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, new HttpCredentialsAdapter(credentials))
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
}
