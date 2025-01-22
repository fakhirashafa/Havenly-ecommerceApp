package com.example.havenlyfashion;

import java.util.ArrayList;

public class HistoryData {

    private static String [] historyInvoice = {

    };
    private static String [] historyName = {

    };

    private static String [] historyPrice = {

    };

    private static int [] historyImage = {

    };
    public static ArrayList<History> getHistoryList() {
        ArrayList<History> list = new ArrayList<>();

        for (int i = 0; i < historyName.length; i++) {
            String name = historyName[i];
            String price = historyPrice[i];
            String invoice = historyInvoice[i];
            int image = historyImage[i];

            History history = new History(invoice, name, price, image);
            list.add(history);
        }

        return list;
    }
}
