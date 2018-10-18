package objectorienteddesign.printingavoice;

import java.util.ArrayList;

public class Invoice {
    private Address billingAddress;
    private ArrayList<LineItem> items = new ArrayList<>();


    public Invoice( Address billingAddress ) {
        this.billingAddress = billingAddress;
    }

    public void add( Product aProduct, int quantity ) {
        LineItem anItem = new LineItem(aProduct, quantity);
        items.add(anItem);
    }

    public String format() {
        String r = " I N V O I C E\n\n" + billingAddress.format() + String
        .format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
        for (LineItem item : items) {
            r = r + item.format() + "\n";
        }
        r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
        return r;
    }

    public double getAmountDue() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "billingAddress=" + billingAddress +
                ", items=" + items +
                '}';
    }
}
